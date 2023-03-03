package uaslp.objetos.figuras;
public class Rectangle extends Shape{
    int a;
    private double base, height;
    public Rectangle(){
        super("Rectangulo");
    }
    public Rectangle(double base,double height){
        this();
        this.base=base;
        this.height=height;
    }
    public double getArea(){//overriding , sobreeescritura de metodos
        return base*height;
    }
    public double getPerimeter(){
        return ((base*2)+(height*2));
    }
    public double getSidesCount(){
        return 4;
    }
    public String toString() {
        return  "█";
    }
}
