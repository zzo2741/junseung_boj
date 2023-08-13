package softeer;
import java.util.*;
import java.io.*;

// BFS 문제
public class L3_Q8
{
    static int N, M, answer;
    static int[][] map, visited;
    static int[] x = {1, -1, 0, 0};
    static int[] y = {0, 0, 1, -1};
    static Queue<int[]> queue;
    public static void q8() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];


        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer = 0;
        while(true){
            // 얼음이 다녹으면 끝
            if(chk(map) == 0) {
                break;
            }
            // 탐색
            solution();
            answer++;
        }

        System.out.println(answer);
    }

    static void solution() {
        // 탐색 여부
        queue = new LinkedList<>();
        visited = new int[N][M];

        // 처음 시작
        queue.offer(new int[]{0, 0});
        visited[0][0] = 1; // 방문여부 확인

        // bfs 탐색 시작
        while(!queue.isEmpty()){
            // 뽑기
            int[] now = queue.poll();
            // 상하좌우 확인
            for(int i = 0; i < 4; i++){
                int x1 = now[0] + x[i];
                int y1 = now[1] + y[i];
                // System.out.println(x1 + " " + y1);
                if(x1 < 0 || y1 < 0 || x1 >= N || y1 >= M) { // 끝지점, 방문했으면 패스
                    continue;
                }
                if(visited[x1][y1] == 0 && map[x1][y1] == 0) { // 처음 방문
                    visited[x1][y1] = 1; // 방문 표시
                    queue.offer(new int[]{x1, y1}); // 큐에 등록
                }else if(map[x1][y1] >= 1){ // 얼음 지점
                    map[x1][y1]++;
                }
            }
        }
        //System.out.println("탐색 후 검증증");
        //chk(map);

        // 탐색 후 녹이기
        for (int i = 0; i < N; i++) {
            for (int j=0; j < M; j++) {
                if (map[i][j] > 2) { // 기본  1,2번이상 마주치면 3
                    map[i][j] = 0; //녹음
                }else if(map[i][j] > 1){ // 기본 1, 한번만 마주치면 2
                    map[i][j] = 1; // 1로 원복
                }
            }
        }
    }

    static int chk(int[][] arr){
        int result = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j] == 1){
                    result++;
                }
                //System.out.print(arr[i][j] + " ");
            }
            //System.out.println();
        }
        // System.out.println("---");

        return result;
    }


}