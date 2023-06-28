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
public class Level12_BF {
    /*
     * 단계 : 1
     * 문제번호 : 2798
     * 제목 : 블랙잭
     */
    public void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = 0;
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        // System.out.println(a + " " + b);
        // System.out.println(list);
        // 모든 값 탐색
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                for(int k = j + 1; k < list.size(); k++){
                    int temp = list.get(i) + list.get(j) + list.get(k);
                    if(max < temp &&  b >= temp){
                        max = temp;
                    }
                }
            }
        }
        System.out.println(max);
    }
    /*
     * 단계 : 2
     * 문제번호 : 2231
     * 제목 : 분해합
     */
    public void q2() throws IOException{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int temp = 0;
        for(int i = 1; i <= num; i++){
            temp = i;
            char[] list = String.valueOf(i).toCharArray();
            for(int j = 0; j < list.length; j++){
                temp += Integer.parseInt(list[j] + "");
            }
            // System.out.println(i + " " + temp + " " + num);
            if(temp == num){
                // System.out.println("언제 " + i + " " + temp + " " + num);
                result = i;
                break;
            }

        }
        System.out.println(result);
    }
    /*
     * 단계 : 3
     * 문제번호 : 19532
     * 제목 : 수학은 비대면강의입니다
     */
    public void q3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = br.readLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);
        int d = Integer.parseInt(list[3]);
        int e = Integer.parseInt(list[4]);
        int f = Integer.parseInt(list[5]);
        int x2 = 0;
        int y2 = 0;
        for(int x = -999; x <= 999; x++){
            for(int y = 999; y >= -999; y--){
                if(a * x + b * y == c && d * x + e * y == f){
                    x2 = x;
                    y2 = y;
                    break;
                }
            }
        }
        System.out.println(x2 + " " + y2);
    }
    /*
     * 단계 : 4
     * 문제번호 : 1018
     * 제목 : 체스판 다시 칠하기
     */
    public void q4() throws IOException{


    }
    /*
     * 단계 : 5
     * 문제번호 : 1436
     * 제목 : 영화감독 숌
     */
    public void q5() throws IOException{

    }
    /*
     * 단계 : 6
     * 문제번호 : 2839
     * 제목 : 설탕 배달
     */
    public void q6() throws IOException{

    }
}
