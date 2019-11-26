package seven_average;

import java.util.ArrayList;
import java.util.Scanner;

public class Seven_Average {

    static Scanner sc = new Scanner( System.in );

    public static int average(int[] array) {
        int sum = 0;
        for ( int i : array ) {
            sum += i;
        }
        return sum/10;
    }
    public static double  average(double[] array) {
        double sum = 0;
        for ( double i : array ) {
            sum += i;
        }
        return sum/10;
    }

    public static void main ( String[] args ) {

        int[] arr_int = new int[10];
        for ( int i = 0; i < 10; ++i ) arr_int[i] = sc.nextInt();
        System.out.println( "\nThe average is: "+ average(arr_int) +"\n");

        double[] arr_double = new double[10];
        for ( int i = 0; i < 10; ++i ) arr_double[i] = sc.nextDouble();
        System.out.println( "\nThe average is: "+ average(arr_double) );

    }

}

