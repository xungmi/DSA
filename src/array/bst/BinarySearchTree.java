package array.bst;

public class BinarySearchTree {
	Node root;

	public BinarySearchTree(Node root){
		root = null;
	}

	public void insert(int key) {
		root = insertRec(root, key);
	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	public boolean search(int key){
		return searchRec(root, key);
	}

	private boolean searchRec(Node root, int key){
		if (root == null){
			return false;
		}

		if (root.key == key){
			return true;
		} else if (key < root.key){
			return searchRec(root.left, key);
		} else {
			return searchRec(root.right, key);
		}
	}

	public void inOrder(){
		inOrderRec(root);
	}

	private void inOrderRec(Node root){
		if (root != null){
			inOrderRec(root.left);
			System.out.println(root.key + " ");
			inOrderRec(root.right);
		}
	}

	public int height() {
		return heightRec(root);
	}

	private int heightRec(Node root){
		if (root == null) {
			return 0;
		}

		int leftHeight = heightRec(root.left);
		int rightHeight = heightRec(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
	interface Classs{

	}
	
}
