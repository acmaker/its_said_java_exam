package one_random;
import java.util.Random;

public class one_random {

    static final int LIMIT = 10; // 随机数范围

    public static void main ( String args[] ) {
        
        // 实例对象
        Random rdm = new Random();

        // 定义并初始化记录随机数出现个数的数组
        int[] cnt_num = new int[100];
        for ( int i = 0; i < LIMIT; ++i ) cnt_num[i] = 0;

        // 统计随机数出现的个数
        for ( int i = 0; i < LIMIT; ++i ) {
            int tmpNum = rdm.nextInt( 10 );
            cnt_num[tmpNum]++;
        }

        // 输出
        for ( int i = 0; i < LIMIT; ++i ) { 
            System.out.println( "The number "+i+" appears "+cnt_num[i]+" time/times." );
        }
    }
}