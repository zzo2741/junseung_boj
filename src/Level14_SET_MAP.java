import java.io.*;
import java.util.*;

/*
 * ⨳ import 제대로 했는지 확인
 * https://www.acmicpc.net/short/status/00000/1002/1
 * 00000 > 문제번호
 */
public class Level14_SET_MAP {
    /*
     * 단계 : 1
     * 문제번호 : 10815
     * 제목 : 숫자 카드
     */
    public void q1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        while(st.hasMoreTokens()){
            map.put(Integer.parseInt(st.nextToken()), 1);
        }

        a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            if(map.containsKey(Integer.parseInt(st.nextToken()))){
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }

        }

        bw.close();
    }
    /*
     * 단계 : 2
     * 문제번호 : 14425
     * 제목 : 문자열 집합
     */
    public void q2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < a; i++){
            map.put(br.readLine(), 1);
        }

        String str = "";
        int total = 0;
        for(int i = 0; i < b; i++){
            str = br.readLine();
            if(map.containsKey(str)){
                total += map.get(str);
            }
        }

        bw.write(String.valueOf(total));
        bw.close();
    }
    /*
     * 단계 : 3
     * 문제번호 : 7785
     * 제목 : 회사에 있는 사람
     */
    public void q3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list;
        int a = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>();

        for(int i = 0; i < a; i++){
            list = br.readLine().split(" ");
            if("enter".equals(list[1])){
                set.add(list[0]);
            }else{
                set.remove(list[0]);
            }
            // bw.write(set + "\n");
        }

        ArrayList<String> aList = new ArrayList<>(set);
        Collections.sort(aList, Collections.reverseOrder());
        for (String s : aList) {
            bw.write(s + "\n");
        }

        bw.close();
    }
    /*
     * 단계 : 4
     * 문제번호 : 1620
     * 제목 : 나는야 포켓몬 마스터 이다솜
     */
    public void q4() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 1개로도 가능..
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        String str = "";
        for(int i = 0; i < a; i++){
            str = br.readLine();
            map1.put(str, String.valueOf(i + 1));
            map2.put(String.valueOf(i + 1), str);
        }

        for(int i = 0; i < b; i++){
            str = br.readLine();
            if(map1.containsKey(str)){
                bw.write(map1.get(str) + "\n");
            }else{
                bw.write(map2.get(str) + "\n");
            }
        }

        bw.close();
    }
    /*
     * 단계 : 5
     * 문제번호 : 10816
     * 제목 : 숫자 카드 2
     */
    public void q5() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = "";
        while(st.hasMoreTokens()){
            str = st.nextToken();
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            }else{
                map.put(str, 1);
            }
        }
        // bw.write(map.toString());

        int b = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            str = st.nextToken();
            if(map.containsKey(str)){
                bw.write(map.get(str) + " ");
            }else{
                bw.write("0 ");
            }
        }

        bw.close();
    }
    /*
     * 단계 : 6
     * 문제번호 : 1764
     * 제목 : 듣보잡
     */
    public void q6() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < a; i++){
            map.put(br.readLine(), 0);
        }

        String str = "";
        int cnt = 0;
        for(int i = 0; i < b; i++){
            str = br.readLine();
            if(map.containsKey(str)){
                list.add(str);
            }
        }

        Collections.sort(list);
        bw.write(list.size() + "\n");
        for(String s : list){
            bw.write(s + "\n");
        }

        bw.close();
    }
    /*
     * 단계 : 7
     * 문제번호 : 1269
     * 제목 : 대칭 차집합
     */
    public void q7() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<String> set1 = new HashSet<>(List.of(br.readLine().split(" ")));
        Set<String> set2 = new HashSet<>(List.of(br.readLine().split(" ")));
        List<String> list = new ArrayList<>();

        for(String str : set1){
            if(set2.contains(str)){
                list.add(str);
            }
        }
        
        // removeAll() 보다 forEach()하는 게 속도가 더 빠름
        // set1.removeAll(list);
        // set2.removeAll(list);
        list.forEach(set1::remove);
        list.forEach(set2::remove);

        bw.write(String.valueOf(set1.size() + set2.size()));

        bw.close();
    }
    /*
     * 단계 : 8
     * 문제번호 : 11478
     * 제목 : 서로 다른 부분 문자열의 개수
     */
    public void q8() throws IOException{
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
