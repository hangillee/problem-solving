package BOJ1302;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    private static final Set<String> titles = new HashSet<>();
    private static final Map<String, Integer> sales = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<String> soldBooks = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            soldBooks.add(br.readLine());
        }
        titles.addAll(soldBooks);

        for (String title : soldBooks) {
            sales.merge(title, 1, Integer::sum);
        }

        int maxSales = 0;
        for (int value : sales.values()) {
            maxSales = Math.max(maxSales, value);
        }

        List<String> topSales = new ArrayList<>();
        for (String title : titles) {
            if (sales.get(title) == maxSales) {
                topSales.add(title);
            }
        }

        Collections.sort(topSales);
        bw.write(topSales.get(0));
        bw.flush();
        bw.close();
        br.close();
    }
}
