import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = br.readLine().split(" "); // 0 ~ 5
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);
        int d = Integer.parseInt(list[3]);
        int e = Integer.parseInt(list[4]);
        int f = Integer.parseInt(list[5]);
        int x2 = 0;
        int y2 = 0;
        for(int x = -999; x <= 999; x++){
            for(int y = 999; y >= -999; y--){
                if(a * x + b * y == c && d * x + e * y == f){
                    x2 = x;
                    y2 = y;
                    break;
                }
            }
        }
        System.out.println(x2 + " " + y2);
    }
}

