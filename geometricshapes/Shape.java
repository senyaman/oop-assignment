package geometricshapes;

public abstract class Shape {

    private String type;
    private double lengthOfLines;
    private double area;

    public Shape(String type, double lengthOfLines, double area) {
        this.type = type;
        this.lengthOfLines = lengthOfLines;
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public double getLengthOfLines() {
        return lengthOfLines;
    }

    public double getArea() {
        return area;
    }
}
