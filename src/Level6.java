import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level6 {
    /*
     * 단계 : 1
     * 문제번호 : 25083
     * 제목 : 새싹
     */
    public void q1() throws IOException{
        String input = "         ,r'\"7" + "\n" +
                "r`-_   ,'  ,/" + "\n" +
                " \\. \". L_r'" + "\n" +
                "   `~\\/"+ "\n" +
                "      |"+ "\n" +
                "      |";
        System.out.print(input);
    }
    /*
     * 단계 : 2
     * 문제번호 : 3003
     * 제목 : 킹, 퀸, 룩, 비숍, 나이트, 폰
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] - Integer.parseInt(st.nextToken()) + " ");
        }
    }
    /*
     * 단계 : 3
     * 문제번호 : 2444
     * 제목 : 별 찍기 - 7
     */
    public void q3() throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        for(int i = 0; i < 2 * a - 1; i++){
            String str = " ".repeat(Math.abs((a-1)-i)) + "*".repeat((2*a-1) - Math.abs((2*a-2)-(i*2)));
            System.out.println(str);
        }
    }
    /*
     * 단계 : 4
     * 문제번호 : 10988
     * 제목 : 팰린드롬인지 확인하기
     */
    public void q4() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        System.out.println(input.contentEquals(sb.append(input).reverse()) ? 1 : 0);
    }
    /*
     * 단계 : 5
     * 문제번호 : 1157
     * 제목 : 단어 공부
     */
    public void q5() throws IOException{

    }
    /*
     * 단계 : 6
     * 문제번호 : 4344
     * 제목 : 평균은 넘겠지
     */
    public void q6() throws IOException{

    }
    /*
     * 단계 : 7
     * 문제번호 : 2941
     * 제목 : 크로아티아 알파벳
     */
    public void q7() throws IOException{

    }
    /*
     * 단계 : 8
     * 문제번호 : 1316
     * 제목 : 그룹 단어 체커
     */
    public void q8() throws IOException{

    }
    /*
     * 단계 : 9
     * 문제번호 : 25206
     * 제목 : 너의 평점은
     */
    public void q9() throws IOException{

    }
}
