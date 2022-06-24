import java.io.*;

public class BOJ1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String binaryNumber = br.readLine();
        int length = binaryNumber.length();
        String[] binary;
        if(length % 3 != 0) {
            binary = new String[(length / 3) + 1];
        } else {
            binary = new String[length / 3];
        }
        int position = 0;

        for(int i = 0; i < binary.length; i++) {
            if(length % 3 > 0) {
                binary[i] = binaryNumber.substring(position, length % 3);
                position = length % 3;
                length -= length % 3;
            } else {
                binary[i] = binaryNumber.substring(position, position+3);
                position += 3;
            }
        }

        for(int i = 0; i < binary.length; i++) {
            int sum = 0;
            for(int j = 0; j < binary[i].length(); j++) {
                sum += (binary[i].charAt((binary[i].length()-1)-j) - '0') * Math.pow(2, j);
            }
            sb.append(sum);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
