package com.example.Polling.Application.Services;
import org.springframework.stereotype.Service;
import java.util.*;
@Service

public class UserServices {
static Scanner scn = new Scanner(System.in);
    public void menu() {
        System.out.println("Menu:");
        System.out.println("1. Sign in");
        System.out.println("2. Sign up");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = scn.nextInt();
        switch (choice) {
            case 1:
                System.out.println("user :");
                String userInput = scn.next();
                System.out.println("Enter Password");
                String userPass = scn.next();

                break;
            case 2:

                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;



        }
    }
}

