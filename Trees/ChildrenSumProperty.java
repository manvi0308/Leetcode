public class ChildrenSumProperty{
    static void childrenSumProperty(TreeNode root) {

        if(root == null)
            return;

        int childSum = 0;
        if(root.left != null)
            childSum += root.left.data;
        if(root.right != null)
            childSum += root.right.data;

        if(root.data > childSum){
            if(root.left != null) {
                root.left.data = root.data;
            }
            if(root.right != null) {
                root.right.data = root.data;
            }
        }

        childrenSumProperty(root.left);
        childrenSumProperty(root.right);

        // Back track
        int total = 0;
        if(root.left != null) {
            total += root.left.data;
        }

        if(root.right != null) {
            total += root.right.data;
        }

        if(root.left != null || root.right != null) {
            root.data = tot;
        }
    }
    public static void main(String[] args)
    }
}