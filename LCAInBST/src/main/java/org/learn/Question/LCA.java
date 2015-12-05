
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class LCA {
	public static Node lca(Node root, Node A ,Node B) {
		if(null == root) {
			return root;
		}		
		
		if(	root.data > A.data && root.data > B.data) {
			return lca(root.left,A,B);
		}
		
		if(	root.data < A.data && root.data < B.data) {
			return lca(root.right,A,B);
		}
		
		return root;
	}
}
