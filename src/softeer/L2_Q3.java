package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class L2_Q3 {

    static int[][] arr;
    static boolean[][] arrChk;
    static List<Integer> list = new ArrayList<>();
    static int N;
    public void q3() throws IOException { // 장애물 인식 프로그램 스택을 이용해서 DFS로 풀음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        arr = new int[N][N];
        arrChk = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String temp = br.readLine();
            for(int j = 0; j < N; j++){
                arr[i][j] = temp.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!arrChk[i][j] && arr[i][j] == 1){
                    solve(i, j);
                }else if(arrChk[i][j] || arr[i][j] == 0){
                    arrChk[i][j] = true;
                }
            }
        }

        Collections.sort(list);
        sb.append(list.size() + "\n");
        for(int i : list){
            sb.append(i + "\n");
        }
        System.out.println(sb);
    }

    public static void solve(int x, int y){
        Stack<int[]> stack = new Stack<>();

        stack.push(new int[]{x, y});

        arrChk[x][y] = true;

        int cnt = 0;

        while(!stack.isEmpty()){
            cnt++;
            int[] temp = stack.pop();

            /*
            for(int test : temp){
                System.out.print(test + " ");

            }
            System.out.println();
            */

            if(N > temp[0] + 1){
                if(arr[temp[0] + 1][temp[1]] == 1 && !arrChk[temp[0] + 1][temp[1]]){
                    stack.push(new int[]{temp[0] + 1, temp[1]});
                }
                arrChk[temp[0] + 1][temp[1]] = true;
            }

            if(0 <= temp[0] - 1){
                if(arr[temp[0] - 1][temp[1]] == 1 && !arrChk[temp[0] - 1][temp[1]]){
                    stack.push(new int[]{temp[0] - 1, temp[1]});
                }
                arrChk[temp[0] - 1][temp[1]] = true;
            }

            if(N > temp[1] + 1){
                if(arr[temp[0]][temp[1] + 1] == 1 && !arrChk[temp[0]][temp[1] + 1]){
                    stack.push(new int[]{temp[0], temp[1] + 1});
                }
                arrChk[temp[0]][temp[1] + 1] = true;
            }


            if(0 <= temp[1] - 1){
                if(arr[temp[0]][temp[1] - 1] == 1 && !arrChk[temp[0]][temp[1] - 1]){
                    stack.push(new int[]{temp[0], temp[1] - 1});
                }
                arrChk[temp[0]][temp[1] - 1] = true;
            }

        }
        //System.out.println(cnt);
        list.add(cnt);
    }
}
