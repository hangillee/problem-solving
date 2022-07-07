import java.io.*;
import java.util.Arrays;

public class BOJ10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Integer[] numArr = new Integer[str.length()];
        int sum = 0;

        //입력받은 수의 각각 자리들을 합산하고 배열에 저장
        for(int i = 0; i < numArr.length; i++) {
            sum += str.charAt(i) - '0';
            numArr[i] = str.charAt(i) - '0';
        }

        //오름차순 정렬
        Arrays.sort(numArr);
        //끝에 0이 오고 각 자리 숫자들의 합산이 3의 배수이면 == 30의 배수
        if(numArr[0] == 0 && sum % 3 == 0) {
            //가장 큰 수를 찾아야하기 때문에 맨 뒤부터 역순으로 출력
            for(int i = numArr.length - 1; i >= 0; i--) {
                bw.write(String.valueOf(numArr[i]));
                bw.flush();
            }
        } else {
            //30의 배수가 아니면 -1
            bw.write("-1");
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
