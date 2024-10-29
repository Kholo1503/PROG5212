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
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    public Login() {}

    // Setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Validate username format
    public boolean checkUsername() {
        return username.contains("_") && username.length() <= 5;
    }

    // Check password complexity
    public boolean checkComplexityOfPassword() {
        return password.length() >= 8 &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[-~!@$%&_'^].*") &&
                password.matches(".*[A-Z].*");
    }

    // Register user
    public String registerUser() {
        if (!checkUsername()) {
            return "Username incorrectly formatted.";
        }
        if (!checkComplexityOfPassword()) {
            return "The password does not meet the complexity requirements.";
        }
        return "Username successfully captured\nPassword successfully captured!";
    }

    // Login user
    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Return login status message
    public String returnLoginStatus(boolean loginStatus) {
        if (loginStatus) {
            return "Welcome! " + firstname + " " + lastname + ", it's great to see you again.";
        }
        return "Username or password incorrect, please try again.";
    }

    // Create account
    public void createAccount(String username, String password, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
