// Cameron Bartlett
// CS&145
// Lab 4
// Binary Search Tree

package BinarySearchTree;

class Node {
    int key;
    String firstName, lastName, streetAddress, city, state, zip, email, phoneNumber;
    Node left, right;

    public Node(int key, String firstName, String lastName, String streetAddress, String city, String state, 
                String zip, String email, String phoneNumber) {
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.left = this.right = null;
    } // end of Node method
}// end of Node class