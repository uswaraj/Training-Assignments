/**
 * 
 */
package com.uswarajsoft;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author udakhe.swaraj
 *
 */
public class PEMService {
	Repository repository = Repository.getRepository();
	private Scanner in = new Scanner(System.in);
	private int choice;

	public void showMenu() {
		while (true) {
			printMenu();
			switch (choice) {
			case 1:
				onAddCategory();
				pressAnyKeyToContinue();
				break;

			case 2:
				onCategoryList();
				pressAnyKeyToContinue();
				break;

			case 3:
				onExpenseEntry();
				pressAnyKeyToContinue();
				break;

			case 4:
				onExpenseList();
				pressAnyKeyToContinue();
				break;

			case 5:
				onMonthlyExpenseList();
				pressAnyKeyToContinue();
				break;

			case 6:
				onYearlyExpenseList();
				pressAnyKeyToContinue();
				break;

			case 7:
				onCategorizedExpenseList();
				pressAnyKeyToContinue();
				break;

			case 0:
				onExit();
				break;

			}
		}
	}

	public void printMenu() {
		System.out.println("-------PEM Menu-------");
		System.out.println("1. Add Category");
		System.out.println("2. Category List");
		System.out.println("3. Expense Entry");
		System.out.println("4. Expense List");
		System.out.println("5. Monthly Expense List");
		System.out.println("6. Yearly Expense List");
		System.out.println("7. Categorized Expense List");
		System.out.println("0. Exit ");
		System.out.println("----------------------------");
		System.out.println("Enter Your Choice:");
		choice = in.nextInt();
	}

	public void onAddCategory() {
		in.nextLine();// new line character is read here which is already
						// present in stream and its not in used now.
		System.out.print("Enter Category Name: ");
		String catName = in.nextLine();
		Category cat = new Category(catName);
		repository.catList.add(cat);
		System.out.println("Success : Category added");
	}

	public void onCategoryList() {
		System.out.println("Category List..");
		List<Category> cList = repository.catList;
		for (int i = 0; i < repository.catList.size(); i++) {
			Category category = cList.get(i);
			System.out.println((i + 1) + ". " + category.getName() + ", " + category.getCategoryId());
		}
	}

	public void onExpenseEntry() {
		System.out.println("Enter Details for Expense Entry...");
		onCategoryList();
		System.out.println("Choose Category: ");
		int catChoice = in.nextInt();
		Category selectedCat = repository.catList.get(catChoice - 1);

		System.out.print("Enter Amount: ");
		float amount = in.nextFloat();
		
		System.out.print("Enter Remark: ");
		in.nextLine();
		String remark = in.nextLine();
		
//		System.out.println("Enter date");
		//TODO : Date can be taken fro user input.
		Date date = new Date();
		
		//Add Expense detail in Expense Object
		Expense expense = new Expense();
		expense.setCategoryId(selectedCat.getCategoryId());
		expense.setAmount(amount);
		expense.setRemark(remark);
		expense.setDate(date);
		
		//store expense object in repository
		repository.expList.add(expense);
		System.out.println("Success: Expense Added");
		
	}

	public void onExpenseList() {
		System.out.println("Expense list");
		List<Expense> expList = repository.expList;
		for (int i = 0; i < repository.expList.size(); i++) {
			Expense expense = expList.get(i);
			String catName = getCategoryNameById(expense.getCategoryId());
			System.out.println((i+1) + ". " + catName + ", " + expense.getAmount() + ", " + expense.getRemark() + ", " + expense.getDate());
		}
	}

	public void onMonthlyExpenseList() {
		// TODO Auto-generated method stub
		System.out.println("Monthly expense list");
	}

	public void onYearlyExpenseList() {
		// TODO Auto-generated method stub
		System.out.println("Yearly expense list");
	}

	public void onCategorizedExpenseList() {
		// TODO Auto-generated method stub
		System.out.println("Category wise expense list");
	}

	public void onExit() {
		System.exit(0);
	}
	
	String getCategoryNameById(Long categoryId){
		for (Category category : repository.catList) {
			if (category.getCategoryId().equals(categoryId)) {
				return category.getName();
			}
		}
		return null;//no such categoryId present.
	}

	public void pressAnyKeyToContinue() {

		try {
			System.out.println("Press any key to continue...");
			System.in.read();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
