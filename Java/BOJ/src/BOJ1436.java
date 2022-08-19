import java.io.*;

public class BOJ1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int movieNum = 0; //666이 포함된 영화 제목
        int count = 1; //666이 포함된 숫자가 나온 횟수
        while(count <= N) { //N번 째 666이 포함된 숫자까지
            movieNum++;
            int targetNum = movieNum;
            while(targetNum > 0) {
                if(targetNum % 1000 == 666) {
                    count++;
                    break;
                } else {
                    targetNum /= 10;
                }
            }
        }

        bw.write(String.valueOf(movieNum));
        bw.flush();
        bw.close();
        br.close();
    }
}
