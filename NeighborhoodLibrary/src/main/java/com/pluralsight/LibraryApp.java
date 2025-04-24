package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {

    static Book[] theBooks = {
            new Book(1, "1234", "Philosophers Stone"),
            new Book(2, "5678", "Rush Hour 1"),
            new Book(3, "9098", "Rush Hour 2"),
            new Book(4, "3421", "Rush Hour 3"),
            new Book(5, "6743", "Assassin")
    };

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        int userMainMenuChoice = mainMenu();
        System.out.println(userMainMenuChoice);

        switch (userMainMenuChoice){

            case 1:
                System.out.println("the user wants to see the available books");
                break;
            default:
                System.out.println("Invalid Choice");
            case 2:
                System.out.println("the user wants to see the checked out book");
            default
        }


    }

    static int mainMenu(){
        System.out.println("Welcome to the library:\n");

        System.out.println("What would you like to do?");
        System.out.println("1: View Available Books");
        System.out.println("2: View checkout Books");
        System.out.println("3: Exit the library");

        return theScanner.nextInt();


    }

    static int viewAvailableBooks(){

        System.out.println("These are the available books!\n");

        for (int i = 0; i < theBooks.length; i++){

            Book currentbook = theBooks[i];

            System.out.println(currentbook.getTitle());
        }
        return 0;
    }


}
