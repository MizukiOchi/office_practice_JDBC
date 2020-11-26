package jp.co.bananadream.practice;

import java.time.LocalDate;
import java.util.Calendar;

public class Datepractic0402 {
	public static void main(String[] args) {

		//練習問題
		//01,生まれた日から10,000日後の自分の年齢を求めてコンソールに表示させよ。

		LocalDate birth = LocalDate.of(1997, 11, 12);
		System.out.println(birth);

		LocalDate day = birth.plusDays(10000);

		int year1 = birth.getYear();
		int month1 = birth.getMonthValue();
		int day1 = birth.getDayOfMonth();

		int year2 = day.getYear();
		int month2 = day.getMonthValue();
		int day2 = day.getDayOfMonth();

		System.out.println("10000日後：" + day);

		int age;

		if (month1 >= month2 && day1 > day2) {
			age = year2 - year1 - 1;
		} else {
			age = year2 - year1;
		}
		System.out.println("生まれた日から10,000日後の年齢は" + age + "歳です");

		//		02,生まれた日から10,000日後の曜日を求めてコンソールに表示させよ。

		Calendar cel = Calendar.getInstance(); //cel　中身を更新させている感じ

		cel.set(Calendar.YEAR, 1997);
		cel.set(Calendar.MONTH, 10); //　＊月は-1の月を打つこと　
		cel.set(Calendar.DAY_OF_MONTH, 12);

		cel.add(Calendar.DAY_OF_MONTH, 10000); //誕生日の10,000日後の日にち
		cel.get(Calendar.DAY_OF_WEEK); //10,000日後の曜日を取り出している

		int week1 = cel.get(Calendar.DAY_OF_WEEK); //上で出した曜日をintのweek1に代入

		String week2 = ""; //初期化　week2にこれから何か入れる準備をしている

		switch (week1) { //switch(条件){　←条件に当てはまったら
		case Calendar.SUNDAY: //case          ←日曜日になる
			week2 = "日曜日"; //　　　　　　　　 ←
			break;

		case Calendar.MONDAY:
			week2 = "月曜日";
			break;

		case Calendar.TUESDAY:
			week2 = "火曜日";
			break;

		case Calendar.WEDNESDAY:
			week2 = "水曜日";
			break;

		case Calendar.THURSDAY:
			week2 = "木曜日";
			break;

		case Calendar.FRIDAY:
			week2 = "金曜日";
			break;

		case Calendar.SATURDAY:
			week2 = "土曜日";
			break;

		}

		System.out.println("生まれた日から10,000日後の曜日は" + week2 + "です");
	}

}