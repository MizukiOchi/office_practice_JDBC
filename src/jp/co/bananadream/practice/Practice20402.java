package jp.co.bananadream.practice;

public class Practice20402 {
	public static void main(String[] args) {

		//１、
		//（１）コンソールに「おはようございます」を出力させよ
		System.out.println("おはようございます");

		//(2)String型変数「weather」に今日の天気を代入し、コンソールに「今日の天気は○○です」を出力させよ
		String weather = "晴れ";
		System.out.println("今日の天気は" + weather + "です");

		//(3)int型変数に「自分の年齢」を代入し、コンソールに「現在○○歳で10年後には××歳になります」を表示させよ（〇〇は変数、××は計算で求めること）
		int age = 22;
		System.out.println("現在" + age + "歳で10年後には" + (age + 10) + "になります");

		//2,
		//(1)int型変数groupに任意の人数を代入し、30人以上なら「団体割引が適用されます」,
		//0人より多く30人未満なら「団体割引は適用されません」、
		//0人以下なら「人数が正しくありません」と表示される条件分岐を作成せよ
		int group = 4;

		if (group >= 30) {
			System.out.println("団体割引が適用されます");

		} else if (group < 30 && group > 0) {
			System.out.println("団体割引は適応されません");

		} else if (group <= 0) {
			System.out.println("人数が正しくありません");

		}

		//(2)繰り返し処理を使って1~30の数字をコンソールに出力させよ。
		//ただし3の倍数の時には数字ではなく、「バナナ」と表示されるようにすること
		for (int i = 1; i <= 30; i++) {
			if (i % 3 != 0) { // 「!=」等しくない
				System.out.println(i);
			} else {
				System.out.println("バナナ");
			}
		}
		//３、string型変数「phone」と「color」を用意せよ
		//「phone」にケータイ会社の名前（ドコモ、auなど）を代入し、
		//「au」なら「color」に「オレンジ」を代入し、
		//「ドコモ」なら「color」に「赤」を代入し、
		//それ以外なら、「color」に「不明」を代入し、
		//コンソールに「（会社名）のイメージカラーは〇〇です」を出力せよ
		String phone = "ドコモ";

		switch (phone) { //(　)の中を調べる
		case "au": //"au"の場合
			System.out.println(phone + "のイメージカラーはオレンジです");
			break;

		case "ドコモ":
			System.out.println(phone + "のイメージカラーは赤です");
			break;

		default: //default=その他の時
			System.out.println(phone + "のイメージカラーは不明です");
			break;
		}

		//			４、String型配列animalsに「犬、猫、インコ、かめ、ウサギ、金魚」を格納し、
		//					拡張for文を用いて「〇〇はペットとして人気です」をすべての動物で出力させよ
		String[] animal = { "犬", "猫", "インコ", "かめ", "ウサギ", "金魚" };
		for (String animals : animal) {

			System.out.println(animals + "はペットとして人気です");

		}

	}
}
