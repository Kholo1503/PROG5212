// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
//  */

// package com.mycompany.part1poe_main;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// public class UnitTestingPart1 {

//     /**
//      * Test of CheckUsername method, of class Login.
//      */
// private Login system;

//     @BeforeEach
//     public void setup() {
//         // Initialize a new instance of Login before each test
//         system = new Login(); 
//     }

//     @Test
//     public void testUsernameCorrectlyFormatted() {
//         system.setusername("kwez_");
//         assertTrue(system.checkUsername(), "Username should be correctly formatted");
//     }

//     @Test
//     public void testUsernameIncorrectlyFormatted() {
//         system.setusername("kwezi1111111!");
//         assertFalse(system.checkUsername(), "Username should be incorrectly formatted");
//     }

//     @Test
//     public void testPasswordMeetsComplexityRequirements() {
//         system.setpassword("Kholo218!*");
//         assertTrue(system.checkcomplexityofpassword(), "Password should meet complexity requirements");
//     }

//     @Test
//     public void testPasswordDoesNotMeetComplexityRequirements() {
//         system.setpassword("bbbbn2");
//         assertFalse(system.checkcomplexityofpassword(), "Password should not meet complexity requirements");
//     }

//     @Test
//     public void testRegisterUserValidUsernameAndPassword() {
//         system.setusername("kwez_");
//         system.setpassword("Kholo218!*");
//         String registrationStatus = system.registerUser();
//         assertEquals("Username successfully captured\nPassword successfully captured", registrationStatus, 
//                      "The registration should be successful with valid username and password.");
//     }

//     @Test
//     public void testRegisterUserInvalidUsername() {
//         system.setusername("kwhhhhhhhhhhh");
//         system.setpassword("Ch&&sec@ke99!");
//         String registrationStatus = system.registerUser();
//         assertEquals("Username is not in the correct format.", 
//                      registrationStatus, 
//                      "The registration should fail with an invalid username.");
//     }

//     @Test
//     public void testRegisterUserInvalidPassword() {
//         system.setusername("kwez_");
//         system.setpassword("hffyhhgbjj");
//         String registrationStatus = system.registerUser();
//         assertEquals("Password is not in the correct format.", 
//                      registrationStatus, 
//                      "The registration should fail with an invalid password.");
//     }

//     @Test
//     public void testLoginSuccess() {
//         system.CreatAccount("kwez_", "Kholo218!*", "Kholiswa", "Dhladhla");
//         boolean loginStatus = system.LoginUser("kwez_", "Kholo218!*");
//         assertTrue(loginStatus, "Login should be successful with correct username and password.");
//     }

//     @Test
//     public void testLoginFailure() {
//         system.CreatAccount("kwx991", "42!", "kholiswa", "Dhladla");
//         boolean loginStatus = system.LoginUser("kyuuhu", "bluhhnn4");
//         assertFalse(loginStatus, "Login should fail with incorrect password.");
//     }

//     @Test
//     public void testReturnLoginStatusSuccess() {
//         system.CreatAccount("kwez_", "Kholo218!*", "Kholiswa", "Dhladhla");
//         boolean loginStatus = system.LoginUser("kwez_", "Kholo218!*");
//         String loginMessage = system.returnLoginStatus(loginStatus);
//         assertEquals("Welcome Kholiswa, Dhladhla, it's great to see you again.", 
//                      loginMessage, 
//                      "The login status message should indicate a successful login.");
//     }

//     @Test
//     public void testReturnLoginStatusFailure() {
//         system.CreatAccount("kwez**kkkk", "lllkkkkkkkkkkkkkkkkkk", "Kholiswa", "Dhladhla");
//         boolean loginStatus = system.LoginUser("kwez**kkkkk", "wlllkkkk");
//         String loginMessage = system.returnLoginStatus(loginStatus);
//         assertEquals("Username or password is incorrect, please try again", 
//                      loginMessage, 
//                      "The login status message should indicate a failed login.");
//     }
// }


