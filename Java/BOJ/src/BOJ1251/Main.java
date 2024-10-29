package BOJ1251;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String word = br.readLine();
        List<String> reversedWords = new ArrayList<>();

        for (int i = 1; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) {
                String firstToken = new StringBuffer(word.substring(0, i)).reverse().toString();
                String secondToken = new StringBuffer(word.substring(i, j)).reverse().toString();
                String thirdToken = new StringBuffer(word.substring(j)).reverse().toString();

                reversedWords.add(firstToken + secondToken + thirdToken);
            }
        }

        reversedWords.sort(String::compareToIgnoreCase);

        bw.write(reversedWords.get(0));
        bw.flush();
        bw.close();
        br.close();
    }
}
