package src;

import java.util.*;

public class stack {

	Stack<Integer> stack = new Stack<Integer>();

	public void pushDemo() {

		for (int i = 0; i < 6; i++) {
			stack.push(i);
			// System.out.println("Elemnts of stack are"+stac);
		}
	}
	
	public int popdemo(){
		int num=stack.pop();
		return num;
	}
	
	public int peekdemo(){
		int num=stack.peek();
		return num;
	}
	
	public boolean empty(){
		boolean bool=stack.empty();
		return bool;
	}
	
	public int search(){
		int srch=stack.search(6);
		return srch;
	}
}
