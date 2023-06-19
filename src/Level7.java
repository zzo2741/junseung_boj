import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level7 {
    /*
     * 단계 : 1
     * 문제번호 : 2738
     * 제목 : 행렬 덧셈
     */
    public void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] list = new int[a][b];
        for(int i = 0; i < a * 2; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < b; j++){
                int x = i % a;
                list[x][j] += Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*
     * 단계 : 2
     * 문제번호 : 2566
     * 제목 : 최댓값
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int maxX = 0, maxY = 0, maxValue = 0;
        int[][] list = new int[9][9];
        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                int x = Integer.parseInt(st.nextToken());
                if(maxValue < x){
                    maxValue = x;
                    maxX = i;
                    maxY = j;
                }
                list[i][j] = x;
            }
        }
        System.out.println(maxValue);
        System.out.printf("%d %d", maxX + 1, maxY + 1);
    }
    /*
     * 단계 : 3
     * 문제번호 : 10798
     * 제목 : 세로읽기
     */
    public void q3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] list = new String[5][15];
        for(int i = 0; i < 5; i++){
            char[] list2 = br.readLine().toCharArray();
            for(int j = 0; j < 15; j++){
                if(j < list2.length){
                    list[i][j] = String.valueOf(list2[j]);
                }else{
                    list[i][j] = "";
                }
            }
        }
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                sb.append(list[j][i]);
            }
        }
        System.out.println(sb);
    }
    /*
     * 단계 : 4
     * 문제번호 : 2563
     * 제목 : 색종이
     */
    public void q4() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] list = new int[100][100];
        int num = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j = a; j < a + 10; j++){
                for(int k = b; k < b + 10; k++){
                    list[j][k] = 1;
                }
            }
        }
        for(int i = 0; i < 100 ; i++){
            for(int j = 0; j < 100 ; j++){
                total += list[i][j];
            }
        }
        System.out.println(total);
    }
}
