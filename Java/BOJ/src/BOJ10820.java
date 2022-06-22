import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while((str = br.readLine()) != null) {
            System.out.println(checkStr(str));
        }
    }
    public static String checkStr(String str) {
        String answer;
        int lowerCase = 0;
        int upperCase = 0;
        int number = 0;
        int blank = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                lowerCase++;
            } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                upperCase++;
            } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                number++;
            } else if (str.charAt(i) == ' ') {
                blank++;
            }
        }

        answer = lowerCase + " " + upperCase + " " + number + " " + blank;
        return answer;
    }
}
