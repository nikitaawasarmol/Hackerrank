 


 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */

	public static Node insert(Node root,int data) {
    	if(root == null) {
            return new Node(data);
        }
        Node node = root;
        if(data < node.data) {
            node.left = insert(node.left, data);
        }
        else if(data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

