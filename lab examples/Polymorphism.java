abstract class Shape {
    public abstract double area();
    public abstract void show();
}

class Box extends Shape {
    double height;
    double width;

    public Box(double height_, double width) {
        height = height_;
        width = width;
    }

    public double area() {
        return height * width;
    }

    public void show() {
        System.out.println("Box");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("area: " + area());
        System.out.println();
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void show() {
        System.out.println("Circle");
        System.out.println("Radius: " + radius);
        System.out.println("area: " + area());
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s = new Box(6, 8);
        s.show();
        s = new Circle(3);
        s.show();
    }
}
