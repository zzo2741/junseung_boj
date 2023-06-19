import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Double> map = new HashMap<>();
        StringTokenizer st;
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        double x = 0, y = 0;
        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            double b = Double.parseDouble(st.nextToken());
            String c = st.nextToken();;
            x += c.equals("P") ? 0 : (map.get(c) * b);
            y += c.equals("P") ? 0 : b;
        }
        System.out.println(x / y);
    }
}
