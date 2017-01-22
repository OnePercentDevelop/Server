package com.onepercent.server.model;

import java.util.Date;

public class DateModel {
	private static DateModel dateModel = new DateModel();

	public static DateModel getDateModel() {
		return dateModel;
	}
	public String todayDate() {
		Date date = new Date();
		String today_date = "";
		int year = 1900+date.getYear();
		int month = date.getMonth()+1;
		int day = date.getDate();
		today_date = ""+year+".";
		today_date += month/10 > 0 ? ""+month+"." : "0"+month+".";
		today_date += day/10 > 0 ? ""+day+"" : "0"+day+"";
		return today_date ;
	}
}
