import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1963 {
    static boolean[] primeNum;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int A;
        int B;

        //에라토스테네스의 체
        primeNum = new boolean[10000];
        primeNum[0] = primeNum[1] = true;

        for(int i = 2; i*i < 10000; i++) {
            if(!primeNum[i]) {
                for(int j = i*i; j < 10000; j += i) {
                    primeNum[j] = true;
                }
            }
        }

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write(BFS(A, B) + "\n");
            bw.flush();
        }

        bw.close();
        br.close();
    }

    public static String BFS(int A, int B) {
        int[] count = new int[10000];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(A);
        isVisited = new boolean[10000];
        isVisited[A] = true;

        while(!queue.isEmpty()) {
            int currentPrime = queue.poll();
            //4자리의 비밀번호를
            for(int i = 0; i < 4; i++) {
                //각 자리 숫자를 0 ~ 9까지 대입해보며
                for(int j = 0 ; j <= 9; j++) {
                    //4자리를 유지해야하므로 첫째 자리 제외
                    if(i == 0 && j == 0) {
                        continue;
                    }
                    //한 자리를 변경한 수를 받아오고
                    int changeNum = change(currentPrime, i, j);
                    //만일 변경한 수가 소수이고 방문한 적 없으면
                    if(!primeNum[changeNum] && !isVisited[changeNum]) {
                        //변경되기 전까지의 변경 횟수에 +1
                        count[changeNum] = count[currentPrime] + 1;
                        //방문 처리
                        isVisited[changeNum] = true;
                        queue.add(changeNum);
                    }
                }
            }
        }
        //한 번도 도달하지 못했다면 변경 불가능
        if(!isVisited[B]) {
            return "Impossible";
        }
        return String.valueOf(count[B]);
    }

    public static int change(int currentPrime, int idx, int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(currentPrime));
        sb.setCharAt(idx, (char)(num + '0'));
        return Integer.parseInt(sb.toString());
    }
}
