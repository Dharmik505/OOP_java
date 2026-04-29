import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegForm extends Application {
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        
        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();
        Button btn = new Button("Submit");

        grid.add(new Label("Roll_NO:"), 0, 0);
        grid.add(roll, 1, 0);
        grid.add(new Label("Name:"), 0, 1);
        grid.add(name, 1, 1);
        grid.add(new Label("Age:"), 0, 2);
        grid.add(age, 1, 2);
        grid.add(new Label("Email:"), 0, 3);
        grid.add(email, 1, 3);
        grid.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                Integer.parseInt(roll.getText());
                Integer.parseInt(age.getText());
                if (!email.getText().contains("@") || !email.getText().contains(".")) {
                    throw new Exception("Invalid Email");
                }
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText(roll.getText() + " " + name.getText() + " " + age.getText() + " " + email.getText());
                a.show();
            } catch (NumberFormatException ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("RollNo and Age must be numeric");
                a.show();
            } catch (Exception ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText(ex.getMessage());
                a.show();
            }
        });

        Scene scene = new Scene(grid, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
