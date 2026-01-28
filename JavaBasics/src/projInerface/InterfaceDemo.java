package projInerface;

import java.util.Scanner;

// ================= INTERFACE =================
interface Employee {
    void raiseSalary();
    void display();
}

// ================= BASE CLASS =================
abstract class BaseEmployee implements Employee {
    Scanner sc = new Scanner(System.in);

    int id, age;
    int salary;
    String name, desig;

    BaseEmployee() {
        System.out.print("Enter ID : ");
        id = sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Age : ");
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

// ================= CLERK =================
final class Clerk extends BaseEmployee {
    Clerk() {
        salary = 30000;
        desig = "CLERK";
    }

    public void raiseSalary() {
        salary += 10000;
        System.out.println("Clerk Salary Raised!");
    }
}

// ================= DEVELOPER =================
final class Dev extends BaseEmployee {
    Dev() {
        salary = 50000;
        desig = "DEVELOPER";
    }

    public void raiseSalary() {
        System.out.println("Developer has no increment policy!");
    }
}

// ================= MANAGER =================
final class Manager extends BaseEmployee {
    Manager() {
        salary = 90000;
        desig = "MANAGER";
    }

    public void raiseSalary() {
        salary += 50000;
        System.out.println("Manager Salary Raised!");
    }
}

// ================= TESTER =================
final class Tester extends BaseEmployee {
    Tester() {
        salary = 40000;
        desig = "TESTER";
    }

    public void raiseSalary() {
        salary += 5000;
        System.out.println("Tester Salary Raised!");
    }
}

// ================= MAIN CLASS =================
public class InterfaceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch1, ch2;

        Employee clerk = null;
        Employee dev = null;
        Employee manager = null;
        Employee tester = null;

        do {
            System.out.println("\n1) CREATE");
            System.out.println("2) DISPLAY");
            System.out.println("3) RAISE SALARY");
            System.out.println("4) EXIT");
            ch1 = sc.nextInt();

            // -------- CREATE --------
            if (ch1 == 1) {
                System.out.println("1) CLERK  2) DEV  3) MANAGER  4) TESTER");
                ch2 = sc.nextInt();

                if (ch2 == 1) clerk = new Clerk();
                else if (ch2 == 2) dev = new Dev();
                else if (ch2 == 3) manager = new Manager();
                else if (ch2 == 4) tester = new Tester();
            }

            // -------- DISPLAY --------
            if (ch1 == 2) {
                System.out.println("1) CLERK  2) DEV  3) MANAGER  4) TESTER");
                ch2 = sc.nextInt();

                if (ch2 == 1 && clerk != null) clerk.display();
                else if (ch2 == 2 && dev != null) dev.display();
                else if (ch2 == 3 && manager != null) manager.display();
                else if (ch2 == 4 && tester != null) tester.display();
                else System.out.println("No Record Found!");
            }

            // -------- RAISE SALARY --------
            if (ch1 == 3) {
                System.out.println("1) CLERK  2) DEV  3) MANAGER  4) TESTER");
                ch2 = sc.nextInt();

                if (ch2 == 1 && clerk != null) clerk.raiseSalary();
                else if (ch2 == 2 && dev != null) dev.raiseSalary();
                else if (ch2 == 3 && manager != null) manager.raiseSalary();
                else if (ch2 == 4 && tester != null) tester.raiseSalary();
                else System.out.println("No Record Found!");
            }

        } while (ch1 != 4);

        System.out.println("Thank you...!");
    }
}