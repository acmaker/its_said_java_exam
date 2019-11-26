package five_ArryListSum;

import java.util.ArrayList;

public class Five_ArryListSum {

    static ArrayList<Double> arr = new ArrayList<>( );

    public static double Sum ( ArrayList<Double> a ) {
        double sum = 0.0;
        for ( double i : a )
            sum += i;
        return sum;
    }

    public static void main ( String[] args ) {
        for ( int i = 0; i < 101; ++i ) arr.add( (double)i );

        System.out.println( Sum(arr) );

    }
}
