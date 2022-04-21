package datastructure;
import java.util.*;
import java.util.*;
public class Linkedlist_ds {
		class Node{
			int data;
			Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		}
		
		public Node headNode=null;
		public Node currentNode=null;
		
		public void Insert(int data) {
			Node newNode =new Node(data);
			if(headNode==null) {
				headNode=newNode;
			}
			else {
				currentNode=headNode;
				while(currentNode.next!=null) {
					currentNode=currentNode.next;
				}
				currentNode.next=newNode;
			}
			
		}
		public void Delete(int dlt) {
			currentNode=headNode;
			int flag=0;
			Node temp=currentNode;
			if(headNode.data==dlt) {
				headNode=headNode.next;
				flag=1;
			}
			
			while(currentNode.data!=dlt && currentNode.next!=null&&flag==0) {
				currentNode=currentNode.next;
				if(currentNode.data!=dlt) {
					temp=currentNode;
				}
			}
			if(currentNode.data==dlt && flag==0) {
				temp.next=currentNode.next;
			}
			else if(flag==0) {
				System.out.println("Element Not Found");
			}
			
		}
		public void Display() {
					currentNode=headNode;
					System.out.println("Displaying data...");
					while(currentNode.next!=null) {
						System.out.println(currentNode.data);
						currentNode=currentNode.next;
					}
					System.out.println(currentNode.data);
		}
		
		public static void main(String args[]) {
			Linkedlist_ds sl =new Linkedlist_ds();
			Scanner sc=new Scanner(System.in);
			int choice;
			while(true) {
				System.out.println("Enter Your Choice...\n1.Insert\n2.Delete\n3.Display\n4.Exit");
				choice=sc.nextInt();
				switch(choice) {
				    case 1: System.out.println("Enter a value to insert...");
				    		int data=sc.nextInt();
				    		sl.Insert(data);
				    		break;
				    case 2: System.out.println("Enter a value to delete...");
		    				int dlt=sc.nextInt();
				    		sl.Delete(dlt);
				    		break;
				    case 3: sl.Display();
				    		break;
				}
				if(choice==4)
						break;
			}
		}
}