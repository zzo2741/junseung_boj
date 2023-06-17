import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level4 {
    /*
     * 단계 : 1
     * 문제번호 : 10807
     * 제목 : 개수 세기
     */
    public void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String y = br.readLine();
        int z = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(y);
        int cnt = 0;
        for (int i = 0; i < x; i ++){
            if(z == Integer.parseInt(st.nextToken())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    /*
     * 단계 : 2
     * 문제번호 : 10871
     * 제목 : X보다 작은 수
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i ++){
            int d = Integer.parseInt(st.nextToken());
            if(b > d){
                sb.append(d + " ");
            }
        }
        System.out.println(sb);
    }
    /*
     * 단계 : 3
     * 문제번호 : 10818
     * 제목 : 최소, 최대
     */
    public void q3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] list = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        System.out.println(list[0] + " " + list[a - 1]);
    }
    /*
     * 단계 : 4
     * 문제번호 : 2562
     * 제목 : 최댓값
     */
    public void q4(){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int a, b = 0;
        for(int i = 1; i <= 9; i++){
            a = sc.nextInt();
            if(max < a){
                max = a;
                b = i;
            }
        }
        System.out.println(max + "\n" + b);
    }
    /*
     * 단계 : 5
     * 문제번호 : 10810
     * 제목 : 공 넣기
     */
    public void q5()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 배열크기
        int b = Integer.parseInt(st.nextToken()); // 바구니 담을 횟수
        int[] list = new int[a];
        for(int i = 0; i < b; i++){
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken()); // 시작
            int d = Integer.parseInt(st.nextToken()); // 끝
            int e = Integer.parseInt(st.nextToken()); // 공번호
            for(int j = c - 1; j <= d - 1; j++){
                list[j] = e;
            }
        }
        for(int i = 0; i < a; i++){
            System.out.print(list[i] + " ");
        }
    }
    /*
     * 단계 : 6
     * 문제번호 : 10813
     * 제목 : 공 바꾸기
     */
    public void q6()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 배열크기
        int b = Integer.parseInt(st.nextToken()); // 바구니 담을 횟수
        int[] list = new int[a];
        int temp = 0;
        for(int i = 0; i < a; i++){
            list[i] = i + 1;
        }
        for(int i = 0; i < b; i++){
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken()) - 1; // 바꿀 index
            int d = Integer.parseInt(st.nextToken()) - 1; // 바꿀 index
            temp = list[c];
            list[c] = list[d];
            list[d] = temp;
        }
        for(int i = 0; i < a; i++){
            System.out.print(list[i] + " ");
        }
    }
}
