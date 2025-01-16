package BOJ30804;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        int length = getLength(fruits);

        bw.write(length + "");
        bw.flush();
        br.close();
        bw.close();
    }

    static int getLength(final int[] fruits) {
        int[] selectedFruits = new int[10];
        Set<Integer> selectedFruitsCount = new HashSet<>();
        int front = 0;
        int rear = 0;
        int length = 0;
        int maxLength = 0;

        while (rear < fruits.length) {
            selectedFruits[fruits[rear]] += 1;
            selectedFruitsCount.add(fruits[rear]);
            rear++;
            length++;

            if (selectedFruitsCount.size() > 2) {
                while (selectedFruitsCount.size() > 2) {
                    selectedFruits[fruits[front]] -= 1;
                    if (selectedFruits[fruits[front]] == 0) {
                        selectedFruitsCount.remove(fruits[front]);
                    }
                    front++;
                    length--;
                }
            }
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}
