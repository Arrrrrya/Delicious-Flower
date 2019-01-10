package com.syl.test;

import java.util.Scanner;

import com.syl.util.DateToWeekUtil;

/*
 * .万年历：输入年月，输出如下内容
 * 
 * 2019年1月
 * .日	一	二	三	四	五	六
 *  	 	1	2	3	4	5
 * 6	7	8	9	10	11	12
 * 13	14	15	16	17	18	19
 * 20	21	22	23	24	25	26
 * 27	28	29	30	31
 * 
 * @author syl
 *
 */
public class _002_WNcalendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		scan.close();

		getWnCalendar(year, month);
	}

	private static void getWnCalendar(int year, int month) {
		boolean yearFlag;
		// 1.判断是否是闰年
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			yearFlag = true;
		} else {
			yearFlag = false;
		}

		// 2.计算每个月多少天
		int day = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			if (yearFlag) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			System.err.println("输入月份非法！");
			break;
		}

		String runStr = yearFlag ? "闰年" : "非闰年";
		System.out.println("\t" + "\t" + year + "年(" + runStr + ")" + month + "月");

		// 3.计算输入月份第一天是星期几
		String date = (year + "-" + month + "-" + "01").toString();
		String weekDayStr = DateToWeekUtil.dateToWeek(date);
		int weekday = 0;
		if (weekDayStr.equals("星期日")) {
			weekday = 7;
		} else if (weekDayStr.equals("星期一")) {
			weekday = 1;
		} else if (weekDayStr.equals("星期二")) {
			weekday = 2;
		} else if (weekDayStr.equals("星期三")) {
			weekday = 3;
		} else if (weekDayStr.equals("星期四")) {
			weekday = 4;
		} else if (weekDayStr.equals("星期五")) {
			weekday = 5;
		} else if (weekDayStr.equals("星期六")) {
			weekday = 6;
		}
		// 4.创建一个n排7列的面板
		System.out.println("日" + "\t" + "一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六");

		if (weekday != 7) {
			for (int j = 0; j < weekday; j++) {
				System.out.print(" " + "\t");
			}
		}

		for (int i = 1; i <= day; i++) {
			System.out.print(i + "\t");
			if ((i % 7 + weekday) == 7) {
				System.out.println();
			}
		}
	}
}
