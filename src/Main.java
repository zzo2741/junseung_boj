import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int x = 1;
        char a = '1';
        char b = 'A';
        for(char i = a ; i < a + 9; i++){
            map.put(String.valueOf(i), x++);
        }
        for(char i = b ; i < b + 26; i++){
            map.put(String.valueOf(i), x++);
        }
        System.out.println(map.toString());
        char[] list = st.nextToken().toCharArray();
        int total = 1;
        for(int i = 0; i < list.length;i++){
            total *= map.get(String.valueOf(list[i]));
        }
        System.out.println(total - 1);

    }

}
