package programmers;

import java.util.*;


public class Lv3 { // 레벨 3
    public long solution1(int[] sequence) { // 연속 펄스 부분 수열의 합
        /*
        1 ≤ sequence의 길이 ≤ 500,000
        -100,000 ≤ sequence의 원소 ≤ 100,000
        최대값이 50,000,000,000 int보다 큼
        누적합으로 풀었음
         */
        long answer = 0;
        // 1부터 곱한 배열, -1부터 곱한 배열 이렇게 두개
        long[] arr1 = new long[sequence.length];
        long[] arr2 = new long[sequence.length];

        for(int i = 0; i < sequence.length; i++){ // 500,000
            arr1[i] = sequence[i] * ((i + 1) % 2 == 0 ? -1 : 1); // 1부터
            arr2[i] = sequence[i] * ((i + 1) % 2 == 0 ? 1 : -1); // -1부터
        }

        for(int i = 1; i < sequence.length; i++){
            long now1 = arr1[i] + arr1[i - 1]; // 누적합
            long now2 = arr2[i] + arr2[i - 1]; // 누적합
            if(now1 > 0){
                if(now1 > arr1[i]){
                    arr1[i] = now1; // 누적합이 크면 인덱스에 넣기
                }
            }

            if(now2 > 0){
                if(now2 > arr2[i]){
                    arr2[i] = now2; // 누적합이 크면 인덱스에 넣기
                }
            }
        }

        /*
        Math.max로 for문에서 풀면 더 빨리 풀 수 있었음...
         */
        Arrays.sort(arr1); // 제일 큰값 찾기 위해
        Arrays.sort(arr2); // 제일 큰값 찾기 위해

        //Math.max로 풀면 됌
        answer = arr1[sequence.length - 1] > arr2[sequence.length - 1] ? arr1[sequence.length - 1] : arr2[sequence.length - 1];

        return answer;
    }

    public int solution2(int[][] triangle) { // 정수 삼각형
        int answer = 0;

        for(int i = 1; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                if(j == 0){
                    triangle[i][j] += triangle[i-1][j];
                }else if(j == triangle[i].length - 1){
                    triangle[i][j] += triangle[i-1][j - 1];
                }else{
                    triangle[i][j] += Math.max(triangle[i-1][j - 1], triangle[i-1][j]);
                }
                answer = Math.max(answer, triangle[i][j]);
            }
        }

        /*
        for(int i = 0; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
        */

        return answer;
    }
}
