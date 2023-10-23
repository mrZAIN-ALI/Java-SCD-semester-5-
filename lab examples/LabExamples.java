public class LabExamples {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        box.show();
    }
}

class Shape {
    double length;
    double width;

    public Shape(double length_, double width_) {
        length = length_;
        width = width_;
    }

    public Shape() {
    };

    public double area() {
        return length * width;
    }
}

class Box extends Shape {
    double height;

    public Box() {
        super();
        height = 0;
    }

    public Box(double length_, double width_, double height_) {
        super(length_, width_);
        height = height_;
    }

    public void show() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, radius);
    }

    public double area() {
        return Math.PI * length * length;
    }
}