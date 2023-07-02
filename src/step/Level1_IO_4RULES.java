package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level1_IO_4RULES {
    /*
     * 단계 : 1
     * 문제번호 : 2557
     * 제목 : Hello World
     */
    public void q1(){
        System.out.print("Hello World!");
    }
    /*
     * 단계 : 2
     * 문제번호 : 1000
     * 제목 : A+B
     */
    public void q2(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a + b);
    }
    /*
     * 단계 : 3
     * 문제번호 : 1001
     * 제목 : A-B
     */
    public void q3(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a - b);
    }
    /*
     * 단계 : 4
     * 문제번호 : 10998
     * 제목 : A×B
     */
    public void q4(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a * b);
    }
    /*
     * 단계 : 5
     * 문제번호 : 1008
     * 제목 : A/B
     */
    public void q5(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.print(a / b);
    }
    /*
     * 단계 : 6
     * 문제번호 : 10869
     * 제목 : 사칙연산
     */
    public void q6(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
    /*
     * 단계 : 7
     * 문제번호 : 10926
     * 제목 : ??!
     */
    public void q7(){
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        id += "??!";
        System.out.print(id);
    }
    /*
     * 단계 : 8
     * 문제번호 : 18108
     * 제목 : 1998년생인 내가 태국에서는 2541년생?!
     */
    public void q8(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        year -= 543;
        System.out.print(year);
    }
    /*
     * 단계 : 9
     * 문제번호 : 10430
     * 제목 : 나머지
     */
    public void q9(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
    /*
     * 단계 : 10
     * 문제번호 : 2588
     * 제목 : 곱셈
     */
    public void q10(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] blist = String.valueOf(b).toCharArray();
        for (int i = blist.length - 1; 0 <= i ; i--) {
            System.out.println(a * Character.getNumericValue(blist[i]));
        }
        System.out.println(a * b);
    }
    /*
     * 단계 : 11
     * 문제번호 : 11382
     * 제목 : 꼬마 정민
     */
    public void q11() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        long a, b, c;
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
        System.out.print(a + b + c);
    }
    /*
     * 단계 : 12
     * 문제번호 : 10171
     * 제목 : 고양이
     */
    public void q12(){
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
    /*
     * 단계 : 13
     * 문제번호 : 10172
     * 제목 : 개
     */
    public void q13(){
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }
}
