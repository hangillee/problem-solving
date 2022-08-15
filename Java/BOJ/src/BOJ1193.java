import java.io.*;

public class BOJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        int nodes = 0; //현재 단까지의 분수의 갯수
        int level = 0; //현재 단
        int mole;
        int deno;

        while(true) {
            level++; //단 상승
            nodes += level; //분수의 갯수는 단의 누적합
            if(nodes >= X) { //분수의 갯수가 찾으려는 분수보다 커지면
                if(level % 2 == 0) { //만약 단이 짝수일 경우
                    mole = X - nodes + level; //분자에는 찾으려는 수 - 현재까지의 분수의 갯수 + 단
                    deno = nodes - X + 1; //분모에는 현재까지의 분수의 갯수 + 1
                } else { //홀수일 경우 반대로
                    mole = nodes - X + 1;
                    deno = X - nodes + level;
                }
                break;
            }
        }

        bw.write(mole + "/" + deno);
        bw.flush();
        bw.close();
        br.close();
    }
}
