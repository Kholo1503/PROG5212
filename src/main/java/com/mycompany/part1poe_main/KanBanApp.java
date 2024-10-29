/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe_main;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class KanBanApp {
    
    private static int totalHours = 0;
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Hi, Please create an Account");
        Task system = new Task();
        boolean isAccountCreated = false;
        
        //loop for account created
        while (!isAccountCreated) {
            String firstName = JOptionPane.showInputDialog("Enter First Name: ");
            system.setFirstName(firstName);
            String lastName = JOptionPane.showInputDialog("Enter Last Name: ");
            system.setLastName(lastName);
            String username = JOptionPane.showInputDialog("Enter Username: ");
            system.setUsername(username);
            String password = JOptionPane.showInputDialog("Enter Password: ");
            system.setPassword(password);
            String registrationStatus = system.registerUser();
            JOptionPane.showMessageDialog(null, registrationStatus);
            if (registrationStatus.contains("successfully")) {
                system.createAccount(username, password, firstName, lastName);
                isAccountCreated = true;
            }
        }
        
        //user login process
        boolean loginStatus = false;
        while (!loginStatus) {
            String loginUsername = JOptionPane.showInputDialog("Enter Username: ");
            String loginPassword =  JOptionPane.showInputDialog("Enter Password: ");
            loginStatus = system.loginUser(loginUsername, loginPassword);
            String loginMessage = system.returnLoginStatus(loginStatus);
            JOptionPane.showMessageDialog(null, loginMessage);
        }
        // kanban functioning after successfully login
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        String input = JOptionPane.showInputDialog("How many tasks do you wish to enter?");
        int numTasks = Integer.parseInt(input);
        //create task based on on user input
        for (int i = 0; i < numTasks; i++) {
            addTask();
        }
        //display total hours of tasks
        JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);
    }
    
    
    private static void addTask(){
        //prompt user for task details
        String taskName = JOptionPane.showInputDialog("Enter Task Name: ");
        String taskDescription = JOptionPane.showInputDialog("Enter Task Description (max of 50 characters): ");
        //Ensure task descripturre is within the 50 character limit
        while (taskDescription.length() >50) {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            taskDescription = JOptionPane.showInputDialog("Enter Task Diuration (max 50 chars): ");
        }
        //collect remaining task details
        String developerDetails = JOptionPane.showInputDialog("Enter Developer Details (First & Last name ");
        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours): "));
        String taskStatus = (String) JOptionPane.showInputDialog(null, 
                "Select Task Status:",
                "Task Status",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"To Do", "Doing", "Done"},
                "To Do");
        //Create a new task using the Task class
        Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);
        if (task.checkTaskDescription()) {
            //if task description is valid, add task duration to total and display task details
            totalHours += task.getTaskDuration();
            JOptionPane.showMessageDialog(null, task.printTaskDetails());
        }else{
            //if task description is too long, update the user
            JOptionPane.showMessageDialog(null, "Task description is too long.");
        }
    }
}
             

