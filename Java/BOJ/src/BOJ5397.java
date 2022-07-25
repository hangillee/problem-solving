import java.io.*;
import java.util.LinkedList;

public class BOJ5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> keyLog;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            char[] keyStack = br.readLine().toCharArray();
            keyLog = new LinkedList<>();
            int idx = 0;
            for(char c : keyStack) {
                if(c == '<') {
                    if(idx > 0) {
                        idx--;
                    }
                } else if (c == '>') {
                    if(idx < keyLog.size()) {
                        idx++;
                    }
                } else if (c == '-') {
                    if(idx > 0) {
                        idx--;
                        keyLog.remove(idx);
                    }
                } else {
                    keyLog.add(idx, c);
                    idx++;
                }
            }
            for(char c : keyLog) {
                bw.write(String.valueOf(c));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
