/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> lst = new ArrayList<>();
        recur(root,lst);
        return lst;
    }
    public static void recur(Node r, List<Integer> l) {
        if (r!=null) {
            l.add(r.val);
            for (Node n : r.children) {
                recur(n,l);
            }
        }
    }
}
