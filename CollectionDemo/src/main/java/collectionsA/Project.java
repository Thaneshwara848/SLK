package collectionsA;

import java.util.LinkedList;
import java.util.Scanner;

// ---------------- ABSTRACT EMPLOYEE ----------------
abstract class Employee {
    public int id, age;
    public int salary;
    public String name;
    public String desig;

    static Scanner sc = new Scanner(System.in);

    public Employee() {
        System.out.print("Enter ID : ");
        id = sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("-----------------------");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Salary      : " + salary);
        System.out.println("Designation : " + desig);
    }

    abstract void raiseSalary();
}

// ---------------- CLERK ----------------
final class Clerk extends Employee {
    public Clerk() {
        salary = 30000;
        desig = "CLERK";
    }

    @Override
    public void raiseSalary() {
        salary += 10000;
        System.out.println("Clerk salary raised");
    }
}

// ---------------- DEVELOPER ----------------
final class Dev extends Employee {
    public Dev() {
        salary = 50000;
        desig = "DEVELOPER";
    }

    @Override
    public void raiseSalary() {
        salary += 5000;
        System.out.println("Developer salary raised");
    }
}

// ---------------- MANAGER ----------------
final class Manager extends Employee {
    public Manager() {
        salary = 90000;
        desig = "MANAGER";
    }

    @Override
    public void raiseSalary() {
        salary += 10000;
        System.out.println("Manager salary raised");
    }
}

// ---------------- TESTER ----------------
final class Tester extends Employee {
    public Tester() {
        salary = 40000;
        desig = "TESTER";
    }

    @Override
    public void raiseSalary() {
        salary += 15000;
        System.out.println("Tester salary raised");
    }
}

// ---------------- MAIN CLASS ----------------
public class Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Employee> list = new LinkedList<>();

        int mainChoice, subChoice;

        do {
            System.out.println("\n===== EMPLOYEE MENU =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Raise Salary");
            System.out.println("4. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            mainChoice = sc.nextInt();

            switch (mainChoice) {

                // -------- CREATE --------
                case 1:
                    do {
                        System.out.println("\n--- Select Employee Type ---");
                        System.out.println("1. Clerk");
                        System.out.println("2. Developer");
                        System.out.println("3. Manager");
                        System.out.println("4. Tester");
                        System.out.println("5. Back");
                        System.out.print("Enter choice: ");
                        subChoice = sc.nextInt();

                        if (subChoice == 1) list.add(new Clerk());
                        else if (subChoice == 2) list.add(new Dev());
                        else if (subChoice == 3) list.add(new Manager());
                        else if (subChoice == 4) list.add(new Tester());

                    } while (subChoice != 5);
                    break;

                // -------- DISPLAY --------
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No Employee Found");
                    } else {
                        for (Employee e : list) {
                            e.display();
                        }
                    }
                    break;

                // -------- RAISE SALARY --------
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("No Employee Found");
                    } else {
                        for (Employee e : list) {
                        	
                            e.raiseSalary();
                        }
                    }
                    break;

              
                 // -------- DELETE EMPLOYEE --------
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("No Employee Found");
                    } else {
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = sc.nextInt();

                        boolean found = false;

                        java.util.Iterator<Employee> itr = list.iterator();
                        while (itr.hasNext()) {
                            Employee e = itr.next();
                            if (e.id == deleteId) {
                                itr.remove();   // SAFE remove
                                found = true;
                                System.out.println("Employee removed successfully");
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Employee ID not found");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you...!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (mainChoice != 5);
    }
}
