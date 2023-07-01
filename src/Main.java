import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        StringBuilder sb = null;
        String[] list = br.readLine().split("");

        for(int i = 0; i < list.length; i++){
            sb = new StringBuilder();
            for(int j = i; j < list.length; j++){
                sb.append(list[j]);
                set.add(sb.toString());
            }
        }
        bw.write(String.valueOf(set.size()));

        bw.close();
    }
}