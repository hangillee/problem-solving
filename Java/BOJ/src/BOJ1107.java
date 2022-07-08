import java.io.*;
import java.util.StringTokenizer;

public class BOJ1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int channel = Integer.parseInt(br.readLine());
        int buttonNum = Integer.parseInt(br.readLine()); //고장난 버튼 수
        boolean[] brokenBtns = new boolean[10]; //고장난 버튼들
        if(buttonNum > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < buttonNum; i++) {
                brokenBtns[Integer.parseInt(st.nextToken())] = true;
            }
        }

        int minimum = Math.abs(channel - 100);
        for(int i = 0; i <= 1000000; i++) {
            int pressCount = isPushable(i, brokenBtns);
            if(pressCount > 0) {
                minimum = Math.min(minimum, Math.abs(channel - i) + pressCount);
            }
        }

        bw.write(String.valueOf(minimum));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int isPushable(int num, boolean[] brokenBtns) {
        int pressCount = 0;
        if(num == 0) {
            for(int i = 0; i < brokenBtns.length; i++) {
                if(brokenBtns[num]) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }

        while(num > 0) {
            if(brokenBtns[num % 10]) {
                return 0;
            }
            pressCount++;
            num /= 10;
        }
        return pressCount;
    }
}
