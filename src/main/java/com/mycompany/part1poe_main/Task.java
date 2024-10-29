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

    // No-argument constructor
    public Task() {
        // You can initialize default values here if needed
    }

    // Constructor with parameters for all task fields
    public Task(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
    }

    // Getter for taskDuration
    public int getTaskDuration() {
        return this.taskDuration;
    }

    // Method to check if the task description is within the allowed length
    public boolean checkTaskDescription() {
        return this.taskDescription != null && this.taskDescription.length() <= 50;
    }

    // Method to generate a unique Task ID
    public String createTaskID() {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
    }

    // Method to print task details
    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskNumber +
               "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + createTaskID() +
               "\nDuration: " + taskDuration + " hours";
    }
}


