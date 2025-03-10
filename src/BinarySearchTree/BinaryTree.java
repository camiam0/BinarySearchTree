// Cameron Bartlett
// CS&145
// Lab 4
// Binary Search Tree

// Binary Tree Generator

package BinarySearchTree;

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    } // end of BinaryTree method

    // Insert a new node
    public void insertNode(int key, String firstName, String lastName, String streetAddress, 
                           String city, String state, String zip, String email, String phoneNumber) {
        root = insertNode(root, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
    } // end of insertNode

    private Node insertNode(Node root, int key, String firstName, String lastName, String streetAddress, 
                               String city, String state, String zip, String email, String phoneNumber) {
        if (root == null) {
            return new Node(key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
        } // end of if
        if (key < root.key) {
            // Left node
            root.left = insertNode(root.left, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
        } else if (key > root.key) {
            // Right node
            root.right = insertNode(root.right, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
        } // end of if/else
        return root;
    } // end of insertNode

    // Pre-order search
    public void preorderSearch(Node root) {
        if (root != null) {
            System.out.println(root.firstName + " " + root.lastName);
            preorderSearch(root.left);
            preorderSearch(root.right);
        } // end of if
    } // end of preorderSearch

    // In-order search
    public void inorderSearch(Node root) {
        if (root != null) {
            inorderSearch(root.left);
            System.out.println(root.firstName + " " + root.lastName);
            inorderSearch(root.right);
        } // end of if
    } // end of inorderSearch

    // Post-order search
    public void postorderSearch(Node root) {
        if (root != null) {
            postorderSearch(root.left);
            postorderSearch(root.right);
            System.out.println(root.firstName + " " + root.lastName);
        }// end of if
    }// end of postorderSearch

    // Modify an existing entry
    public void modifyNode(int key, String firstName, String lastName, String streetAddress, 
                           String city, String state, String zip, String email, String phoneNumber) {
        root = modifyNode(root, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
    } // end of modifyNode

    private Node modifyNode(Node root, int key, String firstName, String lastName, String streetAddress, 
                               String city, String state, String zip, String email, String phoneNumber) {
        if (root == null) {
            System.out.println("Employee with the given key does not exist.");
            return null;
        } // end of if

        if (key < root.key) {
            root.left = modifyNode(root.left, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
        } else if (key > root.key) {
            root.right = modifyNode(root.right, key, firstName, lastName, streetAddress, city, state, zip, email, phoneNumber);
        } else {
            root.firstName = firstName;
            root.lastName = lastName;
            root.streetAddress = streetAddress;
            root.city = city;
            root.state = state;
            root.zip = zip;
            root.email = email;
            root.phoneNumber = phoneNumber;
            System.out.println("Employee information updated successfully.");
        } // end of if/else
       return root;
    } // end of modifyMode method

    // Search for a node by key
    public Node searchNode(int key) {
        return searchNode(root, key);
    } // end of searchNode method

    private Node searchNode(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        } // end of if
        if (key < root.key) {
            return searchNode(root.left, key);
        } // end of if
        return searchNode(root.right, key);
    } // end of searchNode
} // end of BinaryTree  
