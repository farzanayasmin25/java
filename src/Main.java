import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        //primaryStage.setMaximized(true);
        primaryStage.setTitle("Login Portal");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }




}
