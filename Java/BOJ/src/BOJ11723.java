import java.io.*;
import java.util.StringTokenizer;

public class BOJ11723 {
    static int set = 0;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            if(command.equals("add")) {
                add(num);
            } else if(command.equals("remove")) {
                remove(num);
            } else if(command.equals("check")){
                check(num);
            } else if(command.equals("toggle")){
                toggle(num);
            } else if(command.equals("all")){
                all();
            } else if(command.equals("empty")){
                empty();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void add(int num) {
        set |= (1 << num);
    }

    static void remove(int num) {
        set &= ~(1 << num);
    }

    static void check(int num) throws IOException {
        if((set & (1 << num)) == (1 << num)) {
            bw.write("1\n");
        } else {
            bw.write("0\n");
        }
    }

    static void toggle(int num) {
        if((set & (1 << num)) == (1 << num)) {
            set &= ~(1 << num);
        } else {
            set |= (1 << num);
        }
    }

    static void all() {
        set = (1 << 21) - 1;
    }

    static void empty() {
        set = 0;
    }
}
