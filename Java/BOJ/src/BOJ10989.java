import java.io.*;

public class BOJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[10001];

        //계수 정렬 (Counting Sort)
        //데이터 범위를 명확하게 알 때 사용 가능하다. 메모리 초과될 가능성이 높기 때문이다.
        for(int i = 0; i < N; i++) {
            //입력한 수가 인덱스인 곳에 +1
            num[Integer.parseInt(br.readLine())]++;
        }

        //처음부터 끝까지 인덱스에 1씩 합산한 값이 0이 될 때까지 해당 인덱스 출력
        //ex) num[1]에 3이 있다면 1 1 1이 출력된다.
        for(int i = 0; i < num.length; i++) {
            while(num[i]-- > 0) {
                sb.append(i + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
