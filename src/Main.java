import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        char[] list = input.toCharArray();
        for(int i = 0; i < list.length; i++){
            String str =  String.valueOf(list[i]).toUpperCase();
            set.add(str);
            if(!map.containsKey(str)){
                map.put(str, 1);
            }else{
                map.put(str, map.get(str) + 1);
            }
        }
        System.out.println(map.toString());
        String outStr = "";
        int max = 0;
        for(int i = 0; i < list.length; i++){

        }

    }
}
