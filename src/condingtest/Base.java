package condingtest;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Base {
    /*
     * 주제 : 수학
     * 문제번호 : 4375
     * 제목 : 1
     */
    public void q_4375() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while((input = br.readLine()) != null){
            BigInteger n = new BigInteger(input);
            BigInteger big = BigInteger.valueOf(0); // 0부터 시작해야 big * 10 + 1 = 1
            while(true){
                big = big.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(1));
                if(big.mod(n).equals(BigInteger.valueOf(0))){
                    bw.write(big.toString().length() + "\n");
                    break;
                }
            }
        }
        bw.close();
    }
    /*
     * 주제 : 수학
     * 문제번호 : 1037
     * 제목 : 약수
     */
    public void q_1037() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] list = new int[a];
        int i = 0;
        for(String str : br.readLine().split(" ")){
            list[i++] = Integer.parseInt(str);
        }
        Arrays.sort(list);
        System.out.println(list[0] * list[list.length - 1]);
    }
    /*
     * 주제 : 자료구조
     * 문제번호 : 10828
     * 제목 : 스택
     */
    public void q_10828() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        StringTokenizer st;
        for(int i = 0; i < a; i++){
            String str = br.readLine();
            if(str.contains("push")){
                st = new StringTokenizer(str);
                st.nextToken();
                stack.push(st.nextToken());
            }else if ("top".equals(str)) {
                if(stack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }else if ("size".equals(str)) {
                System.out.println(stack.size());
            }else if ("empty".equals(str)) {
                if(stack.empty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if ("pop".equals(str)) {
                if(stack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                    stack.pop();
                }
            }
        }
    }

    /*
     * 주제 : 수학
     * 문제번호 : 17427
     * 제목 : 약수의 합 2
     */
    public void q_17427() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        /*
        1 1
        2 1 2
        3 1   3
        4 1 2   4
        5 1       5
        6 1 2 3     6
        7 1           7
        8 1 2   4       8
        9 1   3           9
        101 2     5         10
         */
        long a = Integer.parseInt(br.readLine());
        long total = 0;
        for(long i = 1; i <= a; i++){
            total += i * (a / i); // 숫자의 갯수
        }
        System.out.println(total);
    }

    /*
     * 주제 : 수학
     * 문제번호 : 17425
     * 제목 : 약수의 합
     */
    public void q_17425() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        long[] list = new long[1000001];
        long[] sumList = new long[1000001];
        Arrays.fill(list, 1);

        for(int i = 2; i <= 1000000; i++){
            for(int j = 1; i * j <= 1000000; j++){
                list[i * j] += i;
            }
        }

        for(int i = 1; i <= 1000000; i++){
            sumList[i] = sumList[i-1] + list[i];
        }

        for(int t = 0; t < T; t++){
            int I = Integer.parseInt(br.readLine());
            sb.append(sumList[I]).append("\n");
        }
        System.out.println(sb);
    }

    /*
     * 주제 : 수학
     * 문제번호 : 2609
     * 제목 : 최대공약수와 최소공배수
     */
    public void q_2609() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        long M = A * B;
        if(B > A){
            int temp = B;
            B = A;
            A = temp;
        }

        // 유클리드 호제법
        while(B != 0){
            int r = A % B;
            A = B;
            B = r;
        }

        int gcd = A;

        System.out.println(gcd + "\n" + (M / gcd));
    }

    /*
     * 주제 : 수학
     * 문제번호 : 6588
     * 제목 : 골드바흐의 추측
     */
    public void q_6588() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] list = new boolean[1000001];
        list[0] = list[1] = true;

        /*
        기존에는 Set에 모든 소수 넣고 찾는 형식 => 시간초과로 미통과..
        에라토스테네스의 체 사용하여 소수 가리기 배열에서 Key : Index , value : 소수 false , 아니면 true
         */
        for(int i = 2; i <= Math.sqrt(list.length); i++){
            for(int j = i + i; j < list.length; j += i){
                list[j] = true;
            }
        }

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0) {
                break;
            }

            boolean flag = false;
            for(int i = 2; i <= N / 2; i++){
                if(!list[i] && !list[N - i]){
                    flag = true;
                    System.out.println(N + " = " + i + " + " + (N - i));
                    break;
                }
            }

            if(!flag){
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }

    /*
     * 주제 : 브루트 포스
     * 문제번호 : 2309
     * 제목 : 일곱 난쟁이
     */
    public void q_2309() throws IOException{

    }

    /*
     * 주제 : 00
     * 문제번호 : 000
     * 제목 : 000
     */
    public void SAMPLE() throws IOException{

    }
}
