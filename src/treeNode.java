import java.util.ArrayList;
import java.util.List;

import javafx.scene.Scene;

	public class treeNode {
		private Scene scene;
		private List<treeNode> children;

    public treeNode(Scene scene) {
        this.scene = scene;
        this.children = new ArrayList<>();}

    public Scene getScene() {
        return scene;
    }

    public List<treeNode> getChildren() {
        return children;
    }
	

    public void addChild(treeNode child) {
        children.add(child);
    }
}