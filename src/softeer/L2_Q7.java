package softeer;

import java.util.*;
import java.io.*;


public class L2_Q7
{
    static Map<String, int[]> map;
    static StringBuilder sb;

    public static void q7() throws IOException
    {
        map = new HashMap<>();
        map.put("0", new int[]{6, 1, 1, 1, 0, 1, 1, 1});
        map.put("1", new int[]{2, 0, 0, 1, 0, 0, 1, 0});
        map.put("2", new int[]{5, 1, 0, 1, 1, 1, 0, 1});
        map.put("3", new int[]{5, 1, 0, 1, 1, 0, 1, 1});
        map.put("4", new int[]{4, 0, 1, 1, 1, 0, 1, 0});
        map.put("5", new int[]{5, 1, 1, 0, 1, 0, 1, 1});
        map.put("6", new int[]{6, 1, 1, 0, 1, 1, 1, 1});
        map.put("7", new int[]{4, 1, 1, 1, 0, 0, 1, 0});
        map.put("8", new int[]{7, 1, 1, 1, 1, 1, 1, 1});
        map.put("9", new int[]{6, 1, 1, 1, 1, 0, 1, 1});

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int total = 0;
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            total += switchLight1(A, B);
            total += switchLight2(A, B);
            System.out.println(total);
        }
    }

    public static int switchLight1(String a, String b){ // 앞에 다른 부분
        int total = 0;
        int cnt = a.length() - b.length();

        for(int i = 0; i < Math.abs(cnt); i++){
            if(cnt > 0){
                total += map.get(a.charAt(i) + "")[0];
            }else{
                total += map.get(b.charAt(i) + "")[0];
            }
        }
        return total;
    }

    public static int switchLight2(String a, String b){ // 나머지 차이
        int total = 0;
        int cnt = Math.abs(a.length() - b.length()); // 길이 차이로 인덱스 차이 맞춤
        if(a.length() - b.length() < 0) { // 무조건 a가 길이가 큰것
            String temp = a;
            a = b;
            b = temp;
        }
        for(int i = 0; i < b.length(); i ++){
            for(int j = 1; j <= 7; j++){
                total += Math.abs(map.get(a.charAt(i + cnt) + "")[j] - map.get(b.charAt(i) +"")[j]); // 차이 구하기 (절대값 처리)
            }
        }
        return total;
    }
}