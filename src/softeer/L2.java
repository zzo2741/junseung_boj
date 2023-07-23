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
}
