package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 15 - Password Validation
Passwords are validated by comparing a user-provided value with a known value that’s stored. Either it’s correct or it’s not.

Create a simple program that validates user login credentials. The program must prompt the user for a username and password. The program should compare the password given by the user to a known password. If the password matches, the program should display “Welcome!” If it doesn’t match, the program should display “I don’t know you.”

Example Output
What is the password? 12345
I don't know you.
Or

What is the password? abc$123
Welcome!
Constraints
Use an if/else statement for this problem.
Make sure the program is case sensitive.
 */
import java.util.Scanner;
public class App {
    public static void main (String[]args)
    {
        final String its_password = "abc$123";
        Scanner in = new Scanner(System.in);
        System.out.print("What is the password?");
        String The_Password = in.next();

        if ( The_Password.equals(its_password)){
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you ");
        }
    }
}

