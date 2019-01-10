package com.bindu.ds.stack.array;

public class StackArr {
	
	int size;
	int[] stack;
	int top;

	public StackArr(int size) {
		
		this.size = size;
		this.stack = new int[size];
		this.top = -1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackArr s = new StackArr(10);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		s.pop();
		
		s.peek();

	}

	private void peek() {
		
		System.out.println("The top of the element is "+stack[top]);
		
	}

	private void pop() {
		
		int pop_element = stack[top];
		top--;
		System.out.println("The element is removed from stack is "+pop_element);
		
	}

	private void push(int i) {
		
		if(isFull()) {
			System.out.println("Stack is Full, can't insert elements");
		}else {
			top++;
			stack[top] = i;
			System.out.println("The element inserted into the stack is "+i+" at position "+top);
			
		}
		
	}

	private boolean isFull() {
		
		return (size-1 == top);
	}

}
