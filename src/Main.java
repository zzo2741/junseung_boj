import java.util.*;
import java.io.*;
import java.math.*;
class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] list = new boolean[1000001];
        list[0] = list[1] = true;

        /*
        기존에는 Set에 모든 소수 넣고 찾는 형식 => 시간초과로 미통과..
        에라토스테네스의 체 사용하여 소수 가리기 배열에서 Key : Index , value : 소수 false , 아니면 true
         */
        for(int i = 2; i <= Math.sqrt(list.length); i++){
           for(int j = i + i; j < list.length; j += i){
               list[j] = true;
           }
        }

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0) {
                break;
            }

            boolean flag = false;
            for(int i = 2; i <= N / 2; i++){
                if(!list[i] && !list[N - i]){
                    flag = true;
                    System.out.println(N + " = " + i + " + " + (N - i));
                    break;
                }
            }

            if(!flag){
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
