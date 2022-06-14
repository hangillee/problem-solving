import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int sum = 0;

        for(int i = 0; i < X; i++) {
            sum += months[i];
        }
        sum += Y;

        switch(sum % 7){
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
        }

    }
}
