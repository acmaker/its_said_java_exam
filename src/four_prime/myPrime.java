package four_prime;

public class myPrime {

    public static void definition ( ) {
        System.out.println( "开平方优化的素数定义判定: \n" );
        int cnt_prime = 0;
        for ( int i = 2; i < 101; ++i ) {
            int sk = (int)Math.sqrt( i );
            int j = 2;
            for ( ; j <= sk; ++j )
                if ( i%j==0 ) break;
            if ( j > sk ) {
                System.out.print( i+" " );
                cnt_prime++;
                if ( cnt_prime%5==0 ) System.out.println( );
            } else continue;
        }
        System.out.println( "\n" );
    }

    public static void euler ( ) {
        System.out.println( "欧拉线性筛法: \n" );
        final int MAXN = (int)(1e4+10); // su 比 MAXN 小一个数量级合适
        boolean[] isp = new boolean[MAXN];
        int[] su = new int[MAXN];
        int tot = 0;
        for ( int i = 0; i < MAXN; ++i ) {
            isp[i] = true;
            su[i] = 0;
        }
        isp[0] = false; isp[1] = false;
        for ( int i = 2; i < 101; ++i ) {
            if ( isp[i]==true ) su[tot++] = i;
            for ( int j = 0; j<tot&&i*su[j]<=MAXN; ++j ) {
                isp[i*su[j]] = false;
                if ( i%su[j]==0 ) break;
            }
        }
        // 输出
        int i = 0; 
        while ( su[i]<101 && su[i]!=0 ) {
            System.out.print( su[i]+" " );
            ++i;
            if ( i%5==0 ) System.out.println( );
        }
    }


    public static void main ( String[] args ) {

        // 素数定义法( 开平方优化 )
        definition( );

        // 欧拉线性筛法
        euler( );

    }
}
