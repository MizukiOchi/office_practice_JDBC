package jp.co.bananadream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collectionclass0407 {

	public static void main(String[] args) {

		//●配列の復習
		String[] banana2019 = { "青木", "小田", "上山" };

		//		banana2019[3] = "越智";

		//＊配列は数に縛りがあって、増やすことができない
		//＊途中から増やすときは新しい配列を作る必要があある

		//＊配列の場所を追加する
		String[] banana2020 = new String[4];
		//System.arraycopy(コピー元配列, コピー元配列のコピー開始位置, コピー先配列, コピー先配列の開始位置, コピーする個数);
		System.arraycopy(banana2019, 0, banana2020, 0, 3);

		System.out.println("①banana2019:" + Arrays.asList(banana2019));
		System.out.println("②banana2020:" + Arrays.asList(banana2020));

		banana2020[3] = "越智";
		System.out.println("③banana2020に追加:" + Arrays.asList(banana2020));

		//●listを使って情報を入力する　（順番通り表示される）
		//＊配列は数に制限があるけど、listは数の制限がなく追加できる
		List<String> bananalist = new ArrayList<String>();
		bananalist.add("Aoki");
		bananalist.add("Oda");
		bananalist.add("Kamiyama");
		bananalist.add("Ochi");

		//		for (String str : bananalist) {
		//			System.out.println(str);
		//		}

		//①addメソッド
		//		指定した場所に挿入できる
		bananalist.add(0, "Hayashibe");

		for (String str : bananalist) {
			System.out.println(str);
		}

		//②setメソッド
		//		上書きができる
		bananalist.set(3, "Nakajo");
		System.out.println(bananalist);

		//③removeメソッドで取り除く
		//	指定した場所が削除できる
		bananalist.add("Banana");
		System.out.println(bananalist);
		bananalist.remove(5);
		System.out.println(bananalist);

		//④listの中のすべての要素を削除する
		//		bananalist.clear();
		//		System.out.println(bananalist);

		//⑤指定して出力できる
		System.out.println(bananalist.get(3));

		//練習
		//①fruitsリストを作る
		List<String> fruitslist = new ArrayList<String>();
		fruitslist.add("リンゴ");
		fruitslist.add("バナナ");
		fruitslist.add("ブドウ");
		fruitslist.add("イチゴ");
		fruitslist.add("メロン");
		fruitslist.add("キウイ");

		System.out.println(fruitslist);

		//②２番目のフルーツを"オレンジ"に上書きする
		fruitslist.set(1, "オレンジ");
		System.out.println(fruitslist);

		//③３番目のフルーツを削除する
		//		fruitslist.remove(4);
		System.out.println(fruitslist);

		//④４番目のフルーツを出力する
		System.out.println(fruitslist.get(3));

		//⑤数字のリストをInterger型で作る
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) { //この処理は１回で出力している
			numbers.add(i);
		}
		for (int number : numbers) { //この処理で１つずつ出力している
			System.out.println(number);
		}

		//●Mapを使ってリストを作る
		//⑥Map < String(キー) ,String(値)> person = new HashMap < String(キー) ,String(値)>();
		//		preson.put(キー,値);
		//		get(キー);

		//		Map<String, String> person = new HashMap<String,String>();
		//		person.put("Name", "Ken");
		//		person.put("Country", "Japan");
		//
		//		System.out.println(person.get("Name"));
		//
		//		System.out.println(person); //順番はテキトー

		//＊MapはListとセットで使われることが多い

		//⑦Mapを入れるListを作る
		List<Map<String, String>> people = new ArrayList<Map<String, String>>();

		//⑧Mapを3人分作ってListにaddする
		Map<String, String> person1 = new HashMap<String, String>();
		person1.put("Name", "Ken");
		person1.put("Country", "Japan");
		people.add(person1);

		Map<String, String> person2 = new HashMap<String, String>();
		person2.put("Name", "Mery");
		person2.put("Country", "Canada");
		people.add(person2);

		Map<String, String> person3 = new HashMap<String, String>();
		person3.put("Name", "Bob");
		person3.put("Country", "USA");
		people.add(person3);

		System.out.println(people);
		System.out.println(people.get(1).get("Name"));
		System.out.println(people.get(2).get("Country"));


		//総合問題①　fruitsとpricelistを上から順に組み合わせる

		//値段リスト
		List<Integer> pricelist = new ArrayList<Integer>();
		pricelist.add(100);
		pricelist.add(150);
		pricelist.add(200);
		pricelist.add(110);
		pricelist.add(90);
		pricelist.add(80);

		System.out.println(pricelist);

		//fruitsリスト
		List<String> fruits = new ArrayList<String>();
		fruits.add("リンゴ");
		fruits.add("バナナ");
		fruits.add("ブドウ");
		fruits.add("イチゴ");
		fruits.add("メロン");
		fruits.add("キウイ");

		System.out.println(fruits);

		List<Map<String, String>> fruitspriceList = new ArrayList<Map<String, String>>();
		Map<String, String> map = null;
		for (int i = 0; i < fruits.size(); i++) {
			map = new HashMap<String, String>();
			map.put("fruits", fruits.get(i));
			map.put("price", pricelist.get(i).toString());

			fruitspriceList.add(map);
		}

		System.out.println(fruitspriceList);




	}

}
