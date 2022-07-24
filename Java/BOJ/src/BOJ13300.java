import java.io.*;
import java.util.StringTokenizer;

public class BOJ13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] rooms = new int[7][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            rooms[grade][gender]++;
        }

        int needRooms = 0;
        for(int i = 1; i <= 6; i++) {
            if(rooms[i][0] > 0) {
                int students = rooms[i][0];
                if(students % K != 0) {
                    needRooms++;
                }
                needRooms += (students / K);
            }
            if(rooms[i][1] > 0) {
                int students = rooms[i][1];
                if(students % K != 0) {
                    needRooms++;
                }
                needRooms += (students / K);
            }
        }

        bw.write(String.valueOf(needRooms));
        bw.flush();
        bw.close();
        br.close();
    }
}
