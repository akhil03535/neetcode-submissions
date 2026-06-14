/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
*/

class Solution {

  
    public Node connect(Node root) {
        
        bfs(root);
        return root;

    }

    void bfs(Node root){
        if(root==null)return;

        Queue<Node>q=new LinkedList<>();
        q.offer(root);

   
        while(!q.isEmpty()){
            int size=q.size();
            Node rightNode=null;

            for(int i=0;i<size;i++){

                Node curr=q.poll();
                curr.next=rightNode;
                rightNode=curr;

               
                if(rightNode.right!=null)q.offer(rightNode.right);
                 if(rightNode.left!=null)q.offer(rightNode.left);

            }
        }
    }
}