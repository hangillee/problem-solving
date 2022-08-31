import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> pokemonDict = new HashMap<>();
        for(int i = 1; i <= N; i++) {
            String pokemonName = br.readLine();
            pokemonDict.put(pokemonName, String.valueOf(i));
            pokemonDict.put(String.valueOf(i), pokemonName);
        }

        for(int i = 0; i < M; i++) {
            String findResult = pokemonDict.get(br.readLine());
            bw.write(findResult + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
