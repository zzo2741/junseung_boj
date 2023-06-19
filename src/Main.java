import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String intput = br.readLine();
        StringTokenizer st = new StringTokenizer(intput);
        Map<String, Integer> map = new HashMap<>();
        int x = 1;
        char a = '0';
        char b = 'A';
        for(char i = a ; i < a + 10; i++){
            map.put(String.valueOf(i), x++);
        }
        for(char i = b ; i < b + 26; i++){
            map.put(String.valueOf(i), x++);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken());
        String str = String.valueOf(sb.reverse());
        char[] list = str.toCharArray();
        int y = Integer.parseInt(st.nextToken());
        int total = 0;
        int temp = 0;
        for(int i = 0; i < list.length; i++){
            total = map.get(String.valueOf(list[i]));
            for(int j = 1; j <= i; j++){

            }
            total = total + (map.get(String.valueOf(list[i])) * temp);
            temp = 1;
        }
        System.out.print(total);
    }
}