import java.io.*;

public class BOJ25501 {
    static char[] targetStrArr;
    static int recursiveCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String targetStr = br.readLine();
            targetStrArr = targetStr.toCharArray();
            recursiveCount = 0;
            bw.write(isPalindrome(0, targetStrArr.length-1) + " " + recursiveCount + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static int isPalindrome(int left, int right) {
        recursiveCount++;
        if(left >= right) {
            return 1;
        } else if(targetStrArr[left] != targetStrArr[right]) {
            return 0;
        } else {
            return isPalindrome(left+1, right-1);
        }
    }
}
