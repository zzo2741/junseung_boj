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

    public void q5() throws IOException { // 강의실배정(백준보다는 쉬운 문제)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 종료시간으로 오름차순
        Arrays.sort(arr, (o1, o2) -> o1[1] - o2[1]);

        /*
        for(int i = 0; i < N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
        */

        // 스택에 담기 위해 마지막에 넣은 것이 top이기 때문
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0][1]);
        for(int i = 1; i < N; i++){
            // System.out.println("비교" + stack.peek() + " " + arr[i][0]);
            // top과 비교
            if(stack.peek() <= arr[i][0]){
                stack.push(arr[i][1]);
            }
        }

        // System.out.println(stack);
        // 스택 사이즈가 강의실 배정 수
        System.out.println(stack.size());
    }

    public void q6() throws IOException { // 우물안의 개구리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = stringToInt(st.nextToken());
        int W = stringToInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        // 자신이 들 수 있는 무게와 자신이 더 최고라고 생각하는 배열 두개
        int[][] arr = new int[2][N];
        Arrays.fill(arr[1], 1); // 1이면 자신이 최고 0이면 최고가 아님
        for(int i = 0; i < N; i++){
            arr[0][i] = stringToInt(st.nextToken());
        }

        // 비교
        for(int i = 0; i < W; i++){
            st = new StringTokenizer(br.readLine());
            int ai = stringToInt(st.nextToken()) - 1;
            int bi = stringToInt(st.nextToken()) - 1;
            if(arr[0][ai] > arr[0][bi]){ // a가 최고
                arr[1][bi] = 0;
            }else if(arr[0][ai] < arr[0][bi]){ // b가 최고
                arr[1][ai] = 0;
            }else{ // 둘이 같음
                arr[1][ai] = 0;
                arr[1][bi] = 0;
            }
        }

        /*
        for(int i = 0; i < N; i++){
            System.out.print(arr[0][i] + " ");
        }
        System.out.println();
        for(int i = 0; i < N; i++){
            System.out.print(arr[1][i] + " ");
        }
        System.out.println();
        */

        int result = 0;
        for(int i = 0; i < N; i++){
            result += arr[1][i];
        }

        System.out.println(result);
    }

    public void q7() throws IOException { // 택배 마스터 광우
        // L3_Q7 확인
    }

    public void q8() throws IOException { // 동계 테스트 시점 예측
        // L3_Q8 확인
    }

    public void q9() throws IOException { // 스마트 물류
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String[] strArr = br.readLine().split("");
        int answer = 0;
        for(int i = 0; i < N; i++){
            if("P".equals(strArr[i])){ // 로보트 일때
                for(int j = i - K; j <= i + K; j++){
                    if(j >= 0 && j < N){ // 시작이 0이고 마지막이 배열 크기보다 작아야함
                        if("H".equals(strArr[j])){
                            answer++; // 카운트
                            strArr[j] = "X"; // 잡은 부품은 X로
                            break;
                        }
                    }
                }
            }
        }

        /*
        for(int i = 0; i < N; i++){
            System.out.print(strArr[i] + " ");
        }
        */

        System.out.println(answer);
    }

    public static int stringToInt(String str) {return Integer.parseInt(str);}
}
