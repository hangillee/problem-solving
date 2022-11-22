import java.io.*;

public class BOJ10026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[][] areaRGB = new char[N][N];
        char[][] areaRB = new char[N][N];
        boolean[][] isVisitedRGB = new boolean[N][N];
        boolean[][] isVisitedRB = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String row = br.readLine();
            for(int j = 0; j < N; j++) {
                if(row.charAt(j) != 'G') {
                    areaRGB[i][j] = row.charAt(j);
                    areaRB[i][j] = row.charAt(j);
                } else {
                    areaRGB[i][j] = row.charAt(j);
                    areaRB[i][j] = 'R';
                }
            }
        }

        int RGBcount = 0;
        int RBCount = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!isVisitedRGB[i][j]) {
                    dfs(i, j, areaRGB, isVisitedRGB);
                    RGBcount++;
                }
                if(!isVisitedRB[i][j]) {
                    dfs(i, j, areaRB, isVisitedRB);
                    RBCount++;
                }
            }
        }

        bw.write(RGBcount + " " + RBCount);
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int row, int col, char[][] area, boolean[][] isVisited) {
        char currentColor = area[row][col];
        isVisited[row][col] = true;
        if(row+1 < area.length && !isVisited[row+1][col] && area[row+1][col] == currentColor){
            dfs(row+1, col, area, isVisited);
        }
        if(row-1 >= 0 && !isVisited[row-1][col] && area[row-1][col] == currentColor) {
            dfs(row-1, col, area, isVisited);
        }
        if(col+1 < area.length && !isVisited[row][col+1] && area[row][col+1] == currentColor) {
            dfs(row, col+1, area, isVisited);
        }
        if(col-1 >= 0 && !isVisited[row][col-1] && area[row][col-1] == currentColor) {
            dfs(row, col-1, area, isVisited);
        }
    }
}
