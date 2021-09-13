/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */


package org.example;

import java.util.Scanner;

public class ex16 {

    // main
    public static void main(String[] args) {

        // passes to can_drive
        can_drive();

    }

    // determines if the user can drive based off their age
    public static void can_drive() {

        // prompts for input and stores in age
        System.out.println("What is your age? ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        // ternary operator stores proper statement in msg and then output is printed
        String msg = (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(msg);

    }
}
