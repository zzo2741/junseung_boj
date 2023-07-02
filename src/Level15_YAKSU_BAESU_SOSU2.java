import java.io.*;
import java.util.*;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level15_YAKSU_BAESU_SOSU2 {
    /*
     * 단계 : 1
     * 문제번호 : 1934
     * 제목 : 최소공배수
     */
    public void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());

        for(int i = 0; i < x; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(b > a){
                int temp = b;
                b = a;
                a = temp;
            }
            int result = a * b;
            while(b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            bw.write(result / a + "\n");
        }

        bw.close();
    }
    /*
     * 단계 : 2
     * 문제번호 : 13241
     * 제목 : 최소공배수
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        if(b > a){
            long temp = b;
            b = a;
            a = temp;
        }
        long result = a * b;
        while(b != 0) { // a > b 가정 공식처럼 외우기
            long r = a % b;
            a = b;
            b = r;
        }
        bw.write(result / a + "\n");

        bw.close();
    }
    /*
     * 단계 : 3
     * 문제번호 : 1735
     * 제목 : 분수 합
     */
    public void q3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());

        long x = a * d + c * b;
        long y = b * d;
        //bw.write(x + " " + y + " ");

        long xTemp = x;
        long yTemp = y;

        if(y > x){
            long temp = y;
            y = x;
            x = temp;
        }

        while(y != 0){
            long r = x % y;
            x = y;
            y = r;
        }
        // bw.write(x + "\n");
        bw.write(xTemp / x + " " + yTemp / x + "\n");
        bw.close();
    }
    /*
     * 단계 : 4
     * 문제번호 : 2485
     * 제목 : 가로수
     */
    public void q4() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        int gcd = 0; // 최대공약수 구하고
        for(int i = 0; i < a; i++){
            list.add(Integer.parseInt(br.readLine()));
            if(i > 1){
                int x = list.get(i) - list.get(i - 1);
                int y = gcd != 0 ? gcd : list.get(i - 1) - list.get(i - 2);
                while(y != 0){
                    int r = x % y;
                    x = y;
                    y = r;
                }
                gcd = x;
            }
        }

        // 최대공약수 뺴면서 카운트 확인
        int min = list.get(0);
        int max = list.get(list.size() - 1);
        int cnt = 0;
        while(min <= max){
            max = max - gcd;
            cnt++;
        }

        bw.write((cnt - a) + "\n");

        bw.close();
    }
    /*
     * 단계 : 5
     * 문제번호 : 4134
     * 제목 : 다음 소수
     */
    public void q5() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine());
        for(long i = 0; i < a; i++){
            long x = Long.parseLong(br.readLine());

            boolean flag = true;
            while(flag){

                if(x <= 1){
                    x++;
                    continue;
                }

                for(long j = 1; j <= (long) Math.sqrt(x); j++){


                    if(x % j == 0 && j != 1){
                        x++;
                        break;
                    }else if(j == (long) Math.sqrt(x)){
                        bw.write(x + "\n");
                        flag = false;
                        break;
                    }

                }
            }
        }
        bw.close();
    }
    /*
     * 단계 : 6
     * 문제번호 : 1929
     * 제목 : 소수 구하기
     */
    public void q6() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for(int i = a; i <= b; i++){
            if(i == 1){
                continue;
            }

            for(int j = 1; j <= (int)Math.sqrt(i); j++){
                if(i % j == 0 && j != 1) {
                    break;
                }else if(j == (int)Math.sqrt(i)){
                    bw.write(i + "\n");
                }
            }

        }
        bw.close();
    }
    /*
     * 단계 : 7
     * 문제번호 : 4948
     * 제목 : 베르트랑 공준
     */
    public void q7() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                break;
            }
            int cnt = 0;
            for(int i = a + 1; i <= a * 2; i++){
                for(int j = 1; j <= (int)Math.sqrt(i); j++){
                    if(i % j == 0 && j != 1) {
                        break;
                    }else if(j == (int)Math.sqrt(i)){
                        cnt++;
                    }
                }

            }
            bw.write(cnt + "\n");
        }
        bw.close();
    }
    /*
     * 단계 : 8
     * 문제번호 : 17103
     * 제목 : 골드바흐 파티션
     */
    public void q8() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        Set<Integer> set = new TreeSet<>();
        for(int i = 2; i < 1000000; i++){
            for(int j = 1; j <= (int)Math.sqrt(i); j++){
                if(i % j == 0 && j != 1){
                    break;
                }else if(j == (int)Math.sqrt(i)){
                    set.add(i);
                }
            }
        }

        for(int i = 0; i < a; i++){
            int x = Integer.parseInt(br.readLine());
            int cnt = 0;
            for(int j : set){
                if(x - j < j){
                    bw.write(cnt + "\n");
                    break;
                }
                if(set.contains(x - j)){ // List
                    cnt++;
                }
            }
        }

        bw.close();
    }
    /*
     * 단계 : 9
     * 문제번호 : 13909
     * 제목 : 창문 닫기
     */
    public void q9() throws IOException{
        System.out.print((int)Math.sqrt(new Scanner(System.in).nextInt()));
        /* list 출력하여 규칙 확인해보니 1의 갯수와 제곱근 값과 동일
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList();

        int cnt = a;
        for(int i = 1; i <= a; i++){
            for(int j = i; j <= a; j += i){
                if(i == 1){
                    list.add(1);
                }else{
                    if(list.get(j - 1) == 0){
                        list.set(j - 1, 1);
                        cnt++;
                    }else{
                        list.set(j - 1, 0);
                        cnt--;
                    }
                }
            }
        }

        //bw.write(list + "\n");
        bw.write(cnt + "\n");

        bw.close();
         */
    }
}
