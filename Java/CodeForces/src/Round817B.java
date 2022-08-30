import java.io.*;

public class Round817B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            char[][] grid = new char[2][n];
            for(int j = 0; j < 2; j++) {
                String colours = br.readLine();
                grid[j] = colours.toCharArray();
            }

            boolean isSame = true;
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[0][j] != grid[1][j]) {
                    if(!((grid[0][j] == 'G' || grid[0][j] == 'B') && (grid[1][j] == 'G' || grid[1][j] == 'B'))) {
                        isSame = false;
                        break;
                    }
                }
            }

            if(isSame) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
