package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class L3_Q1 {
    /*
    시간 복잡도에 대해 생각해야함 10^8 = 1억 = 1초로 생각
    O(KN) 10^6 * 10^4 = 10^10 = 100억 = 100초
    이런 경우 공식을 잘찾기 합의 경우 배열이 커지면서 합을 가진다던가. 구간합 문제
     */
    public void q1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken()); // 0 값은 미리 만들기
        for(int i = 1; i < N; i++) { // N으로 가면서 sum한 값을 가지고 올라감
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }

        for(int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.printf("%.02f \n", avg(A, B, arr));
        }
    }
    public static double avg(int a, int b, int[] arr){
        double result = 0;
        if(a == 1){ // 시작이 1이면 0이란 마찬가지
            result = arr[b - 1];
        }else{ // 공식을 찾으면 편리함
            result = arr[b - 1] - arr[a - 2];
        }

        result = result / ((b - a) + 1);
        return result;
    }
}
