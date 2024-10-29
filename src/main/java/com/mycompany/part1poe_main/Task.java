/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe_main;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
   
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
 
 public int getTaskDuration(){
     return this.taskDuration;
     
 }


public boolean checkTaskDescription() {
    return this.taskDescription != null && this.taskDescription.length() <= 50;
    
}

public String createTaskID() {
    return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
}     
 
public String printTaskDetails() {
    return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskNumber +
            "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + createTaskID() +
            "\nDuration: " + taskDuration + "hours";
}
}
