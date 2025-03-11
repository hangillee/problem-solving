package BOJ3190;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final Deque<List<Integer>> snake = new LinkedList<>();
    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};
    private static int[][] board;
    private static Map<Integer, String> commands;

    public static void main(String[] args) throws IOException {
        appleSetting();
        commandSetting();

        int time = 0;
        int currentX = 0;
        int currentY = 0;
        int currentDirection = 0;
        snake.add(List.of(currentY, currentX));

        while (true) {
            if (commands.containsKey(time)) {
                String direction = commands.get(time);
                if (direction.equals("L")) {
                    if (currentDirection - 1 < 0) {
                       currentDirection = 3;
                    } else {
                        currentDirection--;
                    }
                } else {
                    if (currentDirection + 1 > 3) {
                        currentDirection = 0;
                    } else {
                        currentDirection++;
                    }
                }
            }
            int nextY = currentY + dy[currentDirection];
            int nextX = currentX + dx[currentDirection];
            if (nextY == board.length || nextY < 0 || nextX == board.length || nextX < 0 || board[nextY][nextX] == 1) {
                time++;
                break;
            }
            if (board[nextY][nextX] == 2) {
                board[nextY][nextX] = 1;
                currentY = nextY;
                currentX = nextX;
                snake.offerFirst(List.of(nextY, nextX));
                time++;
                continue;
            }
            board[nextY][nextX] = 1;
            currentY = nextY;
            currentX = nextX;
            snake.offerFirst(List.of(nextY, nextX));
            List<Integer> coord = snake.pollLast();
            board[coord.get(0)][coord.get(1)] = 0;
            time++;
        }

        bw.write(time + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static void appleSetting() throws IOException {
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        board = new int[N][N];

        for (int i = 0; i < K; i++) {
            StringTokenizer command = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(command.nextToken());
            int col = Integer.parseInt(command.nextToken());
            board[row-1][col-1] = 2;
        }
    }

    private static void commandSetting() throws IOException {
        commands = new HashMap<>();
        int L = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++) {
            StringTokenizer command = new StringTokenizer(br.readLine());
            int seconds = Integer.parseInt(command.nextToken());
            String direction = command.nextToken();
            commands.put(seconds, direction);
        }
    }
}
