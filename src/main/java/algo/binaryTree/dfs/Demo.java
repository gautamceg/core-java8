package algo.binaryTree.dfs;

public class Demo {

	public static void main(String[] args) {
					/*
			        1
			      /   \	
			     2     3
			 	 / \   / \ 
			 	4   5 6   7       

		 */
		Node root = Node.createNode(1);
		root.left = Node.createNode(2);
		root.right = Node.createNode(3);

		// left sub tree
		root.left.left = Node.createNode(4);
		root.left.right = Node.createNode(5);
		
		root.left.left.left = Node.createNode(8);
		root.left.left.right = Node.createNode(9);
		
		root.left.right.left = Node.createNode(10);
		root.left.right.right = Node.createNode(11);

		// right subtree
		root.right.left = Node.createNode(6);
		root.right.right = Node.createNode(7);
		
		root.right.left.left = Node.createNode(12);
		root.right.left.right = Node.createNode(13);
		
		root.right.right.left = Node.createNode(14);
		root.right.right.right = Node.createNode(15);
		
		

		NextSiblingPointer.nextSiblingPointer(root);    	
		NextSiblingPointer.printUsingNextSibling(root);    
	}

}