import java.io.*;
import java.util.StringTokenizer;

public class BOJGomGomB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        boolean chongchongMeet = false;
        int count = 1;
        String lastMeet = "";
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            if(!(A.equals(lastMeet)) && !(B.equals(lastMeet))) {
                chongchongMeet = false;
            }
            if(A.equals("ChongChong") || B.equals("ChongChong")) {
                chongchongMeet = true;
                if(!(A.equals("ChongChong"))) {
                    lastMeet = A;
                } else {
                    lastMeet = B;
                }
            }
            if(chongchongMeet) {
                if(A.equals(lastMeet)) {
                    lastMeet = B;
                } else {
                    lastMeet = A;
                }
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
