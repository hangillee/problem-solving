import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Round817C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<ArrayList<String>> players = new ArrayList<>();
            for(int j = 0; j < 3; j++) {
                players.add(j, new ArrayList<>());
                StringTokenizer st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()) {
                    players.get(j).add(st.nextToken());
                }
            }

            int playerA = 0;
            int countA = 0;
            int playerB = 0;
            int countB = 0;
            int playerC = 0;
            int countC = 0;
            for(int j = 0; j < n; j++) {
                if(players.get(0).contains(players.get(1).get(j)) || players.get(0).contains(players.get(2).get(j))) {
                    countA++;
                } else {
                    playerA += 3;
                }

                if(players.get(1).contains(players.get(0).get(j)) || players.get(1).contains(players.get(2).get(j))) {
                    countB++;
                } else {
                    playerB += 3;
                }

                if(players.get(2).contains(players.get(0).get(j)) || players.get(2).contains(players.get(1).get(j))) {
                    countC++;
                } else {
                    playerC += 3;
                }
            }

            if(countA != countB && countB != countC) {
                playerA += countA;
                playerB += countB;
                playerC += countC;
            }

            bw.write(playerA + " " + playerB + " " + playerC + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
