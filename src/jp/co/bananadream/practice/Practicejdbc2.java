package jp.co.bananadream.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practicejdbc2 {
	public static void main(String[] args) {

		//		以下の３つのクラスを使うことでデータベースとJavaをつなげることができる
		Connection conn = null;//Javaとデータベースをつなげる
		Statement stmt = null; //JavaからデータベースへSQL文を投げる
		ResultSet rset = null; //SQLの検索結果を保持する
		//接続文字列
		String url = "jdbc:postgresql://localhost:5432/pizza_manager";
		String user = "pizza_manager";
		String password = "systemsss";
		try {
			//PostgreSQLへ接続
			conn = DriverManager.getConnection(url, user, password);
			//自動コミットOFF
			conn.setAutoCommit(false);
			//SELECT文の実行
			stmt = conn.createStatement();
			String sql = "SELECT * FROM FOODS F INNER JOIN TYPE T ON F.TYPE_ID = T.TYPE_ID";
			rset = stmt.executeQuery(sql);
			//SELECT結果の受け取り

			Map<String, String> empMap = null;
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();

			while (rset.next()) {
				//				String col = rset.getString("dept_name"); //()の中は表示したいデータベース上のカラムの列番号を入れる
				//				System.out.println(col);

				empMap = new HashMap<String, String>();
				empMap.put("food_id", rset.getString("food_id"));
				empMap.put("food_name", rset.getString("food_name"));
				empMap.put("price", rset.getString("price"));
				empMap.put("type_name", rset.getString("type_name"));
//				empMap.put("DName", rset.getString("dept_name"));

				list.add(empMap);

			}

			System.out.println(list);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null)
					rset.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
