package com.ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLexce {

	public static void main(String[] args) throws SQLException {
		System.out.println("main method started");
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiru", "root", "root");

			stmt = con.createStatement();

//		String sql = "select*from employe";

			rs = stmt.executeQuery("select*from employe");

			while (rs.next()) {
				System.out.print(rs.getInt(1) + " | ");

				System.out.print(rs.getString(2) + "   | ");

				System.out.println(rs.getInt(3));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			if (con != null) {
				con.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		}

	}
}
