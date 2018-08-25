/**
 * 
 */
package com.linkedlist;


public class Node {
int data;
Node next;

public static void main(String[] args) {
	LinkedListDS l=new LinkedListDS();
	l.insert(1);
	l.insert(5);
	l.insert(10);
	l.insert(15);	
	l.insertAtPosition(0, 20);
	l.delete(1);
	l.show();
}

}
