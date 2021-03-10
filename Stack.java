import java.util.ArrayList;
import java.util.Scanner;

public class Stack extends ArrayList{
 
	public static void main(String[] args) { 
		
		GenericStack<String> stack1 = new GenericStack<>();
		Scanner sc = new  Scanner(System.in);
		System.out.println("Input five strings");
		
		for (int i = 0; i < 5 ; i ++) {
			
		stack1.push(sc.nextLine());
		
		}	
		
		for (int i = 0; i < 5 ; i ++) {
		
			System.out.println(stack1.pop());
		
		}
		
	}
	
}
