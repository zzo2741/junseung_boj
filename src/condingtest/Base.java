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
     * 주제 : 00
     * 문제번호 : 000
     * 제목 : 000
     */
    public void SAMPLE() throws IOException{

    }
}
