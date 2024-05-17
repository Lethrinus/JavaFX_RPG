
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;



public class stageTreeController extends App {
    
    public static Scene sceneCreator1Button(Text textContent, Button button1,
                    AnchorPane screenLayout, double button1X, double button1Y,
                    double textX, double textY, double sceneSizeX, double sceneSizeY,
                    double textWrappingWidth) {

        AnchorPane sceneLayout = new AnchorPane();                                        
        // Add nodes to scene layout
        sceneLayout.getChildren().addAll(button1, textContent);

        // Set layout positions
        button1.setLayoutX(button1X);
        button1.setLayoutY(button1Y);
        textContent.setLayoutX(textX);
        textContent.setLayoutY(textY);
        textContent.setWrappingWidth(textWrappingWidth);

        // Create and return new Scene
        return new Scene(sceneLayout, sceneSizeX, sceneSizeY);
    }
    public static Scene sceneCreator2Button(Text textContent, Button button1, Button button2, 
                AnchorPane screenLayout, double button1X, double button1Y,
                double button2X, double button2Y, 
                double textX, double textY, double sceneSizeX, double sceneSizeY,
                double textWrappingWidth) {

        AnchorPane sceneLayout = new AnchorPane();                                        
            // Add nodes to scene layout
            sceneLayout.getChildren().addAll(button1, button2, textContent);
                
            // Set layout positions
            button1.setLayoutX(button1X);
            button1.setLayoutY(button1Y);
            button2.setLayoutX(button2X);
            button2.setLayoutY(button2Y);                           
            textContent.setLayoutX(textX);
            textContent.setLayoutY(textY);
            textContent.setWrappingWidth(textWrappingWidth);
                
            // Create and return new Scene
            return new Scene(sceneLayout, sceneSizeX, sceneSizeY);
                                         }
    public static Scene sceneCreator3Button(Text textContent, Button button1, Button button2, Button button3,
            AnchorPane screenLayout, double button1X, double button1Y,
            double button2X, double button2Y, double button3X, double button3Y,
            double textX, double textY, double sceneSizeX, double sceneSizeY,
            double textWrappingWidth) {

        AnchorPane sceneLayout = new AnchorPane();                                        
        // Add nodes to scene layout
        sceneLayout.getChildren().addAll(button1, button2, button3, textContent);

        // Set layout positions
        button1.setLayoutX(button1X);
        button1.setLayoutY(button1Y);
        button2.setLayoutX(button2X);
        button2.setLayoutY(button2Y);
        button3.setLayoutX(button3X);
        button3.setLayoutY(button3Y);
        textContent.setLayoutX(textX);
        textContent.setLayoutY(textY);
        textContent.setWrappingWidth(textWrappingWidth);

        // Create and return new Scene
        return new Scene(sceneLayout, sceneSizeX, sceneSizeY);
    }

}



  
    
    