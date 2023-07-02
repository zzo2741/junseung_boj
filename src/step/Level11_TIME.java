package step;

import java.io.IOException;
import java.util.*;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level11_TIME {
    /*
     * 단계 : 1
     * 문제번호 : 24262
     * 제목 : 알고리즘 수업 - 알고리즘의 수행 시간 1
     */
    public void q1() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(1);
        System.out.println(0); // O(1)
    }
    /*
     * 단계 : 2
     * 문제번호 : 24263
     * 제목 : 알고리즘 수업 - 알고리즘의 수행 시간 2
     */
    public void q2() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        while(a > i) {
            i++;
        }
        System.out.println(i);
        System.out.println(1); // O(N)
    }
    /*
     * 단계 : 3
     * 문제번호 : 24264
     * 제목 : 알고리즘 수업 - 알고리즘의 수행 시간 3
     */
    public void q3() throws IOException{
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        System.out.println(a * a);
        System.out.println(2); // O(N^2)
    }
    /*
     * 단계 : 4
     * 문제번호 : 24265
     * 제목 : 알고리즘 수업 - 알고리즘의 수행 시간 4
     */
    public void q4() throws IOException{
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long total = 0;
        for(long i = a - 1; i > 0; i--){
            total += i;
        }
        System.out.println(total);
        System.out.println(2); // O(N^2)
    }
    /*
     * 단계 : 5
     * 문제번호 : 24266
     * 제목 : 알고리즘 수업 - 알고리즘의 수행 시간 5
     */
    public void q5() throws IOException{
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long result = a * a * a;
        System.out.println(result);
        System.out.println(3); // O(N^3)
    }
    /*
     * 단계 : 6
     * 문제번호 : 24267
     * 제목 : 알고리즘 수업 - 알고리즘의 수행 시간 6
     */
    public void q6() throws IOException{
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        /*
        long result = 0;
        long result2 = 0;
        for(long i = 1; i <= a - 2; i++){
            for(long j = i + 1; j <= a - 1; j++){
                for(long k = j + 1; k <= a; k++){
                    result = result + i * j * k;
                    result2 += 1;
                }
            }
        }
        System.out.println(result + " " + result2);
         */
        System.out.println(a * (a - 1) * (a - 2) / 6);
        System.out.println(3);
    }
    /*
     * 단계 : 7
     * 문제번호 : 24313
     * 제목 : 알고리즘 수업 - 점근적 표기 1
     */
    public void q7() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        if(a1 * n0 + a0 <= c * n0 && c >= a1){ // 0 ≤ |ai| ≤ 100 음수 처리하는 식 추가해야함
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}

/*
import java.util.*;
import java.io.*;
class Main {
    static long result = 0;
    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        recru(a);
        System.out.println(result);
    }

    public static void recru(long a){
        for(long i = a - 2; i > 0; i--){
            result += i;
        }
        a = a - 1;
        if(a > 2){
            recru(a);
        }
    }
}
 */