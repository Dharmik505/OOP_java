import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class BarChart extends Application {
    public void start(Stage stage) {
        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.BOTTOM_CENTER);

        VBox box1 = new VBox(5, new Rectangle(40, 20 * 3, Color.RED), new Text("Projects 20%"));
        box1.setAlignment(Pos.BOTTOM_CENTER);
        
        VBox box2 = new VBox(5, new Rectangle(40, 10 * 3, Color.BLUE), new Text("Quizzes 10%"));
        box2.setAlignment(Pos.BOTTOM_CENTER);
        
        VBox box3 = new VBox(5, new Rectangle(40, 30 * 3, Color.GREEN), new Text("Midterm 30%"));
        box3.setAlignment(Pos.BOTTOM_CENTER);
        
        VBox box4 = new VBox(5, new Rectangle(40, 40 * 3, Color.ORANGE), new Text("Final 40%"));
        box4.setAlignment(Pos.BOTTOM_CENTER);

        hbox.getChildren().addAll(box1, box2, box3, box4);

        Scene scene = new Scene(hbox, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
