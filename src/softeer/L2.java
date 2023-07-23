package softeer;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class L2 {

    public void q1() throws IOException{ // 금고털이
        // 그리디 알고리즘의 예
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            list.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        Collections.sort(list, (o1, o2) -> o2[1] - o1[1]); // 내림차순

        int total = 0;
        for(int[] e : list){
            if(W > e[0]){
                total += e[0] * e[1]; // 무게와 보석값
                W -= e[0]; // 무게만큼 빼기
            }else{
                total += W*e[1]; // 나머지와 보석값
                break;
            }
        }
        System.out.println(total);
    }
    public void q2() throws IOException{ // 8단 변속기
        Scanner sc = new Scanner(System.in);
        String[] strList = sc.nextLine().split(" ");

        if("1".equals(strList[0])){
            for(int i = 0; i < 8; i++){
                if(i + 1 != Integer.parseInt(strList[i])){
                    System.out.println("mixed");
                    break;
                }else if(i == 7){
                    System.out.println("ascending");
                }
            }
        }else if("8".equals(strList[0])){
            for(int i = 8; i > 0; i--){
                if(i != Integer.parseInt(strList[8 - i])){
                    System.out.println("mixed");
                    break;
                }else if(i == 1){
                    System.out.println("descending");
                }
            }
        }else{
            System.out.println("mixed");
        }
    }

    public void q3() throws IOException {
        // L2_Q3확인
    }
    public void q4() throws IOException { // 지도 자동 구축
        // 점이 계속 생기는 문제 2 * 2 = 4 > 3 * 3 = 9  > 3 + (3 - 1)^2 = 25 ~~
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 2;
        for(int i = 1; i <= N; i++){
            a = a + (a - 1);
            // System.out.println(a);
        }

        System.out.println(a * a);
    }

    public void q5() throws IOException { // 비밀 메뉴 (문자열 비교 문제)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < str.length; i++){
            sb.append(str[i]);
        }

        String secret = sb.toString();

        sb = new StringBuilder();
        String[] inputStrArr = br.readLine().split(" ");
        for(int i = 0; i < inputStrArr.length; i++){
            sb.append(inputStrArr[i]);
        }

        String inputStr = sb.toString();

        if(inputStr.indexOf(secret) > -1){
            System.out.println("secret");
        }else{
            System.out.println("normal");
        }
    }

    public void q6() throws IOException { // 회의실 예약 (문자열 문제)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        TreeMap<String, boolean[]> map = new TreeMap<>();

        for(int i = 0; i < N; i++){
            map.put(br.readLine(), new boolean[18]);
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            Arrays.fill(map.get(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), true);
        }

        List<String> strList;
        for(String key : map.keySet()){
            strList = new ArrayList<>();
            sb.append("Room ").append(key).append(":\n");

            int start = 0;
            for(int i = 9; i < 18; i++){
                // System.out.print(map.get(key)[i] + " ");
                if(!map.get(key)[i]){
                    if(start == 0){
                        start = i;
                    }
                    if(i == 17){
                        strList.add((start < 10 ? "0" + start : start) + "-" + (i + 1));
                    }
                }else if(map.get(key)[i]){
                    if(start != 0){
                        strList.add((start < 10 ? "0" + start : start) + "-" + i);
                    }
                    start = 0;
                }
            }

            // System.out.println(strList);
            sb.append(strList.size() == 0 ? "Not available\n" : strList.size() + " available:\n");
            for(String str : strList){
                sb.append(str).append("\n");
            }
            if(!key.equals(map.lastKey())){
                sb.append("-----\n");
            }
        }

        System.out.println(sb);
    }
}
