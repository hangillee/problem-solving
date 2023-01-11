import java.io.*;
import java.util.StringTokenizer;

public class BOJ11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        char[][] boongArr = new char[row][col];
        for(int i = 0; i < row; i++) {
            String boongString = br.readLine();
            for(int j = 0; j < col; j++) {
                boongArr[i][j] = boongString.charAt(j);
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = col-1; j >= 0; j--) {
                bw.write(String.valueOf(boongArr[i][j]));
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
