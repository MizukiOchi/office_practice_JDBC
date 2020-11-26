package jp.co.bananadream.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class Date0402 {

	public static void main(String[] args) {

		//①今日の日づけを表示
		java.util.Date now = new java.util.Date();
		System.out.println(now);

		//②年月日時分秒で表示する方法
		String today1 = "GGGy年MM月dd日 ah時mm分ss秒"; //＊月は大文字のMM、分は小文字のmm
		Locale japan = new Locale("ja", "JP", "JP"); //locale()で地域を指定
		SimpleDateFormat sdf = new SimpleDateFormat(today1, japan); //SimpleDateFormat（表示方法の指定,場所の指定）
		System.out.println(sdf.format(now)); //nowをformatメソッドを使ってsdfに入っているものに変換する

		//③Calendarを使用して日付を表示
		Calendar cel = Calendar.getInstance(); //getInstanceメソッドは、Calendarを何するのかの方法の指示
		cel.set(Calendar.YEAR, 2020);
		cel.set(Calendar.MONTH, 4); //＊MONTHは-1の月で打つこと
		cel.set(Calendar.DAY_OF_MONTH, 2);
		System.out.println(sdf.format(cel.getTime())); //現在の時刻

		//LocalDateTimeは「年,月,日.時,分,秒」の６つの値が必要
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);

		LocalDateTime birthday = LocalDateTime.of(2005, 8, 9, 0, 0, 0);
		System.out.println(birthday);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(today1); //ofPatternでどのように表示するかの型の指定
		System.out.println(dtf.format(birthday));

		//LocalDateは「年,月,日」の３つの値が必要
		String today2 = "GGGy年MM月dd日";
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(today2);

		LocalDate birth = LocalDate.of(1997, 11, 12);
		System.out.println(birth);

		System.out.println(dtf1.format(birth));

	}

}
