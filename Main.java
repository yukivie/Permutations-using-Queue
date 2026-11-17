import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static Scanner input = new Scanner(System.in);
	static Queue<String> queue = new LinkedList<>();

	public static void main(String[] args) {
		int choice;
		
		do {
			System.out.println("PERMUTATIONS USING QUEUE");
			System.out.println("1 Add Elements to Queue");
			System.out.println("2 Display Queue");
			System.out.println("3 Generate Permutations");
			System.out.println("4 Exit");
			System.out.println("Enter your choice: ");
			
			choice = input.nextInt();
			
			switch(choice) {
			case 1:
				addElements();
				break;
				
			case 2:
				displayQueue();
				break;
				
			case 3: 
				generatePermutations();
				break;
			
			case 4:
				System.out.println("Program terminated");
				break;
			
			default:
				System.out.println("Invalid");
			}
		}while(choice != 4);

	}
	
	static void addElements() {
		System.out.println("Enter 5 elements: ");
		int n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
		System.out.println("Enter element " + (i + 1) + ": ");
		String elements = input.next();
	
		queue.add(elements);
}

	System.out.println("Elements added successfully");
	
	
}


	static void displayQueue() {
		if(queue.isEmpty()) {
			System.out.println("Queue is empty");
		}else { 
			System.out.println("Queue: " + queue);
		}
	}
	
	static void dequeueTwo() {
		if(queue.size() < 2) {
			System.out.println("Not enough");
		}else {
			System.out.println("Removed: " + queue.poll());
			System.out.println("Removed: " + queue.poll());
			
			System.out.println("Updated Queue: " + queue);
		}
	}
	
	static void generatePermutations() {
		if(queue.isEmpty()) {
			System.out.println("Queue is empty");
			return;	
		}
		
		ArrayList<String> elements = new ArrayList<>(queue);
		
		for(r <= 0 || r > elements.size()) {
			System.out.println("Enter how many elements to arrange: ");
			int r = input.nextInt();
			
			int[] count = {0};
			boolean[] used = new boolean[elements.size()];
			
			generatePerm(elements, "", used, r, count);
			System.out.println("Success");
			
		
			
		}
	}
	
	static void generatePerm(ArrayList<String> elements, boolean[] used, String result, int r, int[] count) {
		if(result.length() == r) {
			System.out.println(result);
			count[0] ++;
			return;
		}
			
			ArrayList<String> element = new ArrayList<>(queue);
			
			if(!used[i]) {
				used[i] = true;
				
				System.out.println("");
			

				used[i] = false;
				
				generatePerm(elements, result + elements.get(i), used, r, count){	
			}
		}
	


