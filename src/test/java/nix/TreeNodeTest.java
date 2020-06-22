package nix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TreeNodeTest {
    BinaryTree tree = new BinaryTree();
    @Test
    public void ArrayOfUniqueNumbers(){
        assertEquals(tree.maxDeep(tree.root), 0);

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        assertEquals(tree.maxDeep(tree.root), 2);

        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        assertEquals(tree.maxDeep(tree.root), 3);

        tree.root.left.right.right = new TreeNode(6);
        tree.root.left.right.right.left = new TreeNode(7);
        assertEquals(tree.maxDeep(tree.root), 5);


    }

}
