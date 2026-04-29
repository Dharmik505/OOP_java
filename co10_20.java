import javafx.application.Application;
import javafx.animation.TranslateTransition;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.Animation;

public class BouncingBall extends Application {
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle ball = new Circle(20);
        ball.setCenterY(100);
        
        Button btnStart = new Button("Start");
        Button btnStop = new Button("Stop");
        btnStop.setLayoutX(50);
        
        Slider slider = new Slider(0.1, 5, 1);
        slider.setLayoutY(30);
        
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2), ball);
        tt.setByX(300);
        tt.setCycleCount(Animation.INDEFINITE);
        tt.setAutoReverse(true);
        
        btnStart.setOnAction(e -> tt.play());
        btnStop.setOnAction(e -> tt.pause());
        slider.valueProperty().addListener((obs, oldVal, newVal) -> tt.setRate(newVal.doubleValue()));
        
        pane.getChildren().addAll(ball, btnStart, btnStop, slider);
        Scene scene = new Scene(pane, 400, 200);
        
        scene.widthProperty().addListener((obs, oldVal, newVal) -> {
            tt.setByX(newVal.doubleValue() - 40);
            if (tt.getStatus() == Animation.Status.RUNNING) {
                tt.playFromStart();
            }
        });
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
