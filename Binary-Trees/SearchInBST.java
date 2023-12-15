package trees;

public class SearchInBST {
	public TreeNode searchBST(TreeNode root, int data) {
		while(root != null && root.data != data) {
			if(root.data < data) {
				root = root.right;
			}
			
			else if(root.data > data)
				root = root.left;
		}
		return root;

	}
}
