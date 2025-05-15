import drawing.Drawing;
import drawing.shapes.Line;
import drawing.shapes.Rectangle;
import drawing.shapes.Shape;
import drawing.shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        // Точкийн координатууд (x, y) -ыг int[] хэлбэрээр үүсгэнэ
        int[] p1 = {0, 0};
        int[] p2 = {10, 0};
        int[] p3 = {10, 10};
        int[] p4 = {0, 10};
        int[] p5 = {5, 15};

        // Rectangle үүсгэх (дөрвөн цэгийн координат)
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);

        // Triangle үүсгэх (гурав цэгийн координат)
        Triangle triangle = new Triangle(p1, p3, p5);

        // Line үүсгэх (эхлэл ба төгсгөл цэгүүд)
        Line line = new Line(p1, p5);

        // Shape-уудыг List-д хийж байна
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(line);

        // Drawing объект үүсгэж, shape-уудаа өгнө
        Drawing drawing = new Drawing(shapes);

        // Зураг зурж байна (jpeg формат, файлын нэр: "myDrawing")
        drawing.draw("jpeg", "myDrawing");

        // Бас png форматтайгаар зурж болно
        drawing.draw("png", "myDrawing");
    }
}