package uaslp.objetos.figuras;

public class Triangle extends Shape {
    int a;
    private double base, height;

    public Triangle() {
        super("Triangulo");
    }

    public Triangle(double base, double height) {
        this();
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height / 2);
    }

    public double getPerimeter() {
        double side;
        side = Math.sqrt((Math.pow((1 / 2) * base, 2) + Math.pow(height, 2)));
        return (2 * side + base);
    }

    public double getSidesCount() {
        return 3;
    }

    public String toString() {
        return "▲";
    }
}