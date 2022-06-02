package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                      EMPLOYEE MANAGEMENT SYSTEM                                                                 ");
        System.out.println("---------------------------------------------------------------------------------------");

        boolean condition = true;

        Scanner sc = new Scanner(System.in);
        while (condition){
            System.out.println("Enter 1 To Add Employee Details");
            System.out.println("Enter 2 To Update Employee Details");
            System.out.println("Enter 3 To View Specific Employee Details");
            System.out.println("Enter 4 To View All Employee Details ");
            System.out.println("Enter 5 To Remove Specific Employee");
            System.out.println("Enter 6 To Remove All Specific Employee ");
            System.out.println("Enter 0 To To Exit");

            int choice = sc.nextInt();

            switch (choice){
                case 0 : System.out.println("Do You Wants To Exit");
                         System.out.println("Enter 1 For YES");
                         System.out.println("Enter 2 For No");
                         int exitChoice = sc.nextInt();
                         if (exitChoice==2){
                             System.out.println("\n-----------Thanks For Using My Application-----------");
                             System.exit(0);
                         }

                case 1:
                        new EmployeeDetails().addEmployee();
                        System.out.println("Employee Details Added SuccessFully");
                        break;
                case 2 :
                        System.out.println("Enter Employee ID To Update Details");
                        int updateId = sc.nextInt();

                        new EmployeeDetails().updateEmployeeDetails(updateId);
                        break;
                case 3 :
                        System.out.println("Enter Employee ID To View Specific Employee Details");
                        int specificId = sc.nextInt();
                        new EmployeeDetails().displaySpecificDetails(specificId);;
                        break;
                case 4 : new EmployeeDetails().displayAllDetails();
                         break;
                case 5 : System.out.println("Enter Employee ID To Remove");
                         int removeId = sc.nextInt();
                         new EmployeeDetails().removeSpecificEmployee(removeId);
                         break;
                case 7 : new EmployeeDetails().removeAllEmployee();
                        break;
                default: System.out.println("Invalid Input");
            }
        }
    }
}
