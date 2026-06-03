package multithreading;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Multithreading extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // استخدام getClass().getResource للتأكد من العثور على الملف
            Parent root = FXMLLoader.load(getClass().getResource("/multithreading/View.fxml"));
            
            primaryStage.setTitle("File Download Simulator");
            primaryStage.setScene(new Scene(root, 400, 300)); // زيادة الحجم قليلاً لراحة العين
            primaryStage.show();
            
        } catch (IOException e) {
            System.err.println("Error: Could not load View.fxml. Make sure the file is in the correct package.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}