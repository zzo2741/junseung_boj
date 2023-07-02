package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level9_YAKSU_BAESU_SOSU {
    /*
     * 단계 : 1
     * 문제번호 : 5086
     * 제목 : 배수와 약수
     */
    public void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = 0;
        int b = 0;
        while(true){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0){
                break;
            }else if(a > b){
                if(a % b == 0){
                    System.out.println("multiple");
                }else{
                    System.out.println("neither");
                }
            }else{
                System.out.println("factor");
            }
        }
    }
    /*
     * 단계 : 2
     * 문제번호 : 2501
     * 제목 : 약수 구하기
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                list.add(i);
            }
        }
        System.out.println(b > list.size() ? 0 : list.get(b - 1));
    }
    /*
     * 단계 : 3
     * 문제번호 : 9506
     * 제목 : 약수들의 합
     */
    public void q3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int input, total;
        while(true){
            input = Integer.parseInt(br.readLine());
            sb = new StringBuilder();
            total = 0;
            sb.append(input + " = ");
            if(input == -1){
                break;
            }
            for(int i = 1; i < input; i++){
                if(input % i == 0){
                    total += i;
                    sb.append(i + " + ");
                }
            }
            if(input == total){
                // System.out.println(sb);
                int index = sb.lastIndexOf("+");
                System.out.println(sb.delete(index - 1, index + 1));
            }else{
                System.out.println(input + " is NOT perfect.");
            }
        }
    }
    /*
     * 단계 : 4
     * 문제번호 : 1978
     * 제목 : 소수 찾기
     */
    public void q4() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < c; i++){
            int a = Integer.parseInt(st.nextToken());
            for(int j = 1; j <= Math.sqrt(a); j++){
                if(a == 1){
                    break;
                }
                if(a % j == 0 && j != 1){
                    break;
                }else if(j == (int) Math.sqrt(a)){
                    list.add(a);
                }
            }
        }
        System.out.println(list.size());
    }
    /*
     * 단계 : 5
     * 문제번호 : 2581
     * 제목 : 소수
     */
    public void q5() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = 10001;
        int total = 0;
        for(int i = a; i <= b; i++){
            for(int j = 1; j <= Math.sqrt(b); j++){
                if(i <= 1) {
                    break;
                }
                if(i % j == 0 && j != 1 && i != j){
                    break;
                }else if(j == (int)Math.sqrt(b)){
                    if(min > i){
                        min = i;
                    }
                    total += i;
                }
            }
        }
        if(min == 10001){
            System.out.println(-1);
        }else{
            System.out.printf("%d\n%d", total, min);
        }
    }
    /*
     * 단계 : 6
     * 문제번호 : 11653
     * 제목 : 소인수분해
     */
    public void q6() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++){
            if(a % i == 0 && i != 1){
                a = a / i;
                System.out.println(i);
                i = 1;
            }
        }
    }
}
