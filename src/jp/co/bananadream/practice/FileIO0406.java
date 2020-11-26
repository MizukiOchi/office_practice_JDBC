package jp.co.bananadream.practice;

import java.util.Scanner;

public class FileIO0406 {
	public static void main(String[] args) {

		//		try {
		//1,ファイルを指定する
		//	File file = new File ("/Users/m_ochi/Desktop/0406/test2.txt");

		//	FileWriter filewriter = new FileWriter(file);

		//2,ファイルへの書き込み
		//    filewriter.write("越智瑞紀");
		//    filewriter.close();

		// 3,FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
		//    FileReader fileReader = new FileReader(file);
		//    int data;
		//    while ((data = fileReader.read()) != -1) {
		//        System.out.print((char) data);
		//    }

		// 4,BufferedReaderクラスのreadLineメソッドを使って1行ずつ読み込み表示する
		//    FileReader fileReader = new FileReader(file);
		//    BufferedReader bufferedReader = new BufferedReader(fileReader);
		//    String data;
		//    while ((data = bufferedReader.readLine()) != null) {
		//        System.out.println(data);
		//    }
		//
		// 5,最後にファイルを閉じてリソースを開放する
		//    bufferedReader.close();

		//6,ファイルのコピー
		// テキストファイルの内容は”abc”です。
		//	BufferedReader reader = null;
		//	reader = new BufferedReader (new InputStreamReader (new FileInputStream("/Users/m_ochi/Desktop/0406/test.txt"), "UTF-8"));
		//  ↑下の２行のことをやっている
		//	      FileInputStream fIStream= new FileInputStream("/Users/m_ochi/Desktop/0406/test.txt");
		//        InputStreamReader iSReader = new InputStreamReader(fIStream, "UTF-8");

		//	BufferedWriter writer = null;
		//	writer = new BufferedWriter (new OutputStreamWriter (new FileOutputStream("/Users/m_ochi/Desktop/0406/test2.txt"), "UTF-8"));
		//
		//	String data1;
		//	while ((data1 = reader.readLine()) != null) {
		//	 writer.write(data1);
		//	 writer.newLine();
		//	}
		//	writer.flush(); bufferにいったん蓄えられるものをすぐに書いてと指示する
		//	writer.close();
		//	reader.close();

		//        int data;
		//        while ((data = iSReader.read()) != -1) {
		//            System.out.println((char)data);
		//        }

		//		file.createNewFile();

		//7,ファイルの削除
		//	boolean b = file.delete();
		//	System.out.println(b);

		//	InputStreamReader file3 = new InputStreamReader (new FileInputStream("/Users/m_ochi/Desktop/0406/company.properties"), "UTF-8");
		//
		//	Properties properties = new Properties();
		//	properties.load(file3);
		//
		//	System.out.println(properties.getProperty("name"));
		//    System.out.println(properties.getProperty("address"));
		//
		//	}
		//		catch (IOException e) {
		//		}
		//
		//	finally {
		//
		//	}

		//		try {
		//		BufferedReader reader = null;
		//		reader = new BufferedReader (new InputStreamReader (new FileInputStream("/Users/m_ochi/Desktop/0406/companies.csv"),"UTF-8"));
		//
		//		BufferedWriter writer = null;
		//		writer = new BufferedWriter (new OutputStreamWriter (new FileOutputStream("/Users/m_ochi/Desktop/0406/test2.txt"), "UTF-8"));
		//
		//
		//		String line;
		//		int i = 0; //
		//
		//		String[] file4 = null;
		//
		//		while ((line = reader.readLine()) != null){
		//
		//			if ( i == 0) {
		//
		//				file4 = line.split(",");
		//
		//			}else {
		////				System.out.println();
		////
		////				System.out.println("データ" + i + "件目");
		//
		////	ファイルへ書き出し
		//				writer.write("データ" + i + "件目");
		//				writer.newLine();
		//
		//
		//				if (line.matches(".*株式会社.*")) {
		//					line = line.replace("株式会社","有限会社");
		//				}
		//
		//				String[] data = line.split(",");
		//
		//				int colno = 0;
		//				for (String column : file4) {
		//
		////					System.out.println(column + ":" + data[colno]);
		////　ファイルへ書き出し
		//					writer.write(column + ":" + data[colno]);
		//					writer.newLine();
		//
		//					colno++;
		//				}
		//			}
		//			i++;
		//		}
		//		writer.flush();
		//		writer.close();
		//		reader.close();
		//		}
		//
		//
		//
		//			catch (IOException e) {
		//			}
		//
		//		finally {
		//
		//		}

		//課題１：コンソールから文字を入力する
		System.out.println("入力してください。");

		Scanner sc1 = new Scanner(System.in); //標準入力を受け取る
		String line1 = sc1.nextLine();

		System.out.println("入力した文字=" + line1);

		//課題２；コンソールにある文字をファイルに出力する
//		try {
//
//			File file = new File("/Users/m_ochi/Desktop/0406/test2.txt");
//			FileWriter writer = new FileWriter(file);
//
//			writer.write("入力した文字=" + line1);
//
//			writer.flush();
//			writer.close();
//		}
//
//		catch (IOException e) {
//		}
//
//		finally {
//
//		}
	}
}
