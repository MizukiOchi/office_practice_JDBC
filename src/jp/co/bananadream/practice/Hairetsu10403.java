package jp.co.bananadream.practice;

public class Hairetsu10403 {
	public static void main(String[] args) {

		String moji1 = "あいうえお";
		String moji2 = "かきくけこ";

		System.out.println(moji1);
		//文字列処理について:2020年4月3日（金）自社研修2日目
		//		①文字列連結
		System.out.println(moji1 + moji2);//短い連結時に使用

		StringBuilder moji3 = new StringBuilder();//パフォーマンスが良い。
		moji3.append(moji1);
		moji3.append(moji2);
		System.out.println(moji3);

		StringBuffer moji4 = new StringBuffer();//StringBuilderとほぼ一緒
		moji4.append(moji1);
		moji4.append(moji2);
		System.out.println(moji4);

		//		②文字の切り出し
		System.out.println(moji2.substring(2, 5));//moji2の指定した文字を取り出す (抜き出す前の文字,最後の文字)

		//		③文字列の長さを調べる
		System.out.println(moji3.length());

		//		④文字列の比較
		String moji5 = "さしすせそ";
		String moji6 = "さしすせそ";
		System.out.println(moji5.equals(moji6));//equalsメソッドは中身を比較 (moji5はmoji6と一緒か調べる）

		//		equalsとcontentEqualsの違い
		//		equalsは、文字列("")とオブジェクトの両方を比較する
		//		contentEqualsは、文字列("")のみ比較する

		//		練習問題　（①〜④）
		//		問題1　2つのString型の変数が同じ文字列かどうかを判定するプログラムを作る
		//		strAの中には文字列「ねこちゃん」が入っています
		//		strBの中には文字列「いぬちゃん」が入っています
		String strA = "ねこちゃん";
		StringBuilder strB = new StringBuilder();
		strB.append("ねこちゃん");
		System.out.println(strA.contentEquals(strB));

		//		問題2　文字列連結を２つの方法で行う
		//		・青木亜子　・越智瑞紀　の２つの文字列を連結してください
		String name1 = "青木亜子";
		String name2 = "越智瑞紀";

		StringBuilder name3 = new StringBuilder();
		name3.append(name1);
		name3.append(name2);
		System.out.println(name3);

		StringBuffer name4 = new StringBuffer();
		name4.append(name1);
		name4.append(name2);
		System.out.println(name4);

		//		問題3　次の文字列の長さを調べる
		//		・有限会社バナナドリームは千葉県浦安市猫実にあります
		String sentence1 = "有限会社バナナドリームは千葉県浦安市猫実にあります";
		System.out.println(sentence1.length());

		//		問題4　上記の文字列の住所部分を切り取る
		System.out.println(sentence1.substring(12, 20));

		//		⑤文字列分割
		String moji7 = "赤,青,黄,緑";
		String[] color = moji7.split(",");//splitメソッドでmoji7の中の,毎にそれぞれで分割
		for (String moji8 : color) {
			System.out.println(moji8);
		}

		//　　　　⑥空白駆除
		String name5 = " 越智 瑞紀   ";
		System.out.println(name5.trim());//trimメソッドは先頭と末尾の空白は消える
											// ＊ただし、文字と文字の間の空白は消えない　全角スペースも消えない
											//		⑦文字列の検索 (位置は0から開始される）
		String str1 = "abc123abc123";
		String str2 = "123";
		int result = str1.indexOf(str2);// lastIndexOfを使用すると後ろから検索することになる
		System.out.println(result);
		//　     ↓　System.out.println(result)の応用ver. 　（「/*」から「*/]の間は反映されない）
		/*if (result !=-1) {
			System.out.println(result);
		}else {
			System.out.println(str2 + "は見つかりませんでした");
		}*/

		//		⑧ある文字列があるかどうか検索
		String str = "appleorangemelon";
		if (str.matches(".*orange.*")) {
			System.out.println("orange matched");
		}

		//		練習問題 (⑤〜⑧）
		//		問題5 次の文字列を「！」で分割する
		//		ねこ!いぬ!ひよこ!うさぎ!(!半角）
		String animal1 = "ねこ!いぬ!ひよこ!うさぎ!";
		String[] animal = animal1.split("!");
		for (String animal2 : animal) {
			System.out.println(animal2);
		}

		//		問題6 次の文字列の空白を削除する
		//		"    有限会社 バナナドリーム    " (先頭と後方の空白をそれぞれ４文字）
		String address = "    有限会社 バナナドリーム    ";
		System.out.println(address.trim());

		//		問題7 次の文字列から指定した文字列を後ろから検索する
		//		Chibakenurayasushinekozane
		//		検索する文字列：yasu
		String address2 = "Chibakenurayasushinekozane";
		String address3 = "yasu";
		int result1 = address2.lastIndexOf(address3);
		System.out.println(result1);

		//		⑨nullと空文字の違い
		//		null - 何もない
		//		空文字 - スペースみたいに何も入っていない
		String str3 = "";
		String str4 = null;//変数を作ったのに何もしてない状態になっている　（→nullは何も入っていないから）

		System.out.println(str3.isEmpty());
		//		System.out.println(str4.isEmpty());

		String str5 = null;
		String str6 = "";
		String str7 = " ";

		System.out.println(str5 == null);
		System.out.println(str6.isEmpty());
		System.out.println(str7.isEmpty());

		//		⑩文字列置換
		String stra = "aaaaaaaaas";
		System.out.println(stra.replaceFirst("a", "b"));
		//stra.replaceFirst("変えたい文字","変更後の文字")  ←replaceFirstは指定した文字の初めだけ反映される
		//stra.replaceAll("変えたい文字","変更後の文字")    ←replaceAllは指定した文字の全てに反映される

	}

}
