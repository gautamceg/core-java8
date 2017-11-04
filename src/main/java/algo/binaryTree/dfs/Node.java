package algo.binaryTree.dfs;

public class Node {
	public int data;
	public Node left;
	public Node right;
	public Node nextSibling;
	
	public Node() {
		this.left = null;
		this.right = null;
		this.nextSibling = null;
	}
	
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.nextSibling = null;
	}
	
	public static Node createNode(int data){
		return new Node(data);
	}

}
