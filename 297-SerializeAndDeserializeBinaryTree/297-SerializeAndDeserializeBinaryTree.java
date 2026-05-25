// Last updated: 5/25/2026, 11:10:25 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        dfsserialize(root,sb);
        return sb.toString();
    }

    private void dfsserialize(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        dfsserialize(root.left,sb);
        dfsserialize(root.right,sb);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] d=data.split(",");
        Queue<String> queue=new LinkedList<>();
        for(String da:d){
            queue.offer(da);
        }
        return dfsdeserialize(queue);
    }
    private TreeNode dfsdeserialize(Queue<String> queue){
        String data=queue.poll();
        if(data.equals("null")){
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(data));
        node.left=(dfsdeserialize(queue));
        node.right=(dfsdeserialize(queue));
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));