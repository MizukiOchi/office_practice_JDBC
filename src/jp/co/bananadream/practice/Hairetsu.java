package jp.co.bananadream.practice;

public class Hairetsu {

	public static void main(String[] args) {

		//		01,String型配列sports二「サッカー、野球、バスケ、バレー、テニス」を代入し、コンソールに「バレー」を表示させよ
		String[] sports = { "サッカー", "野球", "バスケ", "バレー", "テニス" };
		System.out.println(sports[3]);

		//		02,for文を使って(1)で使ってsportsを全てコンソールに表示させよ。

		for (int i = 0; i < sports.length; i++) {//for(初期化;条件式;更新）{

			System.out.println(sports[i]);
		}

		//	①拡張for文
		for (String sport : sports) {
			System.out.println(sport);
		}

		//	②while文　(処理の数が決まっていない）

		//	③Bubblesortという手順を使って左から大きい順に並び替える
		int[] sort = { 4, 2, 5, 7, 1 };

		for (int i = 0; i < sort.length - 1; i++) {
			for (int j = sort.length - 1; j > i; j--) {
				if (sort[j] > sort[j - 1]) {
					int taihi = sort[j - 1];
					sort[j - 1] = sort[j];
					sort[j] = taihi;

				}
			}
		}
		for (int sort1 : sort) {
			System.out.println(sort1);

		}

	}
}
