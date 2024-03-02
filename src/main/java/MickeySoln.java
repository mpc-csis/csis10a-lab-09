import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class MickeySoln extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void boxOval(GraphicsContext g, Rectangle bb) {
        g.fillOval(bb.getX(), bb.getY(), bb.getWidth(), bb.getHeight());
    }

    public void drawMickey(GraphicsContext g, Rectangle bb) {
        boxOval(g, bb);
        if (bb.getWidth() < 3) {
            return;
        }

        double dx = bb.getWidth() / 2.0;
        double dy = bb.getHeight() / 2.0;

        Rectangle left = new Rectangle(bb.getX() - dx / 2,
                bb.getY() - dy / 2, dx, dy);
        boxOval(g, left);

        Rectangle right = new Rectangle(bb.getX() + dx / 2 * 3,
                bb.getY() - dy / 2, dx, dy);
        boxOval(g, right);

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(getClass().getSimpleName());

        // Use Border pane to center content
        BorderPane pane = new BorderPane();
        Canvas canvas = new Canvas(400, 400);
        pane.setCenter(canvas);

        // Draw Mickey
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.GRAY);
        Rectangle boundingBox = new Rectangle(100, 150, 200, 200);
        drawMickey(graphicsContext, boundingBox);
        stage.setScene(new Scene(pane));
        stage.show();
    }
}