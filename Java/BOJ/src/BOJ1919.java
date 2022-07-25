import java.io.*;

public class BOJ1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] firstAlphabets = new int[26];
        int[] secondAlphabets = new int[firstAlphabets.length];

        char[] firstStr = br.readLine().toCharArray();
        char[] secondStr = br.readLine().toCharArray();

        for (char value : firstStr) {
            firstAlphabets[value - 97]++;
        }

        for (char c : secondStr) {
            secondAlphabets[c - 97]++;
        }

        int deleteChar = 0;
        for(int i = 0; i < firstAlphabets.length; i++) {
                deleteChar += Math.abs(firstAlphabets[i] - secondAlphabets[i]);
        }

        bw.write(String.valueOf(deleteChar));
        bw.flush();
        bw.close();
        br.close();
    }
}
