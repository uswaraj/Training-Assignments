/**
 * 
 */
package com.uswarajsoft;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * The class contains various method to calculte PEM App reports.
 * @author udakhe.swaraj
 *
 */
public class PEMReportService {

	/**
	 * Declare a reference of singleton repository.
	 */
	Repository repository = Repository.getRepository();
	
	/**
	 * The method calculates month-wise total and returns result in Map.
	 * Its preparing data in proper order.
	 * @return
	 */
	public Map<String, Float> calculateMonthlyTotal(){
		Map<String, Float> m = new TreeMap<>();
		
		for (Expense exp: repository.expList) {
			Date expDate = exp.getDate();
			String yearMonth = DateUtil.getYearAndMonth(expDate);
			if (m.containsKey(yearMonth)) {
				//when expense is already present in a month
				Float total = m.get(yearMonth);
				total = total+exp.getAmount();
				m.put(yearMonth, total);//new total; Replace old total
			}
			else {
				//this month is not yet added, so add here
				m.put(yearMonth, exp.getAmount());
			}
		}
		
		return m;
	}
	
	/**
	 * The method calculates year-wise total and returns result in Map.
	 * Its preparing data in proper order.
	 * @return
	 */
	public Map<Integer, Float> calculateYearlyTotal(){
		Map<Integer, Float> m = new TreeMap<>();
		
		for (Expense exp: repository.expList) {
			Date expDate = exp.getDate();
			Integer year = DateUtil.getYear(expDate);
			if (m.containsKey(year)) {
				//when expense is already present in a year
				Float total = m.get(year);
				total = total+exp.getAmount();
				m.put(year, total);//new total; Replace old total
			}
			else {
				//this year is not yet added, so add here
				m.put(year, exp.getAmount());
			}
		}
		
		return m;
	}
	
	/**
	 * The method calculates category-wise total and returns result in Map.
	 * Its preparing data in proper order.
	 * @return
	 */
	public Map<String, Float> calculateCategorizedTotal(){
		Map<String, Float> m = new TreeMap<>();
		
		for (Expense exp: repository.expList) {
			Long categoryId = exp.getCategoryId();
			String catName = this.getCategoryNameById(categoryId);
			if (m.containsKey(catName)) {
				//when expense is already present in a category
				Float total = m.get(catName);
				total = total+exp.getAmount();
				m.put(catName, total);//new total; Replace old total
			}
			else {
				//this month is not yet added, so add here
				m.put(catName, exp.getAmount());
			}
		}
		
		return m;
	}
	
	/**
	 * The method returns category name for given categoryId. Returns null when wrong category Id is pass.
	 * @param categoryId
	 * @return
	 */
	public String getCategoryNameById(Long categoryId) {
		for (Category category : repository.catList) {
			if (category.getCategoryId().equals(categoryId)) {
				return category.getName();
			}
		}
		return null;// no such categoryId present.
	}
}
