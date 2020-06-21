package nix;

public class TreeNode {
     int key;
     TreeNode left;//дочерний єлемент
     TreeNode right;//дочерний єлемент
     TreeNode(int x) {
         key = x;
         left = right = null;
     }
}
  class BinaryTree{
    TreeNode root;
    BinaryTree(int key){
        root = new TreeNode(key);
    }
    BinaryTree(){
        root = null;
    }

    int maxDeep(TreeNode treeNode){
        if(treeNode == null)
            return 0;
        else{
            int leftDeep = maxDeep(treeNode.left);
            int rightDeep = maxDeep(treeNode.right);

            if(leftDeep>rightDeep)
                return (leftDeep+1);
            else
                return (rightDeep+1);
        }
    }
  }
