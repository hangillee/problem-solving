import java.io.*;
import java.util.StringTokenizer;

public class BOJ11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstArrSize = Integer.parseInt(st.nextToken());
        int secondArrSize = Integer.parseInt(st.nextToken());

        int[] firstArr = new int[firstArrSize];
        int[] secondArr = new int[secondArrSize];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < firstArrSize; i++) {
            firstArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < secondArrSize; i++) {
            secondArr[i] = Integer.parseInt(st.nextToken());
        }

        int firstPointer = 0;
        int secondPointer = 0;
        StringBuilder sb = new StringBuilder();

        while(firstPointer < firstArrSize && secondPointer < secondArrSize) {
            if(firstArr[firstPointer] < secondArr[secondPointer]) {
                sb.append(firstArr[firstPointer] + " ");
                firstPointer++;
            } else if (firstArr[firstPointer] > secondArr[secondPointer]) {
                sb.append(secondArr[secondPointer] + " ");
                secondPointer++;
            } else {
                sb.append(firstArr[firstPointer] + " ");
                sb.append(secondArr[secondPointer] + " ");
                firstPointer++;
                secondPointer++;
            }
        }

        if(firstPointer == firstArrSize) {
            while(secondPointer < secondArrSize) {
                sb.append(secondArr[secondPointer] + " ");
                secondPointer++;
            }
        } else if(secondPointer == secondArrSize) {
            while(firstPointer < firstArrSize) {
                sb.append(firstArr[firstPointer] + " ");
                firstPointer++;
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
