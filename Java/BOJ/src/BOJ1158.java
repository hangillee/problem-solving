import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int front = 0;

        //int[] people = new int[N];
        LinkedList<Integer> people = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            people.add(i+1);
        }

        LinkedList<Integer> yose = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            front += K-1;
            if(front >= people.size()) {
                while(front >= people.size()) {
                    front -= people.size();
                }
            }
            yose.add(people.get(front));
            people.remove(front);
        }

        sb.append("<");
        for(int i = 0; i < yose.size(); i++) {
            if((i + 1) == yose.size()) {
                sb.append(yose.get(i));
                break;
            }
            sb.append(yose.get(i)).append(", ");
        }
        sb.append(">");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
