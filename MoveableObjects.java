// Utilizes JavaFX to create a small application
// Two moveable points created with a line connecting them

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Created by samirriaz on 4/27/17.
 */
public class MoveableObjects extends Application {
    @Override
    public void start(Stage primaryStage) {
        double a, b;
        Pane pane = new Pane();
        pane.setPadding(new Insets(100, 100, 100, 100));

// Circle 1
        Circle circle1 = new Circle(40, 40, 10, Color.WHITE);
        circle1.setStroke(Color.BLACK);
        pane.getChildren().add(circle1);

// Circle 2
        Circle circle2 = new Circle(120, 150, 10, Color.WHITE);
        circle2.setStroke(Color.BLACK);
        pane.getChildren().add(circle2);

// Line
        Line line = new Line();
        line.setStartX(circle1.getCenterX());
        line.setEndX(circle2.getCenterX());
        line.setStartY(circle1.getCenterY());
        line.setEndY(circle2.getCenterY());

        double distance = Math.pow(circle2.getCenterX() - circle1.getCenterX(), 2)
                + Math.pow(circle2.getCenterY() - circle1.getCenterY(), 2);
        pane.getChildren().add(new Label("" + distance));

// Circle 1 Event
        circle1.setOnMouseDragged(event -> {
            circle1.setCenterX(event.getX());
            circle1.setCenterY(event.getY());
        line.setStartX(circle1.getCenterX());
        line.setStartY(circle1.getCenterY());
//        setA(circle1, circle2, a);
        });

// Circle 2 Event
        circle2.setOnMouseDragged(event -> {
            circle2.setCenterX(event.getX());
            circle2.setCenterY(event.getY());
        line.setEndX(circle2.getCenterX());
        line.setEndY(circle2.getCenterY());
            pane.getChildren().add(new Label("" + distance));
        });

// Add To Pane
        pane.getChildren().add(line);

// Set Scene
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Movable Objects");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void setA(Circle circle1, Circle circle2, double a) {
        a = Math.pow(circle2.getCenterX() - circle1.getCenterX(), 2);
    }
    public void setB(Circle circle1, Circle circle2, double b) {
        b = Math.pow(circle2.getCenterX() - circle1.getCenterX(), 2);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
