package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		try {
Class.forName("com.mysql.jdbc.Driver");							
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/SLK", "root", "root");
					//Statement stmt= con.createStatement();
PreparedStatement stmt= con.prepareStatement("insert into employee values(?,?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("ID : ");int id = sc.nextInt();
		System.out.println("NAME : ");String name= sc.next();
		System.out.println("AGE: ");int age = sc.nextInt();
		System.out.println("SADLARY  : ");int salary= sc.nextInt();
		System.out.println("ESIG: ");String desig = sc.next();
		
		stmt.setInt(1, id);
		stmt.setString(2, name);
		stmt.setInt(3, age);
		stmt.setInt(4, salary);
		stmt.setString(5, desig);

		stmt.execute();
		stmt.close();
		System.out.println("Data Inserted,....!");
					} catch (Exception e) {
						System.out.println(e);
					}
	}
}
