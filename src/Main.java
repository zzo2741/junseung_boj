import java.util.*;
import java.io.*;
import java.math.*;
class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        /*
        1 1
        2 1 2
        3 1   3
        4 1 2   4
        5 1       5
        6 1 2 3     6
        7 1           7
        8 1 2   4       8
        9 1   3           9
        101 2     5         10
         */
        long a = Integer.parseInt(br.readLine());
        long total = 0;
        for(long i = 1; i <= a; i++){
            total += i * (a / i); // 숫자의 갯수
        }
        System.out.println(total);
    }
}
