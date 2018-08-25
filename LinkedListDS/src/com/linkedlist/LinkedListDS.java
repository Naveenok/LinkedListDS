/**
 * 
 */
package com.linkedlist;

public class LinkedListDS {
Node head;

public void insert(int data) {
	Node n=new Node();
	n.data=data;
	n.next=null;
	if(head==null){
		head=n;
	}
	else {
		Node n1=head;
		while(n1.next!=null){
			n1=n1.next;
		}
		n1.next=n;
	}

}

public void show(){
	Node node=head;
	while(node.next!=null){
		System.out.println(node.data);
		node=node.next;
	}
	System.out.println(node.data);
}
public void insertAtStart(int value){
	Node obj=new Node();
	obj.data=value;
	obj.next=null;
	if(head==null){
		head=obj;
	}
	else {
		obj.next=head;
		head=obj;
	}
}
public void insertAtPosition(int loc,int value) {
	Node obj = new Node();
	obj.data=value;
	obj.next=null;
	Node node=head;
	if (loc==0) {
		insertAtStart(value);
	}
	for (int i = 0; i < loc-1; i++) {
		node=node.next;
	}	
	obj.next=node.next;
	node.next=obj;
	}
	
}

