// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
//  */
// package com.mycompany.part1poe_main;

// import org.junit.jupiter.api.*;
// import static org.junit.jupiter.api.Assertions.*;
// import java.io.ByteArrayInputStream;
// import java.io.ByteArrayOutputStream;
// import java.io.InputStream;
// import java.io.PrintStream;

// /**
//  *
//  * @author RC_Student_lab
//  */
// public class KanBanAppTest {
    
//     private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//     private final PrintStream originalOut = System.out;
//     private final InputStream originalIn = System.in;

//     @BeforeEach
//     public void setUpStreams() {
//         System.setOut(new PrintStream(outContent));
//     }

//     @AfterEach
//     public void restoreStreams() {
//         System.setOut(originalOut);
//         System.setIn(originalIn);
//     }

//     @Test
//     public void testMainMethodFlow() {
//         // Simulate user input for account creation, login, and task creation
//         String input = "John\nDoe\nuser1\npass123\nuser1\npass123\n1\nTask1\nDescription\nJohn Doe\n2\nTo Do\n";
//         InputStream in = new ByteArrayInputStream(input.getBytes());
//         System.setIn(in);

//         // Run the main method
//         KanbanApp.main(new String[]{});

//         // Assert that the output contains expected messages
//         String output = outContent.toString();
//         assertTrue(output.contains("Welcome to EasyKanban"));
//         assertTrue(output.contains("Total Hours: 2"));
//     }

//     @Test
//     public void testInvalidTaskDescription() {
//         // Simulate user input with an invalid task description (over 50 characters)
//         String input = "John\nDoe\nuser1\npass123\nuser1\npass123\n1\nTask1\n" + 
//                        "This is a very long description that exceeds fifty characters limit\n" +
//                        "Short description\nJohn Doe\n2\nTo Do\n";
//         InputStream in = new ByteArrayInputStream(input.getBytes());
//         System.setIn(in);

//         // Run the main method
//         KanbanApp.main(new String[]{});

//         // Assert that the output contains the error message for long description
//         String output = outContent.toString();
//         assertTrue(output.contains("Please enter a task description of less than 50 characters"));
//     }

//     @Test
//     public void testMultipleTasks() {
//         // Simulate user input for creating multiple tasks
//         String input = "John\nDoe\nuser1\npass123\nuser1\npass123\n2\n" +
//                        "Task1\nDescription1\nJohn Doe\n2\nTo Do\n" +
//                        "Task2\nDescription2\nJane Doe\n3\nDoing\n";
//         InputStream in = new ByteArrayInputStream(input.getBytes());
//         System.setIn(in);

//         // Run the main method
//         KanbanApp.main(new String[]{});

//         // Assert that the output contains the total hours for both tasks
//         String output = outContent.toString();
//         assertTrue(output.contains("Total Hours: 5"));
//     }
// }

   
   
