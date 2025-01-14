package BOJ30804;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        Map<Integer, Integer> selectedFruits = new HashMap<>();
        Set<Integer> selectedFruitsCount = new HashSet<>();
        int front = 0;
        int rear = 0;
        int length = 0;
        int maxLength = 0;

        while (rear < fruits.length) {
            selectedFruits.put(fruits[rear], selectedFruits.getOrDefault(fruits[rear], 0) + 1);
            selectedFruitsCount.add(fruits[rear]);
            rear++;
            length++;

            if (selectedFruitsCount.size() > 2) {
                while (selectedFruitsCount.size() > 2) {
                    selectedFruits.put(fruits[front], selectedFruits.get(fruits[front]) - 1);
                    if (selectedFruits.get(fruits[front]) == 0) {
                        selectedFruitsCount.remove(fruits[front]);
                        selectedFruits.remove(fruits[front]);
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
