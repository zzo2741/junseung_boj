package softeer;

import java.io.*;
import java.util.*;

public class L3 {
    public void q1() throws IOException { // 성적 평균
        // L3_Q1 확인
    }

    public void q2() throws IOException { // 수퍼바이러스 (바이러스 문제보다 업그레이드, L2-q9)
        // L3_Q2 확인
    }

    public void q3() throws IOException { // 징검다리 (최장 증가 부분 수열, 동적계획법) LIS
       /*
        자꾸 틀린 이유 반례
        6
        3 2 1 6 4 5 이런식으로 불쑥 나온 경우 대비를 못했음
        2로나옴 답은 3

        8
        2 3 1 7 4 7 5 6
        답 5

        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] sum = new int[N];
        Arrays.fill(sum, 1); // 모두 한번은 밟아서 초기화

        int max = 1;
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < N; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    sum[i] = Math.max(sum[i], sum[j] + 1); // 가장 큰값 찾기
                }
            }
            max = Math.max(max, sum[i]);
        }

        System.out.println(max);
    }


    public void q4() throws IOException { // 조립라인
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[][] arr = new long[2][N];
        StringTokenizer st;
        long ai = 0;
        long bi = 0;
        long atob = 0;
        long btoa = 0;
        long answer = 0;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            ai = Long.parseLong(st.nextToken());
            bi = Long.parseLong(st.nextToken());
            if(i == 0){
                if(i != N - 1) { // 1일 때 제외
                    atob = Long.parseLong(st.nextToken()); // a에서 b
                    btoa = Long.parseLong(st.nextToken()); // b에서 a
                }
                arr[0][i] = ai; // A 시작 초기화
                arr[1][i] = bi; // B 시작 초기화
            }else if(i != N - 1){ // 1, 끝 제외 중간 단계
                arr[0][i] = Math.min(arr[0][i-1] + ai, arr[1][i-1] + btoa + ai); // 단계마다 작은 값 찾고 저장
                arr[1][i] = Math.min(arr[1][i-1] + bi, arr[0][i-1] + atob + bi); // 단계마다 작은 값 찾고 저장
                atob = Long.parseLong(st.nextToken());
                btoa = Long.parseLong(st.nextToken());
            }else{ // 마지막 단계
                arr[0][i] = Math.min(arr[0][i-1] + ai, arr[1][i-1] + btoa + ai); // 마지막 단계
                arr[1][i] = Math.min(arr[1][i-1] + bi, arr[0][i-1] + atob + bi); // 마지막 단계
            }

            /*
            for(int j = 0; j < N; j++){
                System.out.print(arr[0][j] + " ");
            }
            System.out.println();
            for(int j = 0; j < N; j++){
                System.out.print(arr[1][j] + " ");
            }
            System.out.println();
            */
        }

        answer = Math.min(arr[0][N-1], arr[1][N-1]); // 마지막에서 최소값 찾기

        System.out.println(answer);
    }
}
