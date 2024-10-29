/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe_main;

/**
 * 
 * @author RC_Student_lab
 */

public class Login { 
    // Declaration of user details
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    
    public Login(String firstname, String lastname, String username,String password ) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;  
        this.password = password; 
    }
    
    public Login(){
    }
    
    //setter method
    public void setfirstname(String firstname){
        this.firstname = firstname;
    }
    public void setlastname(String lastname) {
        this.lastname = lastname;
    }
    public void setusername(String username) {
        this.username = username;
    }
     public void setpassword(String password){
        this.password = password;
    }
     
    //Getters for the methods
    public String getfirstname(){
        return this.firstname;
    }
    public String getusername(){
        return this.username;
    }
    public String getlastname(){
        return this.lastname;
    }
    public String getpassword(){
        return this.password;
    }
   
    // Check if the username is correctly formatted
    public boolean checkUsername() {
        // Username should contain "_" and be 5 or fewer characters
        return username.contains("_") && username.length() <= 5;
        }
    // Check if the password meets the complexity requirements
    public boolean checkcomplexityofpassword(){
        // Regular expression patterns for validation
        return password.length()>=8&&
        password.matches(".*[0-9].*")&&
        password.matches(".*[*-`~!@$%&_'^].*")&&
        password.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*");
    }
    
    // Register the user if the username and password are valid
    public String registerUser(){ 
        // Check if the username is valid
        if (!checkUsername()) {
        return "Username incorrectly formatted.";
        } 
        // Check if the password meets complexity requirements
        if (!checkcomplexityofpassword()) {
        return "The password does not meet the complexity requirements.";
        } 
        return "The username has been captured\nPassword has been captured!";
        }
    
    // Verify login details
    public boolean LoginUser(String username, String password) {
        // Check if the provided username and password match the registered details
        return this.username.equals(username) && 
        this.password.equals(password);
    }

    // Return the login status message
    public String returnLoginStatus(boolean LoginStatus) {
        if (LoginStatus) {
            return "Welcome! " + firstname + " " + lastname + ", it's great to see you again.";
        }
            return "Username or password incorrect, please try again.";
        }
        
        //Method to create account
        public void CreatAccount(String username, String password, String firstname, String lastname){
            this.username = username;
            this.password = password;
            this.firstname = firstname;
            this.lastname = lastname;
            //print if succesful
            System.out.println("account created successfully");
        }         
    }


