package algo.binaryTree.dfs;

public class NextSiblingPointer {
	
	public static void nextSiblingPointer(Node node){
		if(node == null)
			return;
		//if we have left node
		if(node.left != null){
			node.left.nextSibling = node.right;
 		}
		
		if(node.right != null){
			if(node.nextSibling != null){
				node.right.nextSibling = node.nextSibling.left;
			}
			else{
				node.right.nextSibling = null;
			}
		}
		
		nextSiblingPointer(node.left);
		nextSiblingPointer(node.right);
		return;
	}
	
	public static void printUsingNextSibling(Node root) {
		Node node = null;
		int level = 0;
		while( root != null) {
			node = root;
			System.out.printf("Level %d data ",level++);
			while(node != null) {			
				System.out.printf("%d ",node.data);
				node = node.nextSibling;
			}
			System.out.println("");
			root = root.left;
		}
	}

}
