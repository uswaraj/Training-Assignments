/**
 * 
 */
package com.uswarajsoft;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * The class contain most of the operation related to PEM application.
 * <p>
 * This class prepares a menu and various method are present to handle the user action.
 * The class make use of <code>Repository</code> to store the data. 
 * Also using <code>ReportService</code> to generate different required reports. 
 * @author udakhe.swaraj
 *
 */
public class PEMService {
	/**
	 * Declare a reference of repository by calling a static method. This static method which returns a singleton repository object.
	 */
	private Repository repository = Repository.getRepository();
	
	/**
	 * Declare a reference of ReportService to call different methods to calculate Reports
	 */
	PEMReportService reportService = new PEMReportService();

	/**
	 * This is a Scanner object to take standard input from keyboard. 
	 */
	private Scanner in = new Scanner(System.in);
	
	/**
	 * This varaible stores the value of menu-choice.
	 */
	private int choice;

	/**
	 * Call this constructor to create PEMService object with default details.
	 */
	public PEMService() {
		//prepareSampleData(); // TODO: Delete this method call after testing is over.
	}

	/**
	 * This method prepares a PEMApp menu using switch-case and infinite loop, also ask for user choice
	 */
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

	/**
	 * This method prints a menu(CUI/CLI menu).
	 */
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
	
