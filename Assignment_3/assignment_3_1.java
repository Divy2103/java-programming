package Assignment_3;
import java.util.Date;

abstract class GeometricObject{

    String color = "blue";
         boolean filled = true;
    private  java.util.Date dateCreated;

    protected GeometricObject(){

        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color,boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    abstract double getArea();
       abstract double getPerimeter();
}
class Circle extends GeometricObject{

   double radius ;


  public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter(){
              return 2*radius;
    }
    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double getPerimeter() {
           return Math.PI*2*radius;
    }
}
class Rectangle extends GeometricObject{
    double width;
    double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    Rectangle(){
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return length;
    }

    public void setHeight(double height) {
        this.length = height;
    }

    @Override
    double getArea() {
        return width*length;
    }
    @Override
    double getPerimeter() {
        return width*length;
    }
}


public class assignment_3_1 {
     static void displayGeometricObject(GeometricObject object) {
        System.out.println(object);
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
    public static void main(String[] args) {
        GeometricObject Object1 = new Circle(5);
        GeometricObject Object2 = new Rectangle(5, 3);

        displayGeometricObject(Object1);
        displayGeometricObject(Object2);


        if (Object1.getArea()==Object2.getArea()){
            System.out.println("area is same");
        }
        else{
            System.out.println("area is not same");
        }
    }
}

