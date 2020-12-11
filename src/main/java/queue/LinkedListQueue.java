package queue;

import java.util.LinkedList;


public class LinkedListQueue<T> {
    LinkedList<String> list = new LinkedList<String>(); 

	public void enqueue(String string) {
        list.add(string); 

	}

	public Object size() {
		return list.size();
	}

	public boolean isEmpty() {
        boolean a=false;
        if(list.size()==0){
            a=true;
        }
        return a;
	}

	public String dequeue() {
        String a=list.getFirst();
       
        list.removeFirst();
       
       
    
        return  a;
	}
}
// YOUR CODE GOES HERE
