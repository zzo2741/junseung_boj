import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] list = new Integer[a];
        int i = 0;
        while(st.hasMoreTokens()){
            list[i++] = Integer.parseInt(st.nextToken());
        }
        TreeSet<Integer> set = new TreeSet<>(List.of(list));
        HashMap<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> iter = set.iterator();
        int k = 0;
        while(iter.hasNext()){
            map.put(iter.next(), k++);
        }
        for(int j = 0; j < list.length; j++){
            bw.write(map.get(list[j]) + " ");
        }
        bw.close();
    }
}