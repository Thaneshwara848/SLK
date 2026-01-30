package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		try {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver loaded...!");
			
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/SLK", "root", "root");
		System.out.println("Connect Credted...!");
		
		Statement stmt= con.createStatement();
		
		stmt.execute("insert into employee values(2,'Ganesh',50,50000,'Developer')");
		
		stmt.close();
		System.out.println("Data Inserted,....!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
