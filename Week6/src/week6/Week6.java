/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;
import java.util.*; 
/**
 *
 * @author Eshta Shahi
 */
public class Week6 {

  // BST node  
	static class Node {  
	    int key;  
	     Node left, right;  
	};  
	    
	// Utitlity function to create a new node  
	static Node newNode(int data)  
	{  
	    Node temp = new Node();  
	    
	    temp.key = data;  
	    
	    temp.left = null;  
	    temp.right = null;  
	    
	    return temp;  
	}  
	    
	// A utility function to insert a new  
	// Node with given key in BST  
	static Node insert(Node root, int key)  
	{  
	    // Create a new Node containing  
	    // the new element  
	    Node newnode = newNode(key);  
	    
	    // Pointer to start traversing from root and  
	    // traverses downward path to search  
	    // where the new node to be inserted  
	    Node x = root;  
	    
	    // Pointer y maintains the trailing  
	    // pointer of x  
	    Node y = null;  
	    while (x != null) {  
	        y = x;  
	        if (key < x.key)  
	            x = x.left;  
	        else
	            x = x.right;  
	    }  
	    
	    // If the root is null i.e the tree is empty  
	    // The new node is the root node  
	    if (y == null)  
	        y = newnode;  
	    
	    // If the new key is less then the leaf node key  
	    // Assign the new node to be its left child  
	    else if (key < y.key)  
	        y.left = newnode;  
	    
	    // else assign the new node its right child  
	    else
	        y.right = newnode;  
	    
	    // Returns the pointer where the  
	    // new node is inserted  
	    return y;  
	}  
	    
	// A utility function to do inorder  
	// traversal of BST  
	static void Inorder(Node root)  
	{  
	    if (root == null)  
	        return;  
	    else {  
	        Inorder(root.left);  
	        System.out.print( root.key +" ");  
	        Inorder(root.right);  
	    }  
	}  
    public static void main(String[] args) {
        // TODO code application logic here
        /* Let us create following BST   
	            50   
	          /   \   
	        30      70   
	        / \   / \   
	       20 40 60 80 */
	    
	    Node root = null;  
	    root = insert(root, 40);  
	    insert(root, 50);  
	    insert(root, 10);  
	    insert(root, 60);  
	    insert(root, 70);  
	    insert(root, 80);  
	    insert(root, 90);  
	    
	    // Print inoder traversal of the BST  
	    Inorder(root);  
    }
    
}
