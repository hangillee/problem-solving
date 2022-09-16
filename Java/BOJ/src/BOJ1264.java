import java.io.*;

public class BOJ1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] vowelsArr = { 'a', 'e', 'i', 'o', 'u' };

        while(true) {
            String sentence = br.readLine();
            if(sentence.equals("#")) {
                break;
            }

            int vowelsCount = 0;
            for(int i = 0; i < sentence.length(); i++) {
                for(int j = 0; j < vowelsArr.length; j++) {
                    if(sentence.charAt(i) == vowelsArr[j] || sentence.charAt(i) == vowelsArr[j] - 32) {
                        vowelsCount++;
                    }
                }
            }

            bw.write(vowelsCount + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
