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

public class Practicejdbc {
	public static void main(String[] args) {

		//		以下の３つのクラスを使うことでデータベースとJavaをつなげることができる
		Connection conn = null;//Javaとデータベースをつなげる
		Statement stmt = null; //JavaからデータベースへSQL文を投げる
		ResultSet rset = null; //SQLの検索結果を保持する
		//接続文字列
		String url = "jdbc:postgresql://localhost:5432/practice";
		String user = "m_ochi";
		String password = "password";
		try {
			//PostgreSQLへ接続
			conn = DriverManager.getConnection(url, user, password);
			//自動コミットOFF
			conn.setAutoCommit(false);
			//SELECT文の実行
			stmt = conn.createStatement();
			String sql = "SELECT emp_id, emp_name, address, birthday, dept_name FROM emp left outer join dept on emp.dept_id = dept.dept_id";
			rset = stmt.executeQuery(sql);
			//SELECT結果の受け取り

			Map<String, String> empMap = null;
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();

			while (rset.next()) {
				//				String col = rset.getString("dept_name"); //()の中は表示したいデータベース上のカラムの列番号を入れる
				//				System.out.println(col);

				empMap = new HashMap<String, String>();
				empMap.put("EID", rset.getString("emp_id"));
				empMap.put("EName", rset.getString("emp_name"));
				empMap.put("Address", rset.getString("address"));
				empMap.put("Birthday", rset.getString("birthday"));
				empMap.put("DName", rset.getString("dept_name"));

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
