 


	/*

    class Node
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {
      if (root == null) {
          return;
      }

      LinkedList<Node> queue = new LinkedList();
      queue.add(root);

      while(!queue.isEmpty()) {
          Node current_node = queue.poll();

          System.out.print(current_node.data + " ");
          if(current_node.left != null) queue.add(current_node.left);
          if(current_node.right != null) queue.add(current_node.right);
      }

    }

s
