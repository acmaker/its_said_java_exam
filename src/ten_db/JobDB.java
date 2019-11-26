package ten_db;

import java.sql.*;

public class JobDB {

    private static Connection conn = null;
    private static PreparedStatement psm = null;
    private static ResultSet rs = null;

    public static void main ( String[] args ) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch ( ClassNotFoundException e ) {
            e.printStackTrace( );
        }

        try {
            conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test", "root", "1" );
        } catch ( SQLException e ) {
            e.printStackTrace( );
        }



        if ( rs != null ) {
            try {
                rs.close( );
            } catch ( SQLException e ) {
                e.printStackTrace( );
            }
        }
        if ( psm != null ) {
            try {
                psm.close( );
            } catch ( SQLException e ) {
                e.printStackTrace( );
            }

        }
        if ( conn != null ) {
            try {
                conn.close( );
            } catch ( SQLException e ) {
                e.printStackTrace( );
            }
        }


    }


    void addJob ( Job job ) {
        String preparedSql = "insert into job values( ?, ?, ?, ? )";
        String[] param;
        param = new String[]{ job.getJobname().toString(), job.getCompany().toString, job.getEducation().toString, job.getSalary().toString };
        
        try {
            psm = conn.prepareStatement( preparedSql );
            if ( param != null ) {
                for ( int i = 0; i < param.length; ++i ) {
                    psm.setString( i+1, param[i] );
                }
            }
            rs = psm.executeQuery( );
        } catch ( SQLException e ) {
            e.printStackTrace( );
        }
    }

    void queryAllJob ( ) {
        String preparedSql = "select * from job;";
        String[] param;
        param = new String[]{ };
        
        try {
            psm = conn.prepareStatement( preparedSql );
            if ( param != null ) {
                for ( int i = 0; i < param.length; ++i ) {
                    psm.setString( i+1, param[i] );
                }
            }
            rs = psm.executeQuery( );

            while ( rs.next( ) ) {
                System.out.println( 
                    rs.getString( jobname ) +"\t"+ 
                    rs.getString( company ) +"\t"+  
                    rs.getString( education ) +"\t"+ 
                    rs.getString( salary ) +"\n" );
            }

        } catch ( SQLException e ) {
            e.printStackTrace( );
        }

        
    }





}
