import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] number = br.readLine().toCharArray();

        Integer[] reverseOrder = new Integer[number.length];
        for(int i = 0; i < number.length; i++) {
            reverseOrder[i] = number[i] - '0';
        }

        Arrays.sort(reverseOrder, Comparator.reverseOrder());

        for(int i : reverseOrder) {
            bw.write(String.valueOf(i));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
