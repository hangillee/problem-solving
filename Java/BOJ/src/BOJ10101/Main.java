package BOJ10101;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[] angles = new int[3];
        for (int i = 0; i < angles.length; i++) {
            angles[i] = Integer.parseInt(reader.readLine());
        }

        writer.write(getType(angles));
        writer.flush();
    }

    public static String getType(int[] angles) {
        int angleSum = 0;
        for (int angle : angles) {
            angleSum += angle;
        }

        if (angleSum != 180) {
            return "Error";
        }
        if ((angles[0] == angles[1]) && (angles[1] == angles[2])) {
            return "Equilateral";
        }
        if ((angles[0] != angles[1]) && (angles[1] != angles[2]) && (angles[0] != angles[2])) {
            return "Scalene";
        }
        return "Isosceles";
    }
}