	/**
	 * This is method is called to hold a output screen after processing the requested task 
	 * and wait for any char input to continue to the menu. .
	 */
	public void pressAnyKeyToContinue() {

		try {
			System.out.println("Press any key to continue...");
			System.in.read();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/**
	 * This method is taking expense category name as input to add new category in system. 
	 */
	public void onAddCategory() {
		in.nextLine();// new line character is read here which is already
						// present in stream and its not in used now.
		System.out.print("Enter Category Name: ");
		String catName = in.nextLine();
		Category cat = new Category(catName);
		repository.catList.add(cat);
		System.out.println("Success : Category added");
	}

	/**
	 * Call this method to print existing category list.
	 */
	public void onCategoryList() {
		System.out.println("Category List..");
		List<Category> cList = repository.catList;
		for (int i = 0; i < repository.catList.size(); i++) {
			Category category = cList.get(i);
			System.out.println((i + 1) + ". " + category.getName() + ", " + category.getCategoryId());
		}
	}

	/**
	 * Call this method to enter expense details. the entered details will be added to the repository.
	 */
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

		System.out.println("Enter date(DD/MM/YYYY): ");
		String dateAsString = in.nextLine();
		Date date = DateUtil.stringToDate(dateAsString);

		// Add Expense detail in Expense Object
		Expense expense = new Expense();
		expense.setCategoryId(selectedCat.getCategoryId());
		expense.setAmount(amount);
		expense.setRemark(remark);
		expense.setDate(date);

		// store expense object in repository
		repository.expList.add(expense);
		System.out.println("Success: Expense Added");

	}

	/**
	 * The method prints all entered expenses.
	 */
	public void onExpenseList() {
		System.out.println("Expense list");
		List<Expense> expList = repository.expList;
		for (int i = 0; i < repository.expList.size(); i++) {
			Expense expense = expList.get(i);
			String catName = reportService.getCategoryNameById(expense.getCategoryId());
			String dateString = DateUtil.dateToString(expense.getDate());
			System.out.println((i + 1) + ". " + catName + ", " + expense.getAmount() + ", " + expense.getRemark() + ", "
					+ dateString);
		}
	}

	/**
	 * This methos is called form menu to prepare month-wise expense total. 
	 * Its using <code>reportService</code> to calculate report. 
	 * The returned result is printed by this method. Means this method invokes a call to generate report then result is printed by this method
	 */
	public void onMonthlyExpenseList() {
		System.out.println("Monthly expense total");
		Map<String, Float> resultMap = reportService.calculateMonthlyTotal();
		Set<String> keys = resultMap.keySet();
		for (String yearMonth : keys) {
			// 2017, 06
			String[] arr = yearMonth.split(",");
			String year = arr[0];
			Integer monthNo = new Integer(arr[1]);
			String monthName = DateUtil.getMonthName(monthNo);
			System.out.println(year + ", " + monthName + " : " + resultMap.get(yearMonth));
		}
	}

	/**
	 * This method is called form menu to prepare year-wise expense total. 
	 * Its using <code>reportService</code> to calculate report. 
	 * The returned result is printed by this method. Means this method invokes a call to generate report then result is printed by this method
	 */
	public void onYearlyExpenseList() {
		System.out.println("Yearly expense Total");
		Map<Integer, Float> resultMap = reportService.calculateYearlyTotal();
		Set<Integer> years = resultMap.keySet();
		Float total = 0.0F;
		for (Integer year : years) {
			Float exp = resultMap.get(year);
			total = total + exp;
			System.out.println(year + " : " + exp);
		}
		System.out.println("-------------------------------");
		System.out.println("Total Expense(INR) : " + total);
	}

	/**
	 * This method is called form menu to prepare category-wise expense total. 
	 * Its using <code>reportService</code> to calculate report. 
	 * The returned result is printed by this method. Means this method invokes a call to generate report then result is printed by this method
	 */
	public void onCategorizedExpenseList() {
		System.out.println("Category wise expense list");
		Map<String, Float> resultMap = reportService.calculateCategorizedTotal();
		Set<String> categories = resultMap.keySet();
		Float netTotal = 0.0F;
		for (String categoryName : categories) {
			Float catWiseTotal = resultMap.get(categoryName);
			netTotal = netTotal+catWiseTotal;
			System.out.println(categoryName + " : " + catWiseTotal);
		}
		System.out.println("-------------------------------------");
		System.out.println("Net Total : " + netTotal);
	}

	/**
	 * This method stop a JVM. Simply it's closing application.
	 */
	public void onExit() {
		System.exit(0);
	}

	/**
	 * This method is preparing sample data for testing purpose. 
	 * It should be report once app is tested OK.
	 */
	public void prepareSampleData() {
		Category catParty = new Category("Party");
		delay();
		Category catShopping = new Category("Shopping");
		delay();
		Category catGift = new Category("Gifts");

		repository.catList.add(catParty);
		repository.catList.add(catShopping);
		repository.catList.add(catGift);

		// Jun-2017
		Expense e1 = new Expense(catParty.getCategoryId(), 5000.0F, DateUtil.stringToDate("01/06/2017"), "Good");
		delay();
		Expense e2 = new Expense(catShopping.getCategoryId(), 15000.0F, DateUtil.stringToDate("08/06/2017"),
				"Fantastic");
		delay();
		Expense e3 = new Expense(catGift.getCategoryId(), 500.0F, DateUtil.stringToDate("28/06/2017"), "Average");
		delay();

		// Dec-2017
		Expense e4 = new Expense(catParty.getCategoryId(), 100.0F, DateUtil.stringToDate("31/12/2017"), "Fantastic");
		delay();

		// Feb-2018
		Expense e5 = new Expense(catShopping.getCategoryId(), 1000.0F, DateUtil.stringToDate("16/02/2018"),
				"Very Well");
		delay();

		// Feb-2018
		Expense e6 = new Expense(catShopping.getCategoryId(), 2000.0F, DateUtil.stringToDate("21/02/2018"), "Nice");
		delay();

		// Apr-2018
		Expense e7 = new Expense(catGift.getCategoryId(), 1000.0F, DateUtil.stringToDate("11/04/2018"), "average");
		delay();

		// Apr-2018
		Expense e8 = new Expense(catGift.getCategoryId(), 1500.0F, DateUtil.stringToDate("25/04/2018"), "Bad");

		// May-2015
		Expense e9 = new Expense(catGift.getCategoryId(), 3546.0F, DateUtil.stringToDate("31/05/2015"), "Bad");

		repository.expList.add(e1);
		repository.expList.add(e2);
		repository.expList.add(e3);
		repository.expList.add(e4);
		repository.expList.add(e5);
		repository.expList.add(e6);
		repository.expList.add(e7);
		repository.expList.add(e8);
		repository.expList.add(e9);
	}

	/**
	 * The Method sleep a thread sleep for 10ms.
	 */
	private void delay() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
