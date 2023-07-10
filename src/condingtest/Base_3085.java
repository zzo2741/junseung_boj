package condingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Base_3085 {
    static char[][] arr; // 배열 전역변수
    static int N, MAX = 1; // 가로 세로 값, 사탕 최대값
    public static void solution (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N]; // 배열 선언
        for(int i = 0; i < N; i++){ // 값 넣기
            arr[i] = br.readLine().toCharArray(); // 배열 집어넣기
        }
        srchRow();
        srchCol();
        System.out.println(MAX);
    }

    /*
    1. 값 바꾸고
    2. 원위치 시키기
     */
    public static void swap(int x1, int y1, int x2, int y2){
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    public static void srchRow() { // 양옆 바꾸고 전체 가로 세로 검색
        for(int i = 0; i < N; i++){ // 0 ~ N
            for(int j = 0; j < N - 1; j++){ // 0 ~ N - 1 가로열 끝단 처리
                swap(i, j, i, j + 1); // 값 바꾸기
                chkRow();
                chkCol();
                swap(i, j + 1, i, j); // 원 위치
            }
        }
    }
    public static void srchCol() { // 위아래 바꾸고 전체 가로 세로 검색
        for(int i = 0; i < N - 1; i++){ // 0 ~ N - 1 세로열 끝단 처리
            for(int j = 0; j < N; j++){ // 0 ~ N
                swap(i, j, i + 1, j); // 값 바꾸기
                chkRow();
                chkCol();
                swap(i + 1, j, i, j); // 원위치
            }
        }
    }
    public static void chkRow() {
        for(int i = 0; i < N; i++){ // 0 ~ N
            int cnt = 1;
            for(int j = 0; j < N - 1; j++){ // 0 ~ N - 1 세로열 끝단 처리
                if(arr[i][j] == arr[i][j + 1]){
                    cnt++;
                    MAX = Math.max(MAX, cnt);
                }else{
                    cnt = 1;
                }
            }
        }
    }
    public static void chkCol() {
        for(int i = 0; i < N; i++){ // 0 ~ N
            int cnt = 1;
            for(int j = 0; j < N - 1; j++){ // 0 ~ N - 1 가로열 끝단 처리
                if(arr[j][i] == arr[j + 1][i]){
                    cnt++;
                    MAX = Math.max(MAX, cnt);
                }else{
                    cnt = 1;
                }
            }
        }
    }
}
