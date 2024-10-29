/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.part1poe_main;

import java.util.Scanner;
/**
 * 
 * @author RC_Student_lab
 */

public class POEPart1main {

    public static void main(String[] args) {
        
        // Instance of the login external class
        Login system = new Login();
        // Creating the object of the scanner
        Scanner sc = new Scanner(System.in);
        //returning if the function is false
        boolean isAccountCreated = false;
       
        System.out.println("HI, PLEASE CREATE AN ACCOUNT");
        //using a while loop to repeat the process
        while (!isAccountCreated){
        // Prompt heading page
        System.out.println("______________________________________________");
        System.out.println("========== FILL IN YOUR DETAILS BELOW ==========");
        System.out.println("______________________________________________");

        // Prompt the user for name and surname
        System.out.println("Please enter Firstname: ");
        String firstName = sc.nextLine();
        system.setfirstname(firstName);
        System.out.println("Please enter Lastname: ");
        String lastName = sc.nextLine();
        system.setlastname(lastName);

        System.out.println("______________________________________________");
        // User registration
        System.out.println("---------------- REGISTER ACCOUNT --------------");
        System.out.println("______________________________________________");

        // Prompt user to create Username and Password
        System.out.println("Create Username: ");
        String username = sc.nextLine();
        system.setusername(username);
        System.out.println("Create Password: ");
        String password = sc.nextLine();
        system.setpassword(password);
        // User registration
        String registrationStatus = system.registerUser();
        System.out.println(registrationStatus);

        // When registration is successful, continue to login
        if (registrationStatus.contains("The user has been registered!")) {
            system.CreatAccount(username, password, firstName, lastName);
            isAccountCreated = true;
        }
        }
        
            System.out.println("______________________________________________");
            System.out.println("------- LOGIN TO YOUR REGISTERED ACCOUNT -------");
            System.out.println("______________________________________________");
            //using whileloop if it is a false input
            boolean loginStatus = false;
            
            while (!loginStatus){
            //prompt username
            System.out.println("Please enter your Username: ");
            String loginUsername = sc.nextLine();
            System.out.println("Please enter Password: ");
            String loginPassword = sc.nextLine();

            // Display the login message
            loginStatus = system.LoginUser(loginUsername, loginPassword);
            
            String loginMessage = system.returnLoginStatus(loginStatus);
            System.out.println(loginMessage);
    }
    }
    }




