import java.io.*;
import java.util.*;

public class Round817A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String name = br.readLine();
            Map<Character, Integer> Timur = new HashMap<>() {{
                put('T', 0);
                put('i', 0);
                put('m', 0);
                put('u', 0);
                put('r', 0);
            }};

            if(n != 5) {
                bw.write("NO\n");
            } else {
                char[] targetArr = name.toCharArray();
                boolean isTimur = true;
                for(char c : targetArr) {
                    if(Timur.get(c) != null && Timur.get(c) == 0) {
                        int count = Timur.get(c);
                        Timur.put(c, ++count);
                    } else {
                        isTimur = false;
                        break;
                    }
                }

                if(isTimur) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
