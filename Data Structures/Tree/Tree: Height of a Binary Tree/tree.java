 


	/*
    class Node
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {

        if (root == null) return -1;

        int left = 1 + height(root.left);
        int right = 1 + height(root.right);

        return left > right ? left:right;
    }


