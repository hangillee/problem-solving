import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        int currentNum = 1;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            //현재까지 오름차순으로 스택에 넣은 수의 다음 수가 입력받은 수보다 작거나 같을 때
            if(num >= currentNum) {
                //스택에 넣은 수의 다음 수부터 입력받은 수까지 PUSH
                for(int j = currentNum; j <= num; j++) {
                    stack.push(j);
                    currentNum++;
                    sb.append("+\n");
                }
            //스택의 가장 위에 있는 수가 입력 받은 수와 다르면 PUSH/POP으로 수열을 만들 수 없음
            } else if(stack.peek() != num) {
                System.out.println("NO");
                return;
            }
            //그 외의 경우 POP
            stack.pop();
            sb.append("-\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
