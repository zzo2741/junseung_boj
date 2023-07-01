import java.io.*;
import java.util.*;

/*
 * ⨳ import 제대로 했는지 확인
 *
 */
public class Level13_SORT {
    /*
     * 단계 : 1
     * 문제번호 : 2750
     * 제목 : 수 정렬하기
     */
    public void q1() throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a; i++){
            set.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    /*
     * 단계 : 2
     * 문제번호 : 2587
     * 제목 : 대표값2
     */
    public void q2() throws IOException{
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int total = 0;
        int mid = 0;
        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            list.add(a);
            total += a;
        }
        Collections.sort(list);
        mid = list.get(Math.round(list.size() / 2));
        System.out.println(total / list.size());
        System.out.println(mid);
    }
    /*
     * 단계 : 3
     * 문제번호 : 25305
     * 제목 : 커트라인
     */
    public void q3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(b - 1));
    }
    /*
     * 단계 : 4
     * 문제번호 : 2751
     * 제목 : 수 정렬하기 2
     */
    public void q4() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < a; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.close();
    }
    /*
     * 단계 : 5
     * 문제번호 : 10989
     * 제목 : 수 정렬하기 3
     */
    public void q5() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int[] list = new int[a];

        /* List객체 사용시 메모리초과 나옴
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < a; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
         */

        for(int i = 0; i < a; i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);

        for(int i = 0; i < list.length; i++) {
            bw.write(list[i] + "\n");
        }
        bw.close();
    }
    /*
     * 단계 : 6
     * 문제번호 : 1427
     * 제목 : 소트인사이드
     */
    public void q6() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] list = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(list, Collections.reverseOrder());
        for(int i = 0; i < list.length; i++){
            sb.append(list[i]);
        }
        bw.write(sb.toString());
        bw.close();
    }
    /*
     * 단계 : 7
     * 문제번호 : 11650
     * 제목 : 좌표 정렬하기
     */
    public void q7() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        for(int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine());
            int y  = Integer.parseInt(st.nextToken());
            int x  = Integer.parseInt(st.nextToken());

            if(map.containsKey(x)){
                ArrayList<Integer> list = map.get(x);
                list.add(y);
                map.put(x, list);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(y);
                map.put(x, list);
            }
        }

        // map.entrySet(); 사용할 경우
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            Collections.sort(entry.getValue());
            for(int i = 0; i < entry.getValue().size(); i++){
                bw.write(entry.getKey() + " " + entry.getValue().get(i) + "\n");
            }
        }

        /* map.keySet(); 사용할 경우
        Set<Integer> set = map.keySet();
        Iterator iter = set.iterator();

        while(iter.hasNext()){
            int x = Integer.parseInt(String.valueOf(iter.next()));
            if(map.get(x).size() > 1){
                Collections.sort(map.get(x));
                for(int i = 0; i < map.get(x).size(); i++){
                    bw.write(x + " " + map.get(x).get(i) + "\n");
                }
            }else{
                bw.write(x + " " + map.get(x).get(0) + "\n");
            }
        }
        */
        bw.close();
    }
    /*
     * 단계 : 8
     * 문제번호 : 11651
     * 제목 : 좌표 정렬하기 2
     */
    public void q8() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        for(int i = 0; i < a; i++){
            // 11650 좌표 정렬하기 문제에서 x, y값 바꿈
            st = new StringTokenizer(br.readLine());
            int x  = Integer.parseInt(st.nextToken());
            int y  = Integer.parseInt(st.nextToken());

            if(map.containsKey(y)){
                ArrayList<Integer> list = map.get(y);
                list.add(x);
                map.put(y, list);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(x);
                map.put(y, list);
            }
        }

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            Collections.sort(entry.getValue());
            for(int i = 0; i < entry.getValue().size(); i++){
                // 11650 좌표 정렬하기 문제에서 출력 순서 바꿈
                bw.write(entry.getValue().get(i) + " " + entry.getKey() + "\n");
            }
        }
        bw.close();
    }
    /*
     * 단계 : 9
     * 문제번호 : 1181
     * 제목 : 단어 정렬
     */
    public void q9() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        Map<Integer, TreeSet<String>> map = new TreeMap<>();

        for(int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine());
            String x  = st.nextToken();
            int length = x.length();
            if(map.containsKey(x.length())){
                TreeSet<String> set = map.get(length);
                set.add(x);
                map.put(length, set);
            }else{
                TreeSet<String> set = new TreeSet();
                set.add(x);
                map.put(length, set);
            }
        }

        for (Map.Entry<Integer, TreeSet<String>> entry : map.entrySet()) {
            Iterator<String> iter = entry.getValue().iterator();
            while(iter.hasNext()){
                bw.write(iter.next() + "\n");
            }
        }
        bw.close();
    }
    /*
     * 단계 : 10
     * 문제번호 : 10814
     * 제목 : 나이순 정렬
     */
    public void q10() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        Map<Integer, ArrayList<String>> map = new TreeMap<>();

        for(int i = 0; i < a; i++){
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            String x  = st.nextToken();

            if(map.containsKey(b)){
                ArrayList<String> list = map.get(b);
                list.add(x);
                map.put(b, list);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(x);
                map.put(b, list);
            }
        }

        for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
            for(int i = 0; i < entry.getValue().size(); i++){
                bw.write(entry.getKey() + " " + entry.getValue().get(i) + "\n");
            }
        }
        bw.close();
    }
    /*
     * 단계 : 11
     * 문제번호 : 18870
     * 제목 : 좌표 압축
     */
    public void q11() throws IOException {
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
        //bw.write(set.toString() + "\n");
        for(int j = 0; j < list.length; j++){
            bw.write(map.get(list[j]) + " ");
        }
        bw.close();
    }
}
