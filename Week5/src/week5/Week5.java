/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Eshta Shahi
 */
public class Week5 {
class Node{  
        int data;  
        Node other;  
          
        public Node(int data) {  
            this.data = data;  
            this.other = null;  
        }  
}

//Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
      
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
          
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
        	 //newNode will be added after tail such that tail's next will point to newNode  
            tail.other = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
    }  
      
    //removeDuplicate() will remove duplicate nodes from the list  
    public void removeDuplicate() {  
        //Node current will point to head  
        Node current = head, index = null, temp = null; 
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null){  
                //Node temp will point to previous node to index.  
                temp = current;  
                //Index will point to node next to current  
                index = current.other;  
                  
                while(index != null) {  
                    //If current node's data is equal to index node's data  
                    if(current.data == index.data) {  
                        //Here, index node is pointing to the node which is duplicate of current node  
                        //Skips the duplicate node by pointing to next node  
                        temp.other = index.other;  
                    }  
                    else {  
                        //Temp will point to previous node of index.  
                        temp = index;  
                    }  
                    index = index.other;  
                }  
                current = current.other;  
            }          
        }  
    }  
      
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.other;  
        }  
        System.out.println();  
    }  
      
   
    public static void main(String[] args) {
        Week5 slist = new Week5();  
         
	        //Adds data to the list  
	        slist.addNode(1);  
	        slist.addNode(2);  
	        slist.addNode(3);  
	        slist.addNode(2);  
	        slist.addNode(2);  
	        slist.addNode(4);  
	        slist.addNode(1);  
	          
	        System.out.println("Originals list: ");  
	        slist.display();  
	          
	        //Removes duplicate nodes  
	        slist.removeDuplicate();  
	          
	        System.out.println("List after removing duplicates: ");  
	        slist.display();  

    }
    
}
