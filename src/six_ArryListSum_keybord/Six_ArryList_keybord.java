package six_ArryListSum_keybord;

import java.util.ArrayList;
import java.util.Scanner;

public class Six_ArryList_keybord {

    static Scanner sc = new Scanner( System.in );
    static ArrayList<Double> arr = new ArrayList<>( );

    public static double Sum ( ArrayList<Double> a ) {
        double sum = 0.0;
        for ( double i : a )
            sum += i;
        return sum;
    }

    public static void main ( String[] args ) {

        for ( int i = 0; i < 10; ++i ) arr.add( sc.nextDouble() );

        System.out.println( "\nThe sum is: "+ Sum( arr ) );

    }
}