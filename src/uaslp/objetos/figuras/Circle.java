package uaslp.objetos.figuras;

public class Circle extends Shape{
    int a;
    private double radio;

    public Circle(){
        super("Circulo");
    }
    public String toString() {
        return  "○";
    }
    public Circle(double radio){
        this();
        this.radio=radio;
    }
    public double getArea(){
        return Math.PI*Math.pow(radio,2);
    }
    public double getPerimeter(){
        return Math.PI*radio*2;
    }
    public double getSidesCount(){
        return 1;
    }
}