import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ9019 {
    static boolean[] isVisited;
    static String command;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(BFS(A, B) + "\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }

    public static String BFS(int A, int B) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(A);
        String[] comList = new String[10000];
        Arrays.fill(comList, "");
        isVisited = new boolean[10000];
        isVisited[A] = true;

        while(!queue.isEmpty()) {
            int currentNum = queue.poll();
            for(int i = 0; i < 4; i++) {
                int afterNum = afterCommand(currentNum, i);
                if(!isVisited[afterNum]) {
                    comList[afterNum] = comList[currentNum] + command;
                    if(!isVisited[afterNum]) {
                        isVisited[afterNum] = true;
                        queue.offer(afterNum);
                    }
                }
            }
        }
        return String.valueOf(comList[B]);
    }

    public static int afterCommand(int num, int com) {
        if(com == 0) {
            num = (num * 2) % 10000;
            command = "D";
            return num;
        } else if (com == 1) {
            command = "S";
            if(num == 0) {
                return 9999;
            } else {
                num -= 1;
                return num;
            }
        } else if (com == 2) {
            command = "L";
            return (num % 1000) * 10 + num / 1000;
        } else if (com == 3) {
            command = "R";
            return (num % 10) * 1000 + num / 10;
        }
        return 0;
    }
}
