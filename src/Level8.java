import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level8 {
    /*
     * 단계 : 1
     * 문제번호 : 2745
     * 제목 : 진법 변환
     */
    public void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String intput = br.readLine();
        StringTokenizer st = new StringTokenizer(intput);
        Map<String, Integer> map = new HashMap<>();
        int x = 0;
        char a = '0';
        char b = 'A';
        for(char i = a ; i < a + 10; i++){
            map.put(String.valueOf(i), x++);
        }
        for(char i = b ; i < b + 26; i++){
            map.put(String.valueOf(i), x++);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken());
        String str = String.valueOf(sb.reverse());
        char[] list = str.toCharArray();
        int y = Integer.parseInt(st.nextToken());
        int total = 0;
        int temp = 0;
        for(int i = 0; i < list.length; i++){
            if(i == 0){
                temp = 1;
            }else{
                temp = y;
            }
            for(int j = 1; j < i; j++){
                temp *= y;
            }
            total = total + (map.get(String.valueOf(list[i])) * temp);
        }
        System.out.print(total);
        /*
        Integer.parseInt(문자열, N진수); --> 10진수로 바꿔주는 아주 좋은 기능 있음.....
        Scanner sc = new Scanner(System.in);
        System.out.print(Integer.parseInt(sc.next(), sc.nextInt()));
         */
    }
    /*
     * 단계 : 2
     * 문제번호 : 11005
     * 제목 : 진법 변환 2
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int z = 0;
        Map<Integer, String> map = new HashMap<>();
        char a = '0';
        char b = 'A';
        int x = 0;
        for(char i = a ; i < a + 10; i++){
            map.put(x++, String.valueOf(i));
        }
        for(char i = b ; i < b + 26; i++){
            map.put(x++, String.valueOf(i));
        }
        while(num >= num2){
            z = num % num2;
            num = num / num2;
            sb.append(map.get(z));
        }
        sb.append(map.get(num));
        System.out.println(sb.reverse());
        /*
        Integer.toString(숫자, N진수); --> 숫자를 N진수로 만들어줌 (소문자로 나옴)
        Scanner sc = new Scanner(System.in);
        System.out.println((Integer.toString(sc.nextInt(),sc.nextInt())).toUpperCase());
         */
    }
    /*
     * 단계 : 3
     * 문제번호 : 2720
     * 제목 : 세탁소 사장 동혁
     */
    public void q3() throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int[] list = {25, 10, 5, 1};
        for(int i = 0; i < a; i++){
            int x = 0;
            int b = sc.nextInt();
            for(int j = 0; j < list.length; j++){
                sb.append(b / list[j] + " ");
                b = b % list[j];
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    /*
     * 단계 : 4
     * 문제번호 : 2903
     * 제목 : 중앙 이동 알고리즘
     */
    public void q4() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 2;
        for(int i = 0; i < a; i++){
            x = x + (x - 1);
        }
        System.out.println(x * x);
    }
    /*
     * 단계 : 5
     * 문제번호 : 2292
     * 제목 : 벌집
     */
    public void q5() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int min = 2, max = 7;
        if(a <= 1){
            System.out.println(1);
        }else{
            while(true){
                if(min <= a && a <= max){
                    break;
                }else{
                    min = min + (6 * b);
                    max = max + (6 * (b + 1));
                }
                b++;
            }
            System.out.println(b + 1);
        }
    }
    /*
     * 단계 : 6
     * 문제번호 : 1193
     * 제목 : 분수찾기
     */
    public void q6() throws IOException{
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int j = 1; // 번호
        int s = 1; // 분자
        int m = 1; // 분모
        boolean flag = true; // 오르락 내리락
        while(j < input){
            if(input == 1){
                break;
            }
            if(flag){
                if(s == 1){
                    m = m + 1;
                    flag = false;
                }else{
                    m++;
                    s--;
                }
            }else{
                if(m == 1){
                    s = s + 1;
                    flag = true;
                }else{
                    s++;
                    m--;
                }
            }
            j++;
        }
        System.out.printf("%d/%d \n", s, m);
    }
    /*
     * 단계 : 7
     * 문제번호 : 2869
     * 제목 : 달팽이는 올라가고 싶다
     */
    public void q7() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int x = (c - b) / (a - b); // (길이 - 미끄러짐) / (올라감 - 미끄러짐)
        if((c - b) % (a - b) > 0){ // 나머지가 있으면 +1 (하루 더 올라가야함)
            x++;
        }
        System.out.println(x);
    }
    /*
     * 단계 : 8
     * 문제번호 : 10757
     * 제목 : 큰 수 A+B
     */
    public void q8() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        System.out.print(a.add(b));
        // add, substract, multiply, divide, remainder
    }
}
