# Binary Search Tree Employee Directory

## Overview
This Java program implements a **Binary Search Tree (BST)** to manage an employee directory. It allows users to **add, modify, and search** for employee records stored in the tree. 

The program provides a **menu-driven interface** where users can:
- Insert a new employee record
- Display all existing employee records using **pre-order, in-order, or post-order traversal**
- Modify an existing employee record
- Exit the program

## Features
1. ✔ **Command-line Interface** – Simple interactive menu for user input.
2. ✔ **Binary Search Tree Implementation** – Organizes employee records efficiently for fast retrieval.  
3. ✔ **Multiple Search Methods** – Supports **pre-order, in-order, and post-order traversal**.  
4. ✔ **Employee Record Management** – Allows adding and modifying employee details, including:  
   - First name
   - Last name
   - Address
   - City, State, Zip
   - Email
   - Phone number

## Files
- `BinaryTree.java` – Manages the **BST structure**, including insert, search, and modify operations.
- `Node.java` – Represents an **employee record** stored in the BST.
- `YVDictionary.java` – Contains the **main program**, user interface, and menu logic.

## How to Run
1. **Compile the Java files**:  
   ```sh
   javac BinarySearchTree/*.java

2. **Run the program**:
   ```sh
   java BinarySearchTree.YVDictionary

## Usage Instructions
1. **Upon running the program, you will see the following menu**:
   ```sh
   Hello! This program is a dictionary!
   Here you can add, store, and search data about employees.

   Choose what you would like to do:
   1 - Add a new entry
   2 - Display all existing entries
   3 - Modify an existing entry
   4 - Quit the program

2. **Example Usage**:
- Add an employee **(Option 1)**
- Enter the employee details when prompted.
- View employees **(Option 2)**
- Choose between **pre-order**, **in-order**, or **post-order** search.
- Modify an entry **(Option 3)**
- Enter the employee key and updated details.

## Extra Credit Features:
1. **Added an introduction to explain the program.**
2. **Created a menu system to guide users through different functionalities.**

## Author:
- **Cameron Bartlett**
- **CS&145 - Lab 4**