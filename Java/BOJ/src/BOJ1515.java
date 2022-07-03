import java.io.*;
import java.util.ArrayList;

public class BOJ1515 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        int current = 0; //현재 자릿수
        int target = 0; //비교 대상 수

        //최악의 경우에도 30000까지만 나온다.
        while(target++ <= 30000) {
            //현재 검사 중인 자리의 숫자와 비교할 대상
            String key = String.valueOf(target);
            for(int i = 0; i < key.length(); i++) {
                //비교할 대상 수를 앞 자리부터 비교해서 같은 수가 나오면 다음 자리 검사
                if(key.charAt(i) == num.charAt(current)) {
                    current++;
                }
                //만약 끝 자리까지 도달 했을 경우
                //검사 중인 자리의 숫자가 N
                if(current == num.length()) {
                    bw.write(String.valueOf(target));
                    bw.flush();
                    target = 30001;
                    break;
                }
            }
        }
    }
}
