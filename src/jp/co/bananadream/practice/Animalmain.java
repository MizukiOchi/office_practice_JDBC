package jp.co.bananadream.practice;

import java.util.Scanner;

public class Animalmain {

	public static void main(String[] args) {

		System.out.println("Dog, Neko,Lionのいずれかを入力してください");

		Scanner sc2 = new Scanner(System.in); //標準入力を受け取る
		String line2 = sc2.nextLine();

		Animal animal = null;
		if ("".equals(line2)) {
			System.out.println("Dog, Neko,Lionのいずれかを入力してください");

		} else if ("Dog".equals(line2)) { //（値が絶対に""だから)先に""を入力することで、line2がnullかどうかの確認をいちいちしなくても済む。
			animal = new Dog();

		} else if ("Neko".equals(line2)) {
			animal = new Neko();

		} else if ("Lion".equals(line2)) {
			animal = new Lion();

		} else {
			System.out.println("存在しません");
		}
		if(animal != null) {
//			animal.getKind();
//			animal.naku();
		}





	}

}
