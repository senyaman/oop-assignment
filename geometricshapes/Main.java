package geometricshapes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        final double area = 0;
        final double lengthOfLines = 0;

        Point point = new Point("Point", lengthOfLines, area);
        shapes.add(point);

        Line line = new Line("Line", 15, area);
        shapes.add(line);

        Circle circle = new Circle("Circle", 20, 22);
        shapes.add(circle);

        Triangle triangle = new Triangle("Triangle", 15, 20);
        shapes.add(triangle);

        Square square = new Square("Square", 22, 25);
        shapes.add(square);

        Rectangle rectangle = new Rectangle("Rectangle", 33, 35);
        shapes.add(rectangle);

        Parallelogram parallelogram = new Parallelogram("Parallelogram", 25, 30);
        shapes.add(parallelogram);


        for(Shape shape : shapes) {
            System.out.println("=====================" + "\n" + "Type : " + shape.getType() + "\n" +
                    "=====================" + "\n" +
                    "Length of lines : " + shape.getLengthOfLines() + "\n" +
                    "Area: " + shape.getArea() + "\n");
        }

    }

}
