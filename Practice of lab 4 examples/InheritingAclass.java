class Shape{
    double width;
    public double height;
    void draw(){
        System.out.println("Drawing a shape");
    };
}

class Rectangle extends  Shape{
    public Rectangle() {
        height = 10.0;
    }
    public void setShapeHeight(double height) {
        super.height = height;
    }
    
}

public class InheritingAclass {
    public static void main(String[] args) {
        
        
    }
    
}
