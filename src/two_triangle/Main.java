package two_triangle;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner( System.in );

    public static void main ( String[] args ) {

        System.out.println( "Please input the triangel's first side: " );
        double a = sc.nextDouble();
        System.out.println( "Please input the triangel's second side: " );
        double b = sc.nextDouble();
        System.out.println( "Please input the triangel's third side: " );
        double c = sc.nextDouble();
        System.out.println( "Please input the triangel's Color: " );
        String coloer = sc.next();
        System.out.println( "Please input the triangel whether is filled: " );
        boolean isBeFiled = sc.nextBoolean();

        Triangle triangle = new Triangle( a, b, c);
        triangle.setColor( coloer );
        triangle.setFilled( isBeFiled );

        System.out.println( "\nArea is " + triangle.getArea() + ", \n" +
                "Perimeter is " + triangle.getPerimeter() + ", \n" +
                "Color is " + triangle.getColor() + ", \n" +
                "Whether is filled: " + triangle.isFilled() );
    }
}
