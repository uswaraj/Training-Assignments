/**
 * 
 */
package com.uswarajsoft;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author udakhe.swaraj
 *
 */
public class PEMReportService {

	Repository repository = Repository.getRepository();
	
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
				//this month is not yet added, so add here
				m.put(year, exp.getAmount());
			}
		}
		
		return m;
	}
	
	public Map<Integer, Float> calculateCategorizedTotal(){
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
				//this month is not yet added, so add here
				m.put(year, exp.getAmount());
			}
		}
		
		return m;
	}
}
