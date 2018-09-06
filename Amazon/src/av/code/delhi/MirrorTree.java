package av.code.delhi;

public class MirrorTree {
	
	public TreeNode createMirrorTree(TreeNode root) {
		if(root == null)
			return null;
		TreeNode cloneNode = new TreeNode();
		cloneNode.setValue(root.getValue());
		
		cloneNode.setLeft(createMirrorTree(root.getRight()));
		cloneNode.setRandom(createMirrorTree(root.getRandom()));
		cloneNode.setRight(createMirrorTree(root.getLeft()));
		
		return cloneNode;
	}

}
