/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe_main;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */
public class Task {
    
    
   private String firstName;
   private String lastName;
   private String username;
   private String password;
  
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskStatus;
    private int taskNumber = 0;
    
 public Task()   {
 }
 /**
 taskName
 taskDescription
 developerDetails
 taskDuration
 taskStatus
 */
        
 public Task(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
    }
    
 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }
 public void setLastName(String lastName) {
     this.lastName = lastName;
 }
 public void setUsername(String username) {
     this.username = username;
 }
 public void setPassword(String password) {
     this.password = password;
 }

public String registerUser(){
    return "Account successfully created for" + username;
}


/*
username
password
firstName
lastName
*/
        
public void createAccount(String username, String password, String firstName, String lastName){
    this.username = username;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
}

/*
username
password
*/
        
public boolean loginUser (String username, String password) {
    return this.username.equals(username) && this.password.equals(password);
}

/*
loginStatus
*/
        
public String returnLoginStatus(boolean loginStatus) {
    return loginStatus ? "Login successful" : "Login failed";
}

public boolean checkTaskDescription() {
    return this.taskDescription.length() <=50;
}

public String createTaskID() {
    return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
}     
 
public String printTaskDetails() {
    return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskNumber +
            "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + createTaskID() +
            "\nDuration: " + taskDuration + "hours";
}

public int getTaskDuration() {
    return this.taskDuration;
}
}
