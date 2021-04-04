package sample;

import com.sun.javafx.event.CompositeEventHandler;
import javafx.fxml.FXML;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import Geometry2D.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import java.util.Random;

public class Controller {
    public Button circle;
    public Button rectangle;
    public Pane figurePane;
    private GraphicsContext gc;
    public Controller() {
    }
    public void initialize() {
        Random random = new Random();
        System.out.println(random.nextInt(10));
        circle.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                aFigure figure = new aCircle(
                        (double) (random.nextInt(100)));
                Circle circle = new Circle(
                        figure.getR(),
                        (double) (random.nextInt(100)),
                        (double) (random.nextInt(100)),
                        Color.rgb(
                                random.nextInt(256),
                                random.nextInt(256),
                                random.nextInt(256)
                        )
                );
                figurePane.getChildren().addAll(circle);
            }
        });
        rectangle.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) {
                aFigure figure = new aRectangle(
                        (double) (random.nextInt(100)),
                        (double) (random.nextInt(100))
                );
                Rectangle rectangle = new Rectangle(
                        figure.getA(),
                        figure.getB(),
                        (double) (random.nextInt(100)),
                        (double) (random.nextInt(100))
                );
                rectangle.setFill(
                        Color.rgb(
                                random.nextInt(256),
                                random.nextInt(256),
                                random.nextInt(256)
                        )
                );
                figurePane.getChildren().addAll(rectangle);
            }
        });
    }
}




