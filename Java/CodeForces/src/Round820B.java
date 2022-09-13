import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Round820B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] alphabets = new String[27];
        char alphabet = 97;
        for(int i = 1; i < alphabets.length; i++) {
            alphabets[i] = String.valueOf(alphabet);
            alphabet++;
        }

        int q = Integer.parseInt(br.readLine());
        for(int i = 0; i < q; i++) {
            int n = Integer.parseInt(br.readLine());
            String decodeTarget = br.readLine();
            Deque<String> decodeList = new ArrayDeque<>();

            for(int j = 0; j < decodeTarget.length(); j++) {
                if(decodeList.size() > 0 && decodeList.peekLast().equals("0")) {
                    if(decodeTarget.charAt(j) == '0') {
                        String units = decodeList.pollLast();
                        String tens = decodeList.pollLast();
                        decodeList.add(tens + units);
                    } else {
                        decodeList.pollLast();
                        String units = decodeList.pollLast();
                        String tens = decodeList.pollLast();
                        decodeList.add(tens + units);
                        decodeList.add(String.valueOf(decodeTarget.charAt(j)));
                    }
                } else {
                    decodeList.add(String.valueOf(decodeTarget.charAt(j)));
                }
            }

            if(decodeList.peekLast().equals("0")) {
                decodeList.pollLast();
                String units = decodeList.pollLast();
                String tens = decodeList.pollLast();
                decodeList.add(tens + units);
            }

            StringBuilder sb = new StringBuilder();
            for(String unit : decodeList) {
                sb.append(alphabets[Integer.parseInt(unit)]);
            }

            bw.write(sb + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
