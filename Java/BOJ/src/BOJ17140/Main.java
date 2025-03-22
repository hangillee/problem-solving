package BOJ17140;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import org.jetbrains.annotations.NotNull;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[][] A = new int[101][101];

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int row = 3;
        int col = 3;
        int result = -1;
        for (int i = 0; i < 100; i++) {
            if (A[r-1][c-1] == k) { // 주어진 r, c 인덱스는 1부터 시작하므로 배열 인덱스에 맞춰 -1
                result = i;
                break;
            }
            if (row >= col) {
                col = R(row, col);
            } else {
                row = C(row, col);
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    static int R(int rowCount, int colCount) {
        int[][] temp = new int[101][101];
        int maxColCount = 0;

        for (int i = 0; i < rowCount; i++) {
            Map<Integer, Integer> counter = new HashMap<>(); // 각 행의 수 등장 횟수 계산을 위한 Map
            for (int j = 0; j < colCount; j++) {
                if (A[i][j] == 0) { // 0은 정렬 대상에서 제외
                    continue;
                }
                counter.merge(A[i][j], 1, Integer::sum); // A[i][j]의 값이 Map에 없으면 1, 있으면 +1
            }

            List<Number> numbers = new LinkedList<>();
            for (Integer num : counter.keySet()) {
                numbers.add(new Number(num, counter.get(num)));
            }
            Collections.sort(numbers); // 재정의한 Comparable 기준으로 Number 객체 정렬
            maxColCount = Math.max(maxColCount, numbers.size() * 2); // 정렬 후 열의 길이는 리스트 2배 (수, 등장 횟수)

            for (int j = 0; j < numbers.size(); j++) {
                if (j >= 50) { // 한 행의 길이는 100을 넘지 못한다.
                    break;
                }
                Number number = numbers.get(j);
                temp[i][j * 2] = number.value;
                temp[i][j * 2 + 1] = number.count;
            }
        }
        A = temp;

        return Math.min(99, maxColCount); // 99가 각 행의 최대 길이 인덱스
    }

    static int C(int rowCount, int colCount) {
        int[][] temp = new int[101][101];
        int maxRowCount = 0;

        for (int i = 0; i < colCount; i++) {
            Map<Integer, Integer> counter = new HashMap<>(); // 각 열의 수 등장 횟수 계산을 위한 Map
            for (int j = 0; j < rowCount; j++) {
                if (A[j][i] == 0) { // 0은 정렬 대상에서 제외
                    continue;
                }
                counter.merge(A[j][i], 1, Integer::sum); // A[j][i]의 값이 Map에 없으면 1, 있으면 +1
            }

            List<Number> numbers = new LinkedList<>();
            for (Integer num : counter.keySet()) {
                numbers.add(new Number(num, counter.get(num)));
            }
            Collections.sort(numbers); // 재정의한 Comparable 기준으로 Number 객체 정렬
            maxRowCount = Math.max(maxRowCount, numbers.size() * 2); // 정렬 후 행의 길이는 리스트 2배 (수, 등장 횟수)

            for (int j = 0; j < numbers.size(); j++) {
                if (j >= 50) { // 한 열의 길이는 100을 넘지 못한다.
                    break;
                }
                Number number = numbers.get(j);
                temp[j * 2][i] = number.value;
                temp[j * 2 + 1][i] = number.count;
            }
        }
        A = temp;

        return Math.min(99, maxRowCount); // 99가 각 열의 최대 길이 인덱스
    }

    private static class Number implements Comparable<Number> {
        int value;
        int count;

        public Number(int value, int count) {
            this.value = value;
            this.count = count;
        }

        @Override
        public int compareTo(@NotNull Number o) {
            if (this.count == o.count) { // 두 수의 등장 횟수가 같으면
                return this.value - o.value; // 수의 대소 비교
            }
            return this.count - o.count; // 그렇지 않다면 등장 횟수 대소 비교
        }
    }
}
