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
 * @syl the bug is not what you see,but what it is.
 *
 */
public class _002_WNcalendar {

	private void getWnCalendar(int year, int month) {
		boolean isRunNianFlag;
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			isRunNianFlag = true;
		} else {
			isRunNianFlag = false;
		}

		int dayOfMonth = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayOfMonth = 31;
			break;
		case 2:
			if (isRunNianFlag) {
				dayOfMonth = 29;
			} else {
				dayOfMonth = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayOfMonth = 30;
			break;
		default:
			System.err.println("输入月份非法！");
			break;
		}

		String runStr = isRunNianFlag ? "闰年" : "非闰年";
		System.out.println("\t" + "\t" + year + "年(" + runStr + ")" + month + "月");

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
		System.out.println("日" + "\t" + "一" + "\t" + "二" + "\t" + "三" + "\t" + "四" + "\t" + "五" + "\t" + "六");

		if (weekday != 7) {
			for (int j = 0; j < weekday; j++) {
				System.out.print(" " + "\t");
			}
		}

		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.print(i + "\t");
			if ((i % 7 + weekday) == 7) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		scan.close();

		new _002_WNcalendar().getWnCalendar(year, month);
	}
}
