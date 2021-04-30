 

	/*

    class Node
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
          SortedMap<Integer, Integer> Width = new TreeMap<>();

    // perform BFS, track width of nodes relative to root node
    Queue<Node> nodes = new LinkedList<>();
    Queue<Integer> widths = new LinkedList<>();
    nodes.add(root);
    widths.add(0);
    while (!nodes.isEmpty()) {
        Node node = nodes.remove();
        Integer width = widths.remove();
        if (node == null) {
            continue;
        }
        if (Width.get(width) == null) {
            Width.put(width, node.data);
        }
        nodes.add(node.left);
        nodes.add(node.right);
        widths.add(width - 1);
        widths.add(width + 1);
    }

    StringBuilder result = new StringBuilder();
    for (Integer key : Width.keySet()) {
        result.append(Width.get(key)).append(" ");
    }
    System.out.println(result);
    }





