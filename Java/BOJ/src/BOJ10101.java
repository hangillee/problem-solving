import java.io.*;

public class BOJ10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int firstAngle = Integer.parseInt(br.readLine());
        int secondAngle = Integer.parseInt(br.readLine());
        int thirdAngle = Integer.parseInt(br.readLine());

        if(firstAngle == 60 && firstAngle == secondAngle && secondAngle == thirdAngle) {
            bw.write("Equilateral");
        } else if(firstAngle + secondAngle + thirdAngle == 180 && firstAngle == secondAngle || firstAngle == thirdAngle || secondAngle == thirdAngle) {
            bw.write("Isosceles");
        } else if(firstAngle + secondAngle + thirdAngle == 180) {
            bw.write("Scalene");
        } else if (firstAngle + secondAngle + thirdAngle != 180) {
            bw.write("Error");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
