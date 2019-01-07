package com.bindu.bst;


public class BST {

	private Node createNewNode(int k) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.data = k;
		node.left = null;
		node.right = null;
		return node;
	}
	
	public Node insert(Node node, int k) {
		
		if(node == null) {
			return createNewNode(k);
		}
		
		if(k <= node.data) {
			node.left = insert(node.left, k);			
		} else {
			node.right = insert(node.right, k);
		}
		return node;		
	}
	
	

}
