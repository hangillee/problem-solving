import java.io.*;

public class BOJ1076 {
    static StringBuilder sb = new StringBuilder();
    static long firstDigits;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < 3; i++) {
            String command = br.readLine();
            calcResistance(i, command);
        }

        bw.write(String.valueOf(firstDigits));
        bw.flush();
        bw.close();
    }

    static void calcResistance(int order, String command) {
        if(order == 0 || order == 1) {
            switch (command) {
                case "black":
                    if(order == 1) {
                        sb.append("0");
                    }
                    break;
                case "brown":
                    sb.append("1");
                    break;
                case "red":
                    sb.append("2");
                    break;
                case "orange":
                    sb.append("3");
                    break;
                case "yellow":
                    sb.append("4");
                    break;
                case "green":
                    sb.append("5");
                    break;
                case "blue":
                    sb.append("6");
                    break;
                case "violet":
                    sb.append("7");
                    break;
                case "grey":
                    sb.append("8");
                    break;
                case "white":
                    sb.append("9");
                    break;
            }
        } else {
            firstDigits = Integer.parseInt(sb.toString());
            switch (command) {
                case "black":
                    break;
                case "brown":
                    firstDigits *= 10;
                    break;
                case "red":
                    firstDigits *= 100;
                    break;
                case "orange":
                    firstDigits *= 1000;
                    break;
                case "yellow":
                    firstDigits *= 10000;
                    break;
                case "green":
                    firstDigits *= 100000;
                    break;
                case "blue":
                    firstDigits *= 1000000;
                    break;
                case "violet":
                    firstDigits *= 10000000;
                    break;
                case "grey":
                    firstDigits *= 100000000;
                    break;
                case "white":
                    firstDigits *= 1000000000;
                    break;
            }
        }
    }
}
