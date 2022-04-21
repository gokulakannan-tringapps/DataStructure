package datastructure;

import java.util.*;

public class Queue_ds {
			
		static void enQueue(Queue<Integer> queue, int element) {
			queue.add(element);
		}
		static void deQueue(Queue<Integer> queue) {
			System.out.println("DEQUEUE Element..."+queue.remove());
		}
		
		static void display(Queue<Integer> queue) {
			System.out.println("Displaying Queue..."+queue);
		}
	
	
	
		public static void main(String args[]) {
			
			Queue<Integer> queue=new LinkedList<Integer>();
			int choice;
			Scanner sc=new Scanner(System.in);
			while(true) {
				
				System.out.println("Choose a number...\n 1. ENQUEUE\n 2. DEQUEUE\n 3. DISPLAY\n 4. EXIT");
				choice=sc.nextInt();
				switch(choice) {
				case 1: System.out.println("Enter a number to ENQUEUE...");
						int element=sc.nextInt();
						enQueue(queue,element);
						break;
				case 2: deQueue(queue);
						break;
				case 3: display(queue);
						break;
				}
				if(choice==4)
					break;
			}
			System.out.println("Exiting...");
		}
}

