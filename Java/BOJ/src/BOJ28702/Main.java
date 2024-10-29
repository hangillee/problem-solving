package BOJ28702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] values = new String[3];

        for (int i = 0; i < values.length; i++) {
            values[i] = br.readLine();
        }

        int number = -1;
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (isNumeric(values[i])) {
                number = Integer.parseInt(values[i]);
                index = i;
            }
        }

        number = number + 3 - index;

        if (number % 3 == 0 && number % 5 == 0) {
            bw.write("FizzBuzz");
        } else if (number % 3 == 0) {
            bw.write("Fizz");
        } else if (number % 5 == 0) {
            bw.write("Buzz");
        } else {
            bw.write(String.valueOf(number));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isNumeric(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
