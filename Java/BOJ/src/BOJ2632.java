import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ2632 {
    static ArrayList<Integer> prefixA, prefixB;
    static int[] pizzaA;
    static int[] pizzaB;
    static boolean[] packedPieces;
    static int orderPizza;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        orderPizza = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        pizzaA = new int[M];
        prefixA = new ArrayList<>();
        for(int i = 0; i < M; i++) {
            pizzaA[i] = Integer.parseInt(br.readLine());
        }

        pizzaB = new int[N];
        prefixB = new ArrayList<>();
        for(int j = 0; j < N; j++) {
            pizzaB[j] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < M; i++) {
            packedPieces = new boolean[M];
            packedPieces[i] = true;
            getPrefixSum(pizzaA[i], i, i+1, prefixA, pizzaA);
        }

        for(int i = 0; i < N; i++) {
            packedPieces = new boolean[N];
            packedPieces[i] = true;
            getPrefixSum(pizzaB[i], i, i+1, prefixB, pizzaB);
        }

        prefixA.add(0);
        prefixB.add(0);
        Collections.sort(prefixA);
        Collections.sort(prefixB);

        bw.write(String.valueOf(getCount()));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void getPrefixSum(int sum, int startIdx, int currentIdx, ArrayList<Integer> prefix, int[] pizza) {
        if(currentIdx == pizza.length) {
            currentIdx = 0;
        }
        prefix.add(sum);
        if(!packedPieces[currentIdx] && currentIdx != startIdx - 1 && sum <= orderPizza) {
            packedPieces[currentIdx] = true;
            getPrefixSum(sum+pizza[currentIdx], startIdx, currentIdx+1, prefix, pizza);
        } else {
            return;
        }
    }

    public static int getCount() {
        int leftPointer = 0;
        int rightPointer = prefixB.size() - 1;
        int result = 0;

        while(leftPointer < prefixA.size() && rightPointer >= 0) {
            int leftValue = prefixA.get(leftPointer);
            int rightValue = prefixB.get(rightPointer);

            if(leftValue + rightValue == orderPizza) {
                int leftCnt = 0;
                int rightCnt = 0;
                while(leftPointer < prefixA.size() && prefixA.get(leftPointer) == leftValue){
                    leftPointer++;
                    leftCnt++;
                }
                while(rightPointer >= 0 && prefixB.get(rightPointer) == rightValue) {
                    rightPointer--;
                    rightCnt++;
                }
                result += leftCnt * rightCnt;
            } else if(leftValue + rightValue < orderPizza) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return result;
    }
}
