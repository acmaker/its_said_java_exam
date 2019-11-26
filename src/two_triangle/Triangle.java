package two_triangle;

public class Triangle extends GemetricObject{

    public double a = 1.0, b = 1.0, c = 1.0;

    public Triangle ( ) {
    }
    public Triangle ( double a, double b, double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getPerimeter( ) {
        return this.a+this.b+this.c;
    }
    public double getArea( ) {
        double s = getPerimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public String toString ( ) {
        return "Triangle: "+
                "a="+a+", "+
                "b="+b+", "+
                "c="+c;
    }
}

