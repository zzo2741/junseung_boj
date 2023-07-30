package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L3_Q2 {
    /*
    분할 정복
    K * P^10^N 으로 엄청 큰 닶이 나옴
    P^10*N으로 분할한다. 재귀사용하면 됌
    1 2 1인경우
    1 * 2^10*1

    f(2, 10)  f(2, 5)*f(2, 5)
    f(2, 5)   f(2, 2) * f(2, 2) * 2
    f(2, 2)   f(2, 1) * f(2, 1)
    f(2, 1)   2
     */
    static long K; // 100000000
    static long P; // 100000000
    static long N; // 10000000000000000
    static long Result;
    static long D = 1000000007;
    public static void q2() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Long.parseLong(st.nextToken());
        P = Long.parseLong(st.nextToken());
        N = Long.parseLong(st.nextToken());

        Result = K * incre(P, 10 * N) % D;
        System.out.println(Result);
    }

    static long incre(long p, long n){

        if(n == 1){
            return p;
        }

        Result = incre(p, n / 2);

        if(n % 2 == 0){
            return Result * Result % D;
        }else{
            return (Result * Result % D) * p % D; // << 여기서 한번 더 % D 해줘야함 안하면 최종 값이 다름 모듈러 연산
        }

    }
}
