package src;

import java.util.*;

public class Queues {
       
    Queue<String> queue = new LinkedList<String>();

    //add elements to queue using add method
    public void add(){
    	
    	queue.add("Java");
    	queue.add("Node.js");
    	queue.add("mongo");
    	queue.add("express.js");
    	queue.add("angular.js");
    	queue.add("oracle 11g");
    	queue.add("scala");
    	
    }
    
    //print queue
    public void display(){
    	System.out.println(queue);
    }
    
    //remove element
    public void remove(){
    	queue.remove();
    	queue.remove();
    	
    }
 
    //retrieve and remove element
    public void offer(){
    	queue.offer("python");
    }
    
    //retrieve element
    public String element(){
    	
    	String ele=queue.element();
    	System.out.println("element method " + ele);
    	return ele;
    }

    //retrieve and remove
    public void poll(){
    	queue.poll();
    }

    //retrieve and return 1st element
    public String peek(){
    	
    	String pk = queue.peek();
        System.out.println("peek method " + pk);
        return pk;
    	
    }
    
    public static void main(String[] args){
    	
    	Queues demo=new Queues(); 
    	
    	demo.add();
    	demo.display();
    	demo.offer();
    	demo.element();
    	demo.poll();
    	demo.peek();
    	    	
    }
}
