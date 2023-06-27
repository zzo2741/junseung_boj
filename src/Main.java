import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);

        if(list.get(0) + list.get(1) <= list.get(2)){
            System.out.println(list.get(0) + list.get(1) + (list.get(0) + list.get(1) - 1));
        }else{
            System.out.println(list.get(0) + list.get(1) + list.get(2));
        }
    }
}