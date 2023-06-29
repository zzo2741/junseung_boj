import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int min = 9999;
        // 5x+3y = 18
        for(int i = 0; i <= 1000; i++){
            for(int j = 0; j <= 500; j++){
                if(5 * i + 3 * j == a){
                    if(min > i + j) {
                        min = i + j;
                    }
                }
            }
        }
        System.out.println(min == 9999? -1 : min);
    }
}