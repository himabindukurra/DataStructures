package com.bindu.ds.stack.ll;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> {
		
			private int n;
			private Node top;
			
			public Stack() {
				n = -1;
				top = null;
			}
			
			
			private class Node{
				Item data;
				Node next;
			}
			
			private int size() {
				return n;
			}
			
			private boolean isEmpty() {
				return (top==null);
			}
			
			private void push(Item i) {
				
				Stack<Item> s = new Stack<Item>();
				Node second = top;
				top = new  Node();
				top.data = i;
				top.next = second;
				n++;
				s.display(top.data, "The item is added to the stack ");
			    
			}
			
			private Item pop() {
				
				Item i = top.data;
				top = top.next;
				n--;
				return i;
			}
		
			private void display(Object i, String str) {
				
				System.out.println(str + i);
			}
			
			private Item peek() {
				
				return top.data;
			}
			
			  
			public Iterator<Item> iterator()  { return new ListIterator();  }

		    
		    private class ListIterator implements Iterator<Item> {
		        private Node current = top;
		        public boolean hasNext()  { return current != null;                     }
		        public void remove()      { throw new UnsupportedOperationException();  }

		        public Item next() {
		            if (!hasNext()) throw new NoSuchElementException();
		            Item item = current.data;
		            current = current.next; 
		            return item;
		        }
		    }
	
			public static void main(String[] args) {
				
				Stack<Object> stack = new Stack<Object>();
				
				stack.display(stack.size(), "The size of the stack is ");
				
				stack.push(1);
				stack.push(2);
				stack.push(3);
				stack.push(4);
				stack.push(5);
				stack.push(6);
				
				stack.display(stack.size(), "The size of the stack is ");
				
				if(!stack.isEmpty()) 
				{
					
					Object i = stack.pop();
					stack.display(i,"The popped item is ");
					
					i = stack.pop();
					stack.display(i,"The popped item is ");
					
					i= stack.pop();
					stack.display(i,"The popped item is ");
					
					
				}else 
				{
					stack.display(null,"Stack is empty. Please add elements");
				}
				
				stack.display(stack.size(), "The size of the stack is ");
				
				Object i = stack.peek();
				stack.display(i,"The first item is ");
				
				Iterator<Object> itr= stack.iterator();
				System.out.println("The values in the stack are ");
				while(itr.hasNext()) {
					System.out.print(itr.next()+" ");
				}
			}

}
