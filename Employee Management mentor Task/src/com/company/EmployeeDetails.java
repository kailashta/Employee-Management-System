package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeDetails implements Insertion,Deletion,Display{

    Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee() {
        Employee emp = new Employee();
        System.out.println("Enter Name");
        emp.setName(sc.nextLine());
        System.out.println("Enter ID");
        emp.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Role");
        emp.setRole(sc.nextLine()); 
        System.out.println("Enter Department");
        emp.setDepartment(sc.nextLine());
        System.out.println("Enter experience");
        emp.setExperience(sc.nextInt());
        System.out.println("Enter Salary");
        emp.setSalary(sc.nextDouble());
        System.out.println("Enter Phone Number");
        emp.setPhoneNumber(sc.nextLong());
        sc.nextLine();
        System.out.println("Enter Email Id");
        emp.setEmailId(sc.nextLine());
        employees.add(emp);
        System.out.println(employees.size());
    }

    @Override
    public void updateEmployeeDetails(int id ) {
        boolean condition = false;
        int index = 0;
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getId()==id){
                condition = true;
                index = i;
            }
        }
        if (!condition){
            System.out.println("There is No Employee With ID : " + id);
        }
        else{
            System.out.println("How Many Changes Do You Wants To Make");
            int changesCount = sc.nextInt();
            for (int i=0;i<changesCount;i++){
                System.out.println("Enter 1 To Change Name");
                System.out.println("Enter 2 To Change Role");
                System.out.println("Enter 3 To Change Department");
                System.out.println("Enter 4 To Change Experience");
                System.out.println("Enter 5 To Change Salary");
                System.out.println("Enter 6 To Change Phone Number");
                System.out.println("Enter 7 To Change Email ID");
                int choice = sc.nextInt();

                switch (choice){

                    case 1 : System.out.println("Enter New Name");
                            sc.nextLine();
                            String newName =  sc.nextLine();
                            while(newName.equals(employees.get(index).getName())){
                                System.out.println("The Old and New names Are same ");
                                System.out.println("Do You Wants To Change Name Again");
                                System.out.println("Enter 1 For Yes");
                                System.out.println("Enter 2 For No ");
                                int matchRepeatChoice = sc.nextInt();
                                if (matchRepeatChoice == 2){
                                    break;
                                }
                                else if (matchRepeatChoice==1){
                                    sc.nextLine();
                                    System.out.println("Enter Name");
                                    newName = sc.nextLine();
                                }
                                else{
                                    System.out.println("Invalid Input");
                                }
                            }
                            employees.get(index).setName(newName);
                            System.out.println("Name updated SuccessFully");
                            break;
                    case 2 :  System.out.println("Enter New Role");
                              sc.nextLine();
                              String newRole = sc.nextLine();
                              while(newRole.equals(employees.get(index).getRole())){
                                  System.out.println("The Old and New Role Are same ");
                                  System.out.println("Do You Wants To Change Role Again");
                                  System.out.println("Enter 1 For Yes");
                                  System.out.println("Enter 2 For No ");
                                  int matchRepeatChoice = sc.nextInt();
                                  if (matchRepeatChoice == 2){
                                    break;
                                  }
                                  else if (matchRepeatChoice==1){
                                      sc.nextLine();
                                      System.out.println("Enter Role");
                                      newRole = sc.nextLine();
                                  }
                                  else{
                                      System.out.println("Invalid Input");
                                  }
                              }
                              employees.get(index).setRole(newRole);
                              System.out.println("Role updated SuccessFully");
                              break;
                    case 3 : System.out.println("Enter New Department");
                             sc.nextLine();
                             String newDepartment = sc.nextLine();
                             while(newDepartment.equals(employees.get(index).getDepartment())){
                                   System.out.println("The Old and New Department Are same ");
                                   System.out.println("Do You Wants To Change Department Again");
                                   System.out.println("Enter 1 For Yes");
                                   System.out.println("Enter 2 For No ");
                                   int matchRepeatChoice = sc.nextInt();
                                   if (matchRepeatChoice == 2){
                                        break;
                                    }
                                    else if (matchRepeatChoice==1){
                                        sc.nextLine();
                                        System.out.println("Enter Department");
                                        newDepartment = sc.nextLine();
                                    }
                                    else{
                                     System.out.println("Invalid Input");
                                 }
                             }
                             employees.get(index).setDepartment(newDepartment);
                             System.out.println("Department updated SuccessFully");
                             break;
                    case 4 : System.out.println("Enter New Experience");
                            int newExperience = sc.nextInt();
                            while(newExperience==(employees.get(index).getExperience())){
                                  System.out.println("The Old and New Experience Are same ");
                                  System.out.println("Do You Wants To Change Experience Again");
                                  System.out.println("Enter 1 For Yes");
                                  System.out.println("Enter 2 For No ");
                                  int matchRepeatChoice = sc.nextInt();
                                  if (matchRepeatChoice == 2){
                                        break;
                                  }
                                  else if (matchRepeatChoice==1){
                                      System.out.println("Enter Experience");
                                      newExperience = sc.nextInt();
                                  }
                                  else{
                                    System.out.println("Invalid Input");
                                }
                            }
                            employees.get(index).setExperience(newExperience);
                        System.out.println("Experience updated SuccessFully");
                            break;
                    case 5 : System.out.println("Enter New Salary");
                             double newSalary = sc.nextDouble();
                             while(newSalary==(employees.get(index).getSalary())){
                                 System.out.println("The Old and New Salary Are same ");
                                 System.out.println("Do You Wants To Change Salary Again");
                                 System.out.println("Enter 1 For Yes");
                                 System.out.println("Enter 2 For No ");
                                 int matchRepeatChoice = sc.nextInt();
                                 if (matchRepeatChoice == 2){
                                    break;
                                 }
                                 else if (matchRepeatChoice==1){
                                     System.out.println("Enter Salary");
                                    newSalary = sc.nextDouble();
                                 }
                                 else{
                                     System.out.println("Invalid Input");
                                 }
                             }
                             employees.get(index).setSalary(newSalary);
                        System.out.println("salary updated SuccessFully");
                             break;
                    case 6 : System.out.println("Enter New Phone Number");
                             long newPhoneNumber = sc.nextLong();
                        while(newPhoneNumber==(employees.get(index).getPhoneNumber())){
                            System.out.println("The Old and New PhoneNumber Are same ");
                            System.out.println("Do You Wants To Change PhoneNumber Again");
                            System.out.println("Enter 1 For Yes");
                            System.out.println("Enter 2 For No ");
                            int matchRepeatChoice = sc.nextInt();
                            if (matchRepeatChoice == 2){
                                break;
                            }
                            else if (matchRepeatChoice==1){
                                System.out.println("Enter PhoneNumber");
                                newPhoneNumber = sc.nextLong();
                            }
                            else{
                                System.out.println("Invalid Input");
                            }
                        }
                        employees.get(index).setPhoneNumber(newPhoneNumber);
                        System.out.println("Phone Number updated SuccessFully");
                        break;
                    case 7 : System.out.println("Enter New Email ID");
                        sc.nextLine();
                        String newEmailId = sc.nextLine();
                        while(newEmailId.equals(employees.get(index).getEmailId())){
                            System.out.println("The Old and New Email ID Are same ");
                            System.out.println("Do You Wants To Change Email ID Again");
                            System.out.println("Enter 1 For Yes");
                            System.out.println("Enter 2 For No ");
                            int matchRepeatChoice = sc.nextInt();
                            if (matchRepeatChoice == 2){
                                break;
                            }
                            else if (matchRepeatChoice == 1){
                                sc.nextLine();
                                System.out.println("Enter Email ID");
                                newEmailId = sc.nextLine();
                            }
                            else{
                                System.out.println("Invalid Input");
                            }
                        }
                        employees.get(index).setEmailId(newEmailId);
                        System.out.println("Email ID updated SuccessFully");
                        break;
                    default: System.out.println("Invalid Input");
                }
            }
            System.out.println("Employee Details Updated Successfully");
        }
    }

    @Override
    public void removeAllEmployee() {
        if (employees.isEmpty()){
            System.out.println("There is No Employee Data To Delete");
        }
        else{
            employees.clear();
            System.out.println("All Employee Data Removed Successfully");
        }

    }

    @Override
    public void removeSpecificEmployee(int id) {
        boolean  idMatched = false;
        for (Employee e : employees){
            if (e.getId()==id){
                idMatched = true;
                employees.remove(e);
                System.out.println("The Employee Details Removed Successfully");
            }
        }
        if (idMatched==false && employees.size()>0){
            System.out.println("There is No Employee With ID : "+ id);
        }
    }

    @Override
    public void displayAllDetails() {
        if (employees.isEmpty()){
            System.out.println("There is No Data To Display");
        }
        else{
           // System.out.printf("%10s %20s %5s %5s %10s %10s %20s  %20s","ID" , "NAME " , "ROLE","EXPERIENCE","SALARY","PHONE NUMBER","EMAIL ID");
                for (Employee e: employees) {
                  /*  System.out.printf("%10s %20s %5s %5s %10s %10s %20s %20s %20s ",e.getId(),e.getName(),e.getRole(),
                            e.getDepartment(),e.getExperience(),e.getSalary(),e.getPhoneNumber(),e.getEmailId());
                    System.out.println();
                */
                System.out.println(" ID : " + e.getId());
                System.out.println(" Name : " + e.getName());
                System.out.println(" Role : " + e.getRole());
                System.out.println(" Department : " + e.getDepartment());
                System.out.println(" Experience : " + e.getExperience());
                System.out.println(" Salary : " + e.getSalary());
                System.out.println(" Phone Number : " + e.getPhoneNumber());
                System.out.println(" EmailID : " + e.getEmailId());
                System.out.println("\n");
            }
        }


    }

    @Override
    public void displaySpecificDetails(int id) {
        boolean idMatched = false;
        for (Employee e:employees){
            if (e.getId()==id){
                idMatched = true;
               /* System.out.format("%10s %20s %5s %5s %10s %10s %20s %25s","ID" , "NAME " , "ROLE","EXPERIENCE","SALARY","PHONE NUMBER","EMAIL ID");
                System.out.printf("%10s %20s %5s %5s %10s %10s %20s %25s",e.getId(),e.getName(),e.getRole(),e.getDepartment(),e.getExperience(),e.getSalary(),e.getPhoneNumber(),e.getEmailId());
                System.out.println("display specific student details");
                */
                System.out.println(" ID : "+e.getId());
                System.out.println(" Name : "+e.getName());
                System.out.println(" Role : "+e.getRole());
                System.out.println(" Department : "+e.getDepartment());
                System.out.println(" Experience : " + e.getExperience());
                System.out.println(" Salary : "+ e.getSalary());
                System.out.println(" Phone Number : "+e.getPhoneNumber());
                System.out.println(" EmailID : "+e.getEmailId());
                System.out.println();
            }
        }
        if(!false){
            System.out.println("There is No Employee With ID : "+ id);
        }
    }

}
