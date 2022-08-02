import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ5430 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            char[] commands = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());

            Deque<Integer> AC = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");
            for(int j = 0; j < n; j++) {
                AC.add(Integer.parseInt(st.nextToken()));
            }

            ACProgress(commands, AC);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void ACProgress(char[] commands, Deque<Integer> AC) {
        boolean isReversed = false;

        for(int j = 0; j < commands.length; j++) {
            if(commands[j] == 'R') {
                isReversed = !isReversed;
            } else if(commands[j] == 'D') {
                if(AC.isEmpty()) {
                    sb.append("error\n");
                    return;
                }
                if(isReversed) {
                    AC.pollLast();
                } else {
                    AC.pollFirst();
                }
            }
        }

        sb.append("[");
        while(!AC.isEmpty()) {
            if(isReversed) {
                sb.append(AC.pollLast());
            } else {
                sb.append(AC.pollFirst());
            }
            if(!AC.isEmpty()) {
                sb.append(",");
            }
        }
        sb.append("]\n");
    }
}
