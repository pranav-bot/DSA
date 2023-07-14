import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Definition for a binary tree node.

class binaryTreeInorder {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        if (root == null) {
            return a;
        }
        a = inorderTraversal(root.left);
        a.add(root.val);
        List<Integer> temp = new ArrayList<Integer>();
        temp = inorderTraversal(root.right);
        for (int i : temp) {
            a.add(i);
        }

        return a;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        if (root == null) {
            return a;
        }

        List<Integer> temp2 = new ArrayList<Integer>();
        temp2 = preorderTraversal(root.left);
        for (int i : temp2) {
            a.add(i);
        }

        List<Integer> temp = new ArrayList<Integer>();
        temp = preorderTraversal(root.right);
        for (int i : temp) {
            a.add(i);
        }
        a.add(root.val);
        return a;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a = new ArrayList<Integer>();
        if (root == null) {
            return a;
        }

        List<Integer> temp2 = new ArrayList<Integer>();
        temp2 = postorderTraversal(root.left);
        for (int i : temp2) {
            a.add(i);
        }

        List<Integer> temp = new ArrayList<Integer>();
        temp = postorderTraversal(root.right);
        for (int i : temp) {
            a.add(i);
        }
        a.add(root.val);
        return a;

    }

    public boolean isUnivalTree(TreeNode root) {
        List<Integer> a = postorderTraversal(root);
        for (int i : a) {
            for (int j = i + 1; j != a.size(); j++) {
                if (a.get(i) != a.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return root;
        } else if (root.val == val) {
            return root;
        } else if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }

    }

    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> a = postorderTraversal(root);
        Collections.sort(a);
        return a.get(a.size() - 2);
    }

    private TreeNode CreateBST(int nums[], int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = CreateBST(nums, l, mid - 1);
        root.right = CreateBST(nums, mid + 1, r);
        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums, 0, nums.length - 1);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public int sumOfLeftLeaves2(TreeNode root) {
        int n1 = 0;
        if (root.left == null && root.right == null) {
            return root.val;
        }
        root = root.left;
        return n1;

    }

    public int sumOfLeftLeaves3(TreeNode root) {
        int n1 = 0;
        if (root.left == null && root.right == null) {
            return root.val;
        }
        root = root.right;
        return n1;

    }

}