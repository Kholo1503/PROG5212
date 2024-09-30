/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1poe_main;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Part1POE_main {

        public static void main(String[] args) {
        
//Creating the object of the scanner
        Scanner sc =new Scanner(System.in);

//Instance of the login external class
Login loginSystem;
loginSystem = new Login();

//Declaration
    String Username;
    String Password;
    String name;
    String surname;
    
    
    String loginUsername;
    String loginPassword;
        
//Prompt heading page
        System.out.println("______________________________________________");
        System.out.println("==========FILL IN YOUR DETAILS BELOW==========");
        System.out.println("______________________________________________");
        
//Prompt the users name and surname

System.out.println("Please enter Firstname: ");
name = sc.next();
System.out.println("Please enter Lastname: ");
surname = sc.next();

System.out.println("______________________________________________");
//The users registration
System.out.println("----------------REGISTER ACCOUNT--------------");
System.out.println("______________________________________________");
//Prompt user to create Username and Password
System.out.println("Create Username: ");
Username = sc.next();
System.out.println("Create Password");
Password = sc.next();

//User registeration
String registration = loginSystem.registerUser(Username, Password, name, surname);
System.out.println(registration);


//when registration is succesfull, it continues to login
if (registration.equals("The user has been registered!")){
    System.out.println("______________________________________________");
    System.out.println("-------LOGIN TO YOUR REGISTERED ACCOUNT-------");
    System.out.println("______________________________________________");
    System.out.println("Please enter your Username: ");
    loginUsername = sc.next();
    System.out.println("Please enter Password");
    loginPassword = sc.next();
    
    //Diplay the login message
    String loginStatus = loginSystem.LoginStatus(loginUsername, loginPassword);
    System.out.println(loginStatus);
}else{
    
    System.out.println("____________________________________________");
    
}
}
}



