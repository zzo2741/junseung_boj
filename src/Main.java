import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        double x = 0;
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num2 = Integer.parseInt(st.nextToken());
            double total = 0;
            for(int j = 0; j < num2; j++){
                int a = Integer.parseInt(st.nextToken());
                list.add(a);
                total += a;
            }
            for(int k = 0; k < list.size(); k++){
                if(list.get(k) > (total / num2)) {
                    x++;
                }
            }
            System.out.printf("%.3f", x / list.size() * 100);
            System.out.print("%\n");
            x =0;
            list.clear();

        }
    }
}
