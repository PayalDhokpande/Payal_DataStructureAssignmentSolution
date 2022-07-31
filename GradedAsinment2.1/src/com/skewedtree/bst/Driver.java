package com.skewedtree.bst;

import com.skewedtree.bstservice.BSTNode;
import com.skewedtree.bstservice.Node;

//JAva program to convert binary search tree into skewed tree
public class Driver {

	public static void main(String[] args) {
		
		BSTNode tree = new BSTNode();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left = new Node(40);
	    
	     int order = 0;
	     tree.createSkewedTree(tree.node, order);
	     System.out.println("The Converted Binary Search Tree Into A Skewed Tree Is: ");
	     tree.traverseRightSkewed(tree.headNode);

	}

}
