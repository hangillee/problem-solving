import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(alphabet[c - 97] == -1) {
                alphabet[c - 97] = i;
            }
        }

        for(int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}
