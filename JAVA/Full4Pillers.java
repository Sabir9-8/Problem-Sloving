import java.util.Scanner;

public class Full4Pillers {
    public static void main(String[] args) {
        Geometry g = new Geometry();
        
        g.driver(new Square());
        g.driver(new Ractangle());
        g.driver(new Circle());

    }
}

abstract class Shape
{
    float area;
    abstract public void acceptInput(Scanner scan);
    abstract public void compute();
    public void display() {
        System.out.println("The area is: " + area);
    }
}

class Square extends Shape
{
    private float length;

    public void acceptInput(Scanner scan) {
        System.out.println("Enter the length of Square:");
        length = scan.nextFloat();
    }

    public void compute() {
        super.area = length * length;
    }
}

class Ractangle extends Shape
{
    private float length;
    private float width;

    public void acceptInput(Scanner scan) {
        System.out.println("Enter the length of Ractangle:");
        length = scan.nextFloat();
        System.out.println("Enter the width of Rectangle:");
        width = scan.nextFloat();
    }

    public void compute() {
        super.area = length * width;
    }
}

class Circle extends Shape
{
    private float radius;

    public void acceptInput(Scanner scan) {
        System.out.println("Enter the radius of Circle:");
        radius = scan.nextFloat();
    }

    public void compute() {
        super.area = (float)Math.PI * radius * radius;
    }
}

class Geometry
{
    public void driver(Shape s) {
        Scanner scanner = new Scanner(System.in);
        s.acceptInput(scanner);
        s.compute();
        s.display();
    }
}
