package av.code.delhi;

public class CloneTree {

	
	public TreeNode createClone(TreeNode root) {
		
		if(root != null) {
			TreeNode cloneNode = new TreeNode();
			cloneNode.setValue(root.getValue());
			
			cloneNode.setLeft(
					createClone(root.getLeft())
					);
			cloneNode.setRight(
					createClone(root.getRight())
					);
			cloneNode.setRandom(
					createClone(root.getRandom())
					);
			
			return cloneNode;
		}
		else
			return null;
	}
}
