package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");							
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/SLK", "root", "root");
								//Statement stmt= con.createStatement();
			PreparedStatement stmt= con.prepareStatement("delete from Employee where id =? ");
					Scanner sc = new Scanner(System.in);
					
					System.out.println("ID : ");int id = sc.nextInt();
					System.out.println("Do you realry want ot DLEETE ? y/n");
					String ch=sc.next();
					if(ch.equalsIgnoreCase("yes") || ch.equalsIgnoreCase("y")) {
						stmt.setInt(1, id);
						System.out.println("Data Deleted ,....!");
					}
					else {
						System.out.println("Not Dleted....!");
					}
					stmt.execute();
					stmt.close();
					
								} catch (Exception e) {
									System.out.println(e);
								}
	}
}
