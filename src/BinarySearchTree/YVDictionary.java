// Cameron Bartlett
// CS&145
// Lab 6
// Binary Search Tree

// For extra credit I:
// 1. Added an introduction
// 2. Added a menu with options of adding and modifying the entry

package BinarySearchTree;

import java.util.Scanner;

public class YVDictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree dispBinaryTree = new BinaryTree();
        
        // Introduction
        System.out.println("Hello! This program is a dictionary!");
        System.out.println("Here you can add, store and search data about employees.");
        System.out.println("You can manage details such as first name, last name, address, etc.");
    
        // Menu
        System.out.println("\nChoose what you would like to do:");
        System.out.println("Enter \"1\" to add a new entry");
        System.out.println("Enter \"2\" to display all existing entries");
        System.out.println("Enter \"3\" to modify an existing entry");
        System.out.println("Enter \"4\" to quit the program");
        int input = scanner.nextInt();
        scanner.nextLine();
            
            switch (input) {
                
                // Add a new entry
                case 1:
                    System.out.println("Enter key of the employee: ");
                    int key = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter street address: ");
                    String streetAddress = scanner.nextLine();
                    System.out.println("Enter city: ");
                    String city = scanner.nextLine();
                    System.out.println("Enter state: ");
                    String state = scanner.nextLine();
                    System.out.println("Enter zip code: ");
                    String zip = scanner.nextLine();
                    System.out.println("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    
                    // Insert employee data into the tree
                    dispBinaryTree.insertNode(key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
                    System.out.println("Entry added!");
                    break;
                    
                // Display existing entries
                case 2:
                    if (dispBinaryTree.root == null) {
                        System.out.println("No entries available.");
                    } else {
                        System.out.println("Choose a type of search:");
                        System.out.println("\"a\" for pre-order");
                        System.out.println("\"b\" for in-order");
                        System.out.println("\"c\" for post-order");
                        String inputType = scanner.nextLine();
                        switch (inputType) {
                            case "a":
                            // Pre-order case
                                dispBinaryTree.preorderSearch(dispBinaryTree.root);
                                break;
                            case "b":
                            // In-order case
                                dispBinaryTree.inorderSearch(dispBinaryTree.root);
                                break;
                            case "c":
                            // Post-order case
                                dispBinaryTree.postorderSearch(dispBinaryTree.root);
                                break;
                            default:
                                System.out.println("Invalid option.");
                        } // end of switch case
                    } // end of if/else
                    break;
                
                // Modify an existing entry
                case 3:
                    System.out.println("Enter the key of the employee to modify: ");
                    int modifyKey = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new first name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.println("Enter new last name: ");
                    String newLastName = scanner.nextLine();
                    System.out.println("Enter new street address: ");
                    String newStreetAddress = scanner.nextLine();
                    System.out.println("Enter new city: ");
                    String newCity = scanner.nextLine();
                    System.out.println("Enter new state: ");
                    String newState = scanner.nextLine();
                    System.out.println("Enter new zip code: ");
                    String newZip = scanner.nextLine();
                    System.out.println("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    System.out.println("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    // Modify the employee information in the tree
                    dispBinaryTree.modifyNode(modifyKey, newFirstName, newLastName, newStreetAddress, newCity, newState, newZip, newEmail, newPhoneNumber);
                    System.out.println("Entry modified!");
                    break;
                
                // Quit the program
                case 4:
                    System.out.println("Quitting the program...");
                    break;
                
                default:
                    System.out.println("Invalid choice. Try again.");
            }// end of switch
        scanner.close();
    } // end of main
} // end of YVDictionary