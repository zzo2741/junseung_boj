package step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level5_STRING {
    /*
     * 단계 : 1
     * 문제번호 : 27866
     * 제목 : 문자와 문자열
     */
    public void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(br.readLine());
        char[] list = input.toCharArray();
        System.out.println(list[num - 1]);
    }
    /*
     * 단계 : 2
     * 문제번호 : 2743
     * 제목 : 단어 길이 재기
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] list = input.toCharArray();
        System.out.println(list.length);
    }
    /*
     * 단계 : 3
     * 문제번호 : 9086
     * 제목 : 문자열
     */
    public void q3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            String input = br.readLine();
            sb.append(input.charAt(0) +""+input.charAt(input.length() -1)+"\n");
        }
        System.out.println(sb);
    }
    /*
     * 단계 : 4
     * 문제번호 : 11654
     * 제목 : 아스키 코드
     */
    public void q4() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.print(input.charAt(0)+0);
    }
    /*
     * 단계 : 5
     * 문제번호 : 11720
     * 제목 : 숫자의 합
     */
    public void q5() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] list = str.toCharArray();
        int total = 0;
        for(int i = 0; i < list.length; i++){
            total += Integer.parseInt(list[i] + "");
        }
        System.out.println(total);
    }
    /*
     * 단계 : 6
     * 문제번호 : 10809
     * 제목 : 알파벳 찾기
     */
    public void q6() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        // char a = 97;
        for(char a = 97; a < 97 + 26; a++){
            sb.append(input.indexOf(String.valueOf(a)) + " ");
        }
        System.out.println(sb);
    }
    /*
     * 단계 : 7
     * 문제번호 : 2675
     * 제목 : 문자열 반복
     */
    public void q7() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            for(int j = 0; j < b.length(); j++){
                sb.append(String.valueOf(b.charAt(j)).repeat(Integer.parseInt(a)));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    /*
     * 단계 : 8
     * 문제번호 : 1152
     * 제목 : 단어의 개수
     */
    public void q8() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());
    }
    /*
     * 단계 : 9
     * 문제번호 : 2908
     * 제목 : 상수
     */
    public void q9() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String max = "";
        for(int i = 3 - 1; 0 <= i; i--){
            if(a.charAt(i) > b.charAt(i)){
                max = a;
                break;
            }else if(a.charAt(i) < b.charAt(i)){
                max = b;
                break;
            }else{
                max = a;
            }
        }
        for(int i = 3 - 1; 0 <= i; i--){
            System.out.print(max.charAt(i));
        }
    }
    /*
     * 단계 : 10
     * 문제번호 : 5622
     * 제목 : 다이얼
     */
    public void q10() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        HashMap<String, Integer> map = new HashMap<>();
        // char a = 'A'; //65
        int alphabeNum = 26;
        int i = 2;
        int j = 1;
        int total = 0;
        for(char a = 65; a < 65 + alphabeNum; a++){
            map.put(String.valueOf(a), i);
            if(j == 3 && i == 7){
                j += 2;
            }
            if(j % 3 == 0 && i != 9){
                i++;
                j = 1;
            }else {
                j++;
            }
        }
        for(int k = 0; k < input.length(); k ++){
            total += map.get(String.valueOf(input.charAt(k))) + 1;
        }
        System.out.println(total);
    }
    /*
     * 단계 : 11
     * 문제번호 : 11718
     * 제목 : 그대로 출력하기
     */
    public void q11() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        String str = "";
        while((str = br.readLine())!=null) {
            System.out.println(str);
        }
    }
}
