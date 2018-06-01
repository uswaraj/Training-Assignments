/**
 * 
 */
package com.uswarajsoft;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author udakhe.swaraj
 *
 */
public class DateUtil {

	public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	public static Date stringToDate(String dateAsString) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			return df.parse(dateAsString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String dateToString(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(date);

	}
	
	public static String getYearAndMonth(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy,MM");//Ex. 2017,06; 2018,02 so on..
		return df.format(date);
	}
	
	public static Integer getYear(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy");//Ex. 2017,06; 2018,02 so on..
		return new Integer(df.format(date));
	}
	
	public static String getMonthName(Integer monthNo) {
		return MONTHS[monthNo-1];
	}
}
