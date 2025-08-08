package com.day_8;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Library Book Management System ---");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Find Book by Index");
            System.out.println("4. Update Book Title");
            System.out.println("5. Remove Book by Index");
            System.out.println("6. Remove Book by Title");
            System.out.println("7. Check if Book Exists");
            System.out.println("8. Show Total Books");
            System.out.println("9. Clear All Records");
            System.out.println("10. Find First/Last Index of a Book");
            System.out.println("11. Check if Book List is Empty");
            System.out.println("12. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  
            
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String bookTitle = sc.nextLine();
                    books.add(bookTitle);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.println("\nBooks in Library:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter index to find: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < books.size()) {
                        System.out.println("Book at index " + idx + ": " + books.get(idx));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to update: ");
                    int updateIdx = sc.nextInt();
                    sc.nextLine();
                    if (updateIdx >= 0 && updateIdx < books.size()) {
                        System.out.print("Enter new book title: ");
                        String newTitle = sc.nextLine();
                        books.set(updateIdx, newTitle);
                        System.out.println("Book title updated.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to remove: ");
                    int removeIdx = sc.nextInt();
                    if (removeIdx >= 0 && removeIdx < books.size()) {
                        books.remove(removeIdx);
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 6:
                    System.out.print("Enter title to remove: ");
                    String removeTitle = sc.nextLine();
                    if (books.remove(removeTitle)) {
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter title to check: ");
                    String checkTitle = sc.nextLine();
                    if (books.contains(checkTitle)) {
                        System.out.println("Book exists in the library.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 8:
                    System.out.println("Total number of books: " + books.size());
                    break;

                case 9:
                    books.clear();
                    System.out.println("All book records cleared.");
                    break;

                case 10:
                    System.out.print("Enter book title to search index: ");
                    String searchTitle = sc.nextLine();
                    int firstIndex = books.indexOf(searchTitle);
                    int lastIndex = books.lastIndexOf(searchTitle);
                    if (firstIndex != -1) {
                        System.out.println("First Index: " + firstIndex);
                        System.out.println("Last Index: " + lastIndex);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 11:
                    if (books.isEmpty()) {
                        System.out.println("Book list is empty.");
                    } else {
                        System.out.println("Book list is not empty.");
                    }
                    break;

                case 12:
                    System.out.println("Exiting Library System...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
            sc.close();
       }
    }
}
