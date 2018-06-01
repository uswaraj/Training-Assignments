/**
 * 
 */
package com.uswarajsoft;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class contains  static method to handle dates.
 * @author udakhe.swaraj
 *
 */
public class DateUtil {

	public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	/**
	 * This method converts String date into Date object.
	 * @param dateAsString String formatted date(ex. 01/06/2018 : DD/MM/YYYY);
	 * @return a Date Object for input Date String.
	 */
	public static Date stringToDate(String dateAsString) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			return df.parse(dateAsString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * This method converts Date object into String.
	 * @param date Date object to be converted to String
	 * @return String date in DD/MM/YYYY format.
	 */
	public static String dateToString(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(date);

	}
	
	/**
	 * The method returns Year and Month from given date in Year, Month format :
	 * Ex. 2017,06; 2018,02 so on..   
	 * @param date year and month will be extracted for this date
	 * @return year and month for input date.
	 */
	public static String getYearAndMonth(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy,MM");//Ex. 2017,06; 2018,02 so on..
		return df.format(date);
	}
	
	/**
	 * Returns a Year for input date.
	 * @param date
	 * @return
	 */
	public static Integer getYear(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy");//Ex. 2017,06; 2018,02 so on..
		return new Integer(df.format(date));
	}
	
	/**
	 * The method returns Month name for given month number.
	 * 01: Jan, 02: Feb.....12 : Dec
	 * @param monthNo any month number between 1 to 12
	 * @return month name for input month number.
	 */
	public static String getMonthName(Integer monthNo) {
		return MONTHS[monthNo-1];
	}
}
