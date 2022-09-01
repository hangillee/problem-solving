import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class BOJ11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        Set<String> strSet = new HashSet<>();
        for(int i = 1; i <= str.length(); i++) {
            for(int j = 0; j < str.length(); j++) {
                if(j + i > str.length()) {
                    break;
                }
                strSet.add(str.substring(j, j+i));
            }
        }

        bw.write(String.valueOf(strSet.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}
