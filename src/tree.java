public class tree {
    private treeNode root;

    public tree() {
        this.root = null;
    }

    public treeNode getRoot() {
        return root;
    }

    public void setRoot(treeNode root) {
        this.root = root;
    }

    public void addChild(treeNode parent, treeNode child) {
        if (parent == null) {
            // If tree is empty, set new node as root
            root = child;
 		} 
 		else {
            // Add new node as child of parent node
            parent.addChild(child);
        }
    }

    
            }