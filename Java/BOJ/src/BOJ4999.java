import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader strBr = new BufferedReader(new InputStreamReader(System.in));
        String mySound = strBr.readLine();
        String doctorSound = strBr.readLine();

        if(mySound.length() >= doctorSound.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
