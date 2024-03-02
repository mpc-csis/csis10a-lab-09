import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by brian on 3/22/14.
 */
public class PartBCanvas extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(getClass().getSimpleName());

        // Use Border pane to center content
        BorderPane pane = new BorderPane();
        Canvas canvas = new Canvas(400, 400);
        pane.setCenter(canvas);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.GRAY);
        draw(graphicsContext);
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public void draw(GraphicsContext g) {
        // draw a line
        g.strokeLine(10, 20, 100, 200);  // from (10,20) to (100,200)

        // draw a filled rectangle
//        g.fillRect(50, 100, 20, 40);   // 20x40 at upper left corner (50,100)

        // draw a filled oval
//        g.setFill(Color.GREEN);     // change color
//        g.fillOval(50, 100, 20, 40);   // green oval in black rectangle

        // draw a border line
//        g.setStroke(Color.RED);    // change color
//        g.strokeRect(50, 100, 20, 40);   // red outline on black rectangle

        // use a rectangle object to draw an oval
//        g.setFill(Color.RED);
//        Rectangle box = new Rectangle(100, 100, 30, 30);
//        g.fillOval(box.getX(), box.getY(), box.getWidth(), box.getHeight());

        // move rectangle
//        box.setX(box.getX() + 30);
//        draw(g, box);   // use a homemade method to save typing

        // use a loop to draw a row of 10 red balls, translate 40 between balls

        // use a nested loop to draw a 10 by 10 grid of red balls

        // Draw a polygon
        //Polygon p = new Polygon(10, 20, 10, 40, 50, 60);
//        g.setStroke(Color.BLUE);
//        g.strokePolygon(new double[]{10, 10, 50}, new double[]{20, 40, 60}, 3);

        // write a method that takes a Graphics g and a Rectangle object
        //   and draws an X connecting the corners of the rectangle
        //   then run these lines
        //
        // g.setStroke(Color.VIOLET);
        // crissCross(g, box);
    }

    public void draw(GraphicsContext g, Rectangle b) {
        g.fillOval(b.getX(), b.getY(), b.getWidth(), b.getHeight());
    }
}
