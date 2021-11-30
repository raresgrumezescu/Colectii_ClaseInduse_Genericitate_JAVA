package laborator8;

public class LinkedList<T> implements Iterable<T>{
	private class Node {
		int value;
		Node next;
		
		Node (int value, Node node) {
			this.value = value;
			this.next = node;
		}
		
		Node (int value) {
			this.value = value;
			this.next = null;
		}
	}
	
	Node first;
	Node last;
	
	class ListIterator<T> implements Iterator<T>{
		Node current; 
	       
	    ListIterator(List<Integer> list) { 
	        current = list.getHead(); 
	    } 
	      
	    public boolean hasNext() { 
	        return current != null; 
	    } 
	      
	    public int next() { 
	        int data = current.getData(); 
	        current = current.getNext(); 
	        return data; 
	    }  
	}
	
	public void addFirst(int data) {
		Node nou = new Node(data, this.first);
		this.first = nou;
	}
	
	public void add(int data) {
		Node nou = new Node(data);
		this.last.next = nou;
		this.last = nou;
	}
	
	public int getNode() {
		return this.first.value;
	}
	
	public Iterator<Integer> iterator() {
		 
	}
}

public class Problema3 {

}
