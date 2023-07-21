package softeer;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class L1 {
    public void q1(){ // 주행거리 비교하기
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A > B){
            System.out.println("A");
        }else if(A < B){
            System.out.println("A");
        }else if(A == B){
            System.out.println("SAME");
        }
    }

    public void q2() throws IOException { // 근무 시간
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[] S = new String[2];
        String[] E = new String[2];
        int total = 0;

        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(br.readLine());
            S = st.nextToken().split(":");
            E = st.nextToken().split(":");
            total += (Integer.parseInt(E[0]) - Integer.parseInt(S[0])) * 60;
            total += Integer.parseInt(E[1]) - Integer.parseInt(S[1]);

        }
        System.out.println(total);
    }

    public void q3() throws IOException { // A + B
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <= T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println("Case #" + i + ": " + (A + B));
        }
    }
}
