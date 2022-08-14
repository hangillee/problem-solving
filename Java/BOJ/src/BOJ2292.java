import java.io.*;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int distance = 1; //최소 거리
        int nodes = 1; //최소 벌집 갯수
        while(true) {
            if(N <= nodes) {
                break;
            } else {
                nodes = nodes + (distance * 6);
                distance++;
            }
        }

        bw.write(String.valueOf(distance));
        bw.flush();
        bw.close();
        br.close();
    }
}
