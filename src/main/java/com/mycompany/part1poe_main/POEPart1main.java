/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe_main;

/**
 * 
 * @author RC_Student_lab
 */

import javax.swing.JOptionPane;

public class POEPart1main {
    private static int totalHours = 0;

    public static void main(String[] args) {
        Login loginSystem = new Login();
        JOptionPane.showMessageDialog(null, "Hi, Please create an Account");

        Task system = new Task();
        boolean isAccountCreated = false;

        // Loop for account creation
        while (!isAccountCreated) {
            String firstName = JOptionPane.showInputDialog("Enter First Name: ");
            loginSystem.setFirstname(firstName);
            String lastName = JOptionPane.showInputDialog("Enter Last Name: ");
            loginSystem.setLastname(lastName);
            String username = JOptionPane.showInputDialog("Enter Username: ");
            loginSystem.setUsername(username);
            String password = JOptionPane.showInputDialog("Enter Password: ");
            loginSystem.setPassword(password);

            String registrationStatus = loginSystem.registerUser();
            JOptionPane.showMessageDialog(null, registrationStatus);

            if (registrationStatus.contains("captured")) {
                loginSystem.createAccount(username, password, firstName, lastName);
                isAccountCreated = true;
            }
        }

        // User login process
        boolean loginStatus = false;
        while (!loginStatus) {
            String loginUsername = JOptionPane.showInputDialog("Enter Username: ");
            String loginPassword = JOptionPane.showInputDialog("Enter Password: ");
            loginStatus = loginSystem.loginUser(loginUsername, loginPassword);
            String loginMessage = loginSystem.returnLoginStatus(loginStatus);
            JOptionPane.showMessageDialog(null, loginMessage);
        }

        // Kanban functionality after successful login
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        String input = JOptionPane.showInputDialog("How many tasks do you wish to enter?");
        int numTasks = Integer.parseInt(input);

        // Create task based on user input
        for (int i = 0; i < numTasks; i++) {
            addTask();
        }

        // Display total hours of tasks
        JOptionPane.showMessageDialog(null, "Total Hours: " + totalHours);
    }

    private static void addTask() {
        String taskName = JOptionPane.showInputDialog("Enter Task Name: ");
        String taskDescription = JOptionPane.showInputDialog("Enter Task Description (max of 50 characters): ");
    
        // Ensure task description is provided and not empty
        while (taskDescription == null || taskDescription.isEmpty() || taskDescription.length() > 50) {
            JOptionPane.showMessageDialog(null, "Please enter a valid task description with less than 50 characters.");
            taskDescription = JOptionPane.showInputDialog("Enter Task Description (max 50 chars): ");
        }
    
        String developerDetails = JOptionPane.showInputDialog("Enter Developer Details (First & Last name)");
        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours): "));
        String taskStatus = (String) JOptionPane.showInputDialog(null,
                "Select Task Status:",
                "Task Status",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"To Do", "Doing", "Done"},
                "To Do");
    
        // Create a new task using the Task class
        Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);
    
        // Validate and display task details if description is correct
        if (task.checkTaskDescription()) {
            totalHours += task.getTaskDuration();
            JOptionPane.showMessageDialog(null, task.printTaskDetails());
        } else {
            JOptionPane.showMessageDialog(null, "Task description is too long.");
        }
    }    
}
