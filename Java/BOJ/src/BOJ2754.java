import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader strBr = new BufferedReader(new InputStreamReader(System.in));
        String myGrade = strBr.readLine();
        Double myPoint = 0.0;

        switch(myGrade) {
            case "A+":
                myPoint = 4.3;
                break;
            case "A0":
                myPoint = 4.0;
                break;
            case "A-":
                myPoint = 3.7;
                break;
            case "B+":
                myPoint = 3.3;
                break;
            case "B0":
                myPoint = 3.0;
                break;
            case "B-":
                myPoint = 2.7;
                break;
            case "C+":
                myPoint = 2.3;
                break;
            case "C0":
                myPoint = 2.0;
                break;
            case "C-":
                myPoint = 1.7;
                break;
            case "D+":
                myPoint = 1.3;
                break;
            case "D0":
                myPoint = 1.0;
                break;
            case "D-":
                myPoint = 0.7;
                break;
            case "F":
                myPoint = 0.0;
                break;
        }

        System.out.println(myPoint);
    }
}
