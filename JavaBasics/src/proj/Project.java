package proj;

import java.util.Scanner;

class Employee {
    Scanner sc = new Scanner(System.in);
    public int id, age;
    public int salary;
    public String name;
    public String desig;

    public Employee() {
        System.out.print("Enter ID : ");
        id = sc.nextInt();
        System.out.print("Enter The NAME : ");
        name = sc.next();
        System.out.print("Enter the Age : ");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("=============");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + desig);
    }
}

// ---------------- CLERK ----------------
final class Clerk extends Employee {
    public Clerk() {
        salary = 30000;
        desig = "CLERK";
    }

    public void raiseSalary() {
        salary = salary + 10000;
        System.out.println("Clerk Salary Raised!");
    }
}

// ---------------- DEVELOPER ----------------
final class Dev extends Employee {
    public Dev() {
        salary = 50000;
        desig = "DEVELOPER";
    }
}

// ---------------- MANAGER ----------------
final class Manager extends Employee {
    public Manager() {
        salary = 90000;
        desig = "MANAGER";
    }

    public void raiseSalary() {
        salary = salary + 50000;
        System.out.println("Manager Salary Raised!");
    }
}

// ---------------- TESTER ----------------
final class Tester extends Employee {
    public Tester() {
        salary = 40000;
        desig = "TESTER";
    }

    public void raiseSalary() {
        salary = salary + 5000;
        System.out.println("Tester Salary Raised!");
    }
}

// ---------------- MAIN CLASS ----------------
public class Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch1, ch2, ch3, ch4;

        Clerk c = null;
        Dev d = null;
        Manager m = null;
        Tester t = null;

        do {
            System.out.println("\n1) CREATE");
            System.out.println("2) DISPLAY");
            System.out.println("3) RAISE SALARY");
            System.out.println("4) EXIT");
            ch1 = sc.nextInt();

            // -------- CREATE --------
            if (ch1 == 1) {
                do {
                    System.out.println("\n1) CLERK");
                    System.out.println("2) DEVELOPER");
                    System.out.println("3) MANAGER");
                    System.out.println("4) TESTER");
                    System.out.println("5) EXIT");
                    ch2 = sc.nextInt();

                    if (ch2 == 1) c = new Clerk();
                    if (ch2 == 2) d = new Dev();
                    if (ch2 == 3) m = new Manager();
                    if (ch2 == 4) t = new Tester();

                } while (ch2 != 5);
            }

            // -------- DISPLAY --------
            if (ch1 == 2) {
                do {
                    System.out.println("\n1) CLERK");
                    System.out.println("2) DEVELOPER");
                    System.out.println("3) MANAGER");
                    System.out.println("4) TESTER");
                    System.out.println("5) EXIT");
                    ch3 = sc.nextInt();

                    if (ch3 == 1 && c != null) c.display();
                    else if (ch3 == 2 && d != null) d.display();
                    else if (ch3 == 3 && m != null) m.display();
                    else if (ch3 == 4 && t != null) t.display();
                    else if (ch3 != 5) System.out.println("No Record Found!");

                } while (ch3 != 5);
            }

            // -------- RAISE SALARY --------
            if (ch1 == 3) {
                do {
                    System.out.println("\n1) CLERK");
                    System.out.println("2) MANAGER");
                    System.out.println("3) TESTER");
                    System.out.println("4) EXIT");
                    ch4 = sc.nextInt();

                    if (ch4 == 1 && c != null) c.raiseSalary();
                    else if (ch4 == 2 && m != null) m.raiseSalary();
                    else if (ch4 == 3 && t != null) t.raiseSalary();
                    else if (ch4 != 4) System.out.println("No Record Found!");

                } while (ch4 != 4);
            }

            if (ch1 == 4) {
                System.out.println("Thank you...!");
            }

        } while (ch1 != 4);
    }
}
