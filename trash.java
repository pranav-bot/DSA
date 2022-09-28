import javax.swing.text.AbstractDocument.LeafElement;

public class trash {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val) { this.val = val; }    
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
public static void main(String[] args) {
    TreeNode root = new TreeNode();
    root.val = -8;
    root.left = new TreeNode(-6);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(5);
    System.out.println(maxDepth(root));

}

public static int maxDepth(TreeNode root){
    if(root==null){
    return 0;
    }
    int left=maxDepth(root.left);
    int right=maxDepth(root.right);
    int maxheight=Math.max(left,right)+1;
    return maxheight;
    }
    }