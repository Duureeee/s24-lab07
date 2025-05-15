package drawing;

import drawing.shapes.Shape;
import drawing.writing.JPEGWriter;
import drawing.writing.PNGWriter;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Drawing {
    private List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    private Writer getWriterForFormat(String format, String filename) throws IOException {
        return switch (format.toLowerCase()) {
            case "jpeg" -> new JPEGWriter(filename + ".jpeg");
            case "png" -> new PNGWriter(filename + ".png");
            default -> throw new IllegalArgumentException("Unsupported format: " + format);
        };
    }

    public void draw(String format, String filename) {
        try (Writer writer = getWriterForFormat(format, filename)) {
            for (Shape shape : this.shapes) {
                shape.draw(writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
