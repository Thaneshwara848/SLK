package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");							
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/SLK", "root", "root");
								//Statement stmt= con.createStatement();
PreparedStatement stmt= con.prepareStatement("update employee set salary = ? where id = ? ");
					Scanner sc = new Scanner(System.in);
					System.out.println("ID : ");int id = sc.nextInt();
				
					System.out.println("SADLARY  : ");int salary= sc.nextInt();
			
					stmt.setInt(1, salary);
				
					stmt.setInt(2, id);
					

					stmt.execute();
					stmt.close();
					System.out.println("Data Updated,....!");
								} catch (Exception e) {
									System.out.println(e);
								}
	}
}
