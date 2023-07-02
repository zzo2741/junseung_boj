package step;

import java.io.IOException;
import java.util.*;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level10_KIHA {
    /*
     * 단계 : 1
     * 문제번호 : 27323
     * 제목 : 직사각형
     */
    public void q1() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
    /*
     * 단계 : 2
     * 문제번호 : 1085
     * 제목 : 직사각형에서 탈출
     */
    public void q2() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c - a);
        list.add(d - b);
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    /*
     * 단계 : 3
     * 문제번호 : 3009
     * 제목 : 네 번째 점
     */
    public void q3() throws IOException{
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        for(int i = 0; i < 3; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if(xMap.containsKey(x)){
                xMap.remove(x);
            }else{
                xMap.put(x, 1);
            }
            if(yMap.containsKey(y)){
                yMap.remove(y);
            }else{
                yMap.put(y, 1);
            }
        }
        System.out.printf("%d %d", xMap.keySet().toArray()[0], yMap.keySet().toArray()[0]);
    }
    /*
     * 단계 : 4
     * 문제번호 : 15894
     * 제목 : 수학은 체육과목 입니다
     */
    public void q4() throws IOException{
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        System.out.println(x * 3 + x);
    }
    /*
     * 단계 : 5
     * 문제번호 : 9063
     * 제목 : 대지
     */
    public void q5() throws IOException{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int xMax = -10001, xMin = 10001, yMax = -10001, yMin = 10001;
        for(int i = 0; i < x; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(x == 1){
                break;
            }

            if(a < xMin){
                xMin = a;
            }
            if(a > xMax){
                xMax = a;
            }
            if(b < yMin){
                yMin = b;
            }
            if(b > yMax){
                yMax = b;
            }
        }
        int xGap = xMax - xMin;
        int yGap = yMax - yMin;
        if(xMin == 10001 || yMin == 10001){
            System.out.println(0);
        }else{
            System.out.println(xGap * yGap);
        }
        // System.out.printf("%d, %d, %d, %d", xMax, xMin, yMax, yMin);
    }
    /*
     * 단계 : 6
     * 문제번호 : 10101
     * 제목 : 삼각형 외우기
     */
    public void q6() throws IOException{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int total = x + y + z;
        if(total == 180){
            if(x == y && y == z) {
                System.out.println("Equilateral");
            }else if(x == y || y == z || x == z) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
        }else{
            System.out.println("Error");
        }
    }
    /*
     * 단계 : 7
     * 문제번호 : 5073
     * 제목 : 삼각형과 세 변
     */
    public void q7() throws IOException{
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0, z = 0;
        List<Integer> list = new ArrayList<>();
        while(true) {
            list.clear();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            list.add(x);
            list.add(y);
            list.add(z);
            Collections.sort(list);
            if (x == 0 && y == z) {
                break;
            } else {
                if (list.get(2) < list.get(0) + list.get(1)) {
                    if (x == y && y == z) {
                        System.out.println("Equilateral");
                    } else if (x == y || y == z || x == z) {
                        System.out.println("Isosceles");
                    } else {
                        System.out.println("Scalene");
                    }
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }
    /*
     * 단계 : 8
     * 문제번호 : 14215
     * 제목 : 세 막대
     */
    public void q8() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);

        if(list.get(0) + list.get(1) <= list.get(2)){
            System.out.println(list.get(0) + list.get(1) + (list.get(0) + list.get(1) - 1));
        }else{
            System.out.println(list.get(0) + list.get(1) + list.get(2));
        }
    }
}
