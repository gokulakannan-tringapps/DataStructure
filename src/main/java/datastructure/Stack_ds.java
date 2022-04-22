package datastructure;

import java.util.*;

public class Stack_ds {
			
		static void push(Stack<Integer> stack, int element) {
			stack.push(element);
		}
		static void pop(Stack<Integer> stack) {
			System.out.println("POP Element..."+stack.pop());
		}
		static void peek(Stack<Integer> stack) {
			System.out.println("PEEK Element..."+stack.peek());
		}
		static void display(Stack<Integer> stack) {
			System.out.println("Displaying Stack..."+stack);
		}
	
	
	
		public static void main(String args[]) {
			
			Stack<Integer> stack=new Stack<Integer>();
			int choice;
			Scanner sc=new Scanner(System.in);
			while(true) {
				
				System.out.println("Choose a number...\n 1. PUSH\n 2. POP\n 3. PEEK\n 4. DISPLAY\n 5. EXIT");
				choice=sc.nextInt();
				switch(choice) {
				case 1: System.out.println("Enter a number to PUSH...");
						int element=sc.nextInt();
						push(stack,element);
						break;
				case 2: pop(stack);
						break;
				case 3: peek(stack);
						break;
				case 4: display(stack);
						break;
				default: break;
				}
				if(choice==5)
					break;
			}
			System.out.println("Exiting...");
		}
}
