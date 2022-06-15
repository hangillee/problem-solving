import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());

        for(int i = 1; i < line; i++) {
            for(int j = 0; j < line - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 1; k++) {
                System.out.print("*");
                for(int l = 0; l < i*2 - 3; l++) {
                    System.out.print(" ");
                    if(++l >= i*2 - 3) {
                        System.out.print("*");
                    }
                    l--;
                }
            }
            System.out.println();
        }
        for(int i = 0; i < line * 2 - 1; i++) {
            System.out.print("*");
        }
    }
}
