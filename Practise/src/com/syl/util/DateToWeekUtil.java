package com.syl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * .��ȡָ�����������ڼ�
 * 
 * @author syl
 *
 */
public class DateToWeekUtil {

	public static void main(String[] args) {
		System.out.println(DateToWeekUtil.dateToWeek("2019-01-09"));
	}

	public static String dateToWeek(String datetime) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		String[] weekDays = { "������", "����һ", "���ڶ�", "������", "������", "������", "������" };
		Calendar cal = Calendar.getInstance(); // ���һ������
		Date date = null;
		try {
			date = f.parse(datetime);
			cal.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // ָʾһ�������е�ĳ�졣
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

}