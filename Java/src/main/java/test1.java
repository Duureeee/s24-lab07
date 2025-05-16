import drawing.Drawing;
import drawing.shapes.*;
import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(
            new int[]{0, 0},
            new int[]{0, 10},
            new int[]{10, 10},
            new int[]{10, 0}
        );

        Triangle triangle = new Triangle(
            new int[]{0, 0},
            new int[]{5, 5},
            new int[]{10, 0}
        );

        Line line = new Line(new int[]{0, 0}, new int[]{10, 10});

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(line);

        Drawing drawing = new Drawing(shapes);

        drawing.draw("jpeg", "output");
        drawing.draw("png", "output");
    }
}
