import java.io.*;
import java.util.StringTokenizer;

public class BOJ1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x;
            int sqrtDistance = (int) Math.sqrt(distance);

            int result;
            if(distance == sqrtDistance * sqrtDistance) {
                result = 2 * sqrtDistance - 1;
            } else if(distance <= sqrtDistance * sqrtDistance + sqrtDistance){
                result = 2 * sqrtDistance;
            } else{
                result = 2 * sqrtDistance + 1;
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
