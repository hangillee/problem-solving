import java.io.*;
import java.util.*;

public class BOJ1759 {
    static char[] chars;
    static boolean[] isVisted;
    static int L, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        isVisted = new boolean[C];
        chars = new char[C];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < C; i++) {
            chars[i] = st.nextToken().charAt(0);
        }

        Arrays.sort(chars);

        DFS(0, 0);
    }

    public static void DFS(int code, int idx) throws IOException {
        if (idx == L) {
            int vowel = 0;
            int consonant = 0;
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < C; i++) {
                if(isVisted[i]) {
                    sb.append(chars[i]);
                    char c = chars[i];
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowel++;
                    } else {
                        consonant++;
                    }
                }
            }
            if(vowel >= 1 && consonant >= 2) {
                System.out.println(sb);
            }
            return;
        }

        for (int i = code; i < C; i++) {
            isVisted[i] = true;
            DFS(i+1, idx+1);
            isVisted[i] = false;
        }
    }
}
