package uaslp.objetos.figuras;
//CastilloPardoDiego
public abstract class Shape {
    int a;
    private String name;

    public Shape(String name){
        this.name=name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract double getSidesCount();
    public String getName(){
        return name;
    }

}