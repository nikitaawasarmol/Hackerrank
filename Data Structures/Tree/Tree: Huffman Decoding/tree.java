 

/*
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;

*/

	void decode(String s, Node root) {
        StringBuffer sb = new StringBuffer();
        Node current = root;
        for(int i = 0; i < s.length(); i++) {
            current = s.charAt(i) == '1' ? current.right : current.left;
            if(current.left == null && current.right == null){
                sb.append(current.data);
                current = root;
            }
        }
        System.out.println(sb);



    }


