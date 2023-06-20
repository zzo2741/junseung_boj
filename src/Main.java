import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int j = 1; // 번호
        int s = 1; // 분자
        int m = 1; // 분모
        boolean flag = true; // 오르락 내리락
        while(j < input){
            if(input == 1){
                break;
            }
            if(flag){
                if(s == 1){
                    m = m + 1;
                    flag = false;
                }else{
                    m++;
                    s--;
                }
            }else{
                if(m == 1){
                    s = s + 1;
                    flag = true;
                }else{
                    s++;
                    m--;
                }
            }
            j++;
        }
        System.out.printf("%d/%d \n", s, m);
    }
}