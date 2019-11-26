package eight_account;

import java.util.Date;
import java.util.Scanner;

public class Account {

    private int ID = 0;
    private double balance = 0;
    private double annualInterestRate = 0.0;
    private Date dannualInterestRate;

    public Account ( ) {
    }
    public Account ( int ID, double balance ) {
        this.ID = ID;
        this.balance = balance;
    }
    public double getMonthlyInterestRate ( ) {
        return annualInterestRate/12;
    }
    public void withDraw ( double num ) {
        this.balance -= num;
    }
    public void deposit ( double num ) {
        this.balance += num;
    }
    public void showInformation ( ) {
        System.out.println( "\nThe user's information as follows, \n" +
                "ID: " + this.ID +"\n"+
                "balance: " + this.balance +"\n"+
                "annualInterestRate: " + this.annualInterestRate +"\n"+
                "dannualInterestRate: " + this.dannualInterestRate +"\n" );
    }

    public static void main ( String[] args ) {

        Account ac = new Account( 1122, 100000 );

        ac.withDraw( 25000 );

        ac.deposit( 30000 );

        ac.showInformation( );


    }


}
