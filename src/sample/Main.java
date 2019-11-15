package sample;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox root = new HBox(30);
        Scene scene = new Scene(root, 800, 800);
        for (int i = 0; i < 10; i++){
            Rectangle rectangle = new Rectangle();
            rectangle.setHeight(30);
            rectangle.setWidth(30);
            rectangle.setTranslateY(15 * i);
            RotateTransition rt = new RotateTransition();
            rt.setNode(rectangle);
            rt.setDuration(Duration.seconds(10));
            rt.setFromAngle(0);
            rt.setToAngle(360);
            rt.play();

            root.getChildren().add(rectangle);

        }
        primaryStage.setScene(scene);
        primaryStage.setTitle("okienko");
        primaryStage.show();
    }
}
