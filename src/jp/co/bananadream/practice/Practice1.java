package jp.co.bananadream.practice;

public class Practice1 {
	public static void main(String[] args) {

		int age = 8;

		if (age >= 20) {
			System.out.println("お酒とタバコはOKです");
		} else {
			System.out.println("お酒とタバコは２０歳から");
		}

		if (age >= 20) {
			System.out.println("お酒もタバコも大丈夫で選挙にも行けます。");
		} else {
			if (age >= 18) {
				System.out.println("お酒とタバコはダメですが選挙には行けます。");
			} else {
				System.out.println("お酒もタバコもダメで選挙にも行けません。");
			}
		}

		int temp = 32;
		if (temp >= 35) {
			System.out.println("今日は猛暑日です。");
		} else if (temp >= 30) {
			System.out.println("今日は真夏日です。");
		} else if (temp >= 25) {
			System.out.println("今日は夏日です。"); //最初のif以外の条件は、if else
		} else { //ifやif elseの条件以外のものはelse
			System.out.println("今日は過ごしやすい気温です。");
		}

		String weather = "雨";

		switch (weather) {
		case "晴れ":
			System.out.println("お散歩に行く");
			break;

		case "雨":
			System.out.println("家でゲームをする");
			break;

		case "雪":
			System.out.println("雪だるまを作る");
			break;

		default:
			System.out.println("家から出ない");
			break;
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		int height = 130;
		if (height >= 130) {
			System.out.println("ジェットコースターに乗れます！");
		} else {
			System.out.println("ジェットコースターに乗れません");

		}
	}
}
