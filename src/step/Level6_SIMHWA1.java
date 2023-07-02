package step;

import java.io.*;
import java.util.*;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level6_SIMHWA1 {
    /*
     * 단계 : 1
     * 문제번호 : 25083
     * 제목 : 새싹
     */
    public void q1() throws IOException{
        String input = "         ,r'\"7" + "\n" +
                "r`-_   ,'  ,/" + "\n" +
                " \\. \". L_r'" + "\n" +
                "   `~\\/"+ "\n" +
                "      |"+ "\n" +
                "      |";
        System.out.print(input);
    }
    /*
     * 단계 : 2
     * 문제번호 : 3003
     * 제목 : 킹, 퀸, 룩, 비숍, 나이트, 폰
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] - Integer.parseInt(st.nextToken()) + " ");
        }
    }
    /*
     * 단계 : 3
     * 문제번호 : 2444
     * 제목 : 별 찍기 - 7
     */
    public void q3() throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        for(int i = 0; i < 2 * a - 1; i++){
            String str = " ".repeat(Math.abs((a-1)-i)) + "*".repeat((2*a-1) - Math.abs((2*a-2)-(i*2)));
            System.out.println(str);
        }
    }
    /*
     * 단계 : 4
     * 문제번호 : 10988
     * 제목 : 팰린드롬인지 확인하기
     */
    public void q4() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        System.out.println(input.contentEquals(sb.append(input).reverse()) ? 1 : 0);
    }
    /*
     * 단계 : 5
     * 문제번호 : 1157
     * 제목 : 단어 공부
     */
    public void q5() throws IOException{
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
        int max = 0;
        ArrayList<String> list2 = new ArrayList<>();
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            if(max <= map.get(str)){
                if(max == map.get(str)){
                    list2.add(str);
                }else{
                    list2.clear();
                    list2.add(str);
                }
                max = map.get(str);
            }

        }
        if(list2.size() > 1){
            System.out.println("?");
        }else{
            System.out.println(list2.get(0));
        }
    }
    /*
     * 단계 : 6
     * 문제번호 : 4344
     * 제목 : 평균은 넘겠지
     */
    public void q6() throws IOException{
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
    /*
     * 단계 : 7
     * 문제번호 : 2941
     * 제목 : 크로아티아 알파벳
     */
    public void q7() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        char[] list = input.toCharArray();
        String[] ca = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        List<String> alist = new ArrayList<>();
        for(int i = 0; i < list.length; i++){
            String temp = String.valueOf(list[i]);
            for(int k = 0; k < ca.length; k++){
                if(ca[k].indexOf(temp) == 0){
                    sb = new StringBuilder();
                    for (int j = 0; j < ca[k].length(); j++){
                        if(i + j < list.length){
                            sb.append(list[i + j]);
                        }
                    }
                    if(ca[k].contentEquals(sb)){
                        alist.add(String.valueOf(sb));
                        i = i + ca[k].length() - 1;
                    }else{
                        if(k < ca.length - 1){
                            continue;
                        }else{
                            alist.add(temp);
                        }
                    }
                    break;
                }else if(k == ca.length - 1){
                    alist.add(temp);
                }
            }
        }
        System.out.print(alist.size());
    }
    /*
     * 단계 : 8
     * 문제번호 : 1316
     * 제목 : 그룹 단어 체커
     */
    public void q8() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int output = a;
        char[] list;
        String lastCheckStr;
        Set<String> set;
        for(int i = 0; i < a; i++){
            list = br.readLine().toCharArray();
            lastCheckStr = "";
            set = new HashSet<>();
            for(int j = 0; j < list.length; j++){
                boolean flag = true;
                if(!lastCheckStr.equals(String.valueOf(list[j]))){
                    Iterator<String> iter = set.iterator();
                    while(iter.hasNext()){
                        if(iter.next().equals(String.valueOf(list[j]))){
                            flag = false;
                            output--;
                            break;
                        }
                    }
                    set.add(String.valueOf(list[j]));
                    lastCheckStr = String.valueOf(list[j]);
                    if(!flag) {
                        break;
                    }
                }
            }
        }
        System.out.println(output);
    }
    /*
     * 단계 : 9
     * 문제번호 : 25206
     * 제목 : 너의 평점은
     */
    public void q9() throws IOException{
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
