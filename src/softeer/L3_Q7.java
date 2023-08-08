package softeer;

import java.io.*;
import java.util.*;

public class L3_Q7 {
    static int N, M, K, min; // 변수 초기화
    public static void q7() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = stringToInt(st.nextToken());
        M = stringToInt(st.nextToken());
        K = stringToInt(st.nextToken());
        min = M * K; // 최댓댓값 ( 바구니 총 무게 * 횟수 )

        int[] arr = new int[N];
        int[] output = new int[N];
        boolean[] visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = stringToInt(st.nextToken());
        }

        perm(arr, output, visited, 0, N, N);
        System.out.println(min);

    }
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            // System.out.println(min + " " + calcMin(output));
            min = Math.min(min, calcMin(output));
            return;
        }

        for (int i = 0; i < n; i++) { // 순열 공식
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
    public static int calcMin(int[] output){
        Queue<Integer> queue = new LinkedList<>(); // 큐로 무한돌기
        for(int v : output){
            queue.offer(v); // 큐에 넣기
        }
        int result = 0;
        int cnt = 0;
        int sum = 0;

        while(true){
            sum += queue.peek();
            queue.offer(queue.poll()); // 빼고 넣기 < 무한반복

            if(sum + queue.peek() > M){ // 바구니 무게 넘으면
                cnt++; // 횟수 증가
                result += sum; // 총 무게
                sum = 0; // 무게 초기화
            }

            if(cnt == K) break; // 정해진 횟수와 같으면 break;
        }

        return result;
    }

    public static int stringToInt(String str) {return Integer.parseInt(str);}
}
