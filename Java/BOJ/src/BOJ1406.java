import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class BOJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Character> strList = new LinkedList<>();
        String str = br.readLine();
        for(int i = 0; i < str.length(); i++) {
            strList.add(str.charAt(i));
        }

        ListIterator<Character> listIterator = strList.listIterator();
        while(listIterator.hasNext()){
            listIterator.next();
        }

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++) {
            String commandLine = br.readLine();
            char command = commandLine.charAt(0);

            switch(command) {
                case 'L':
                    if(listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    break;
                case 'D':
                    if(listIterator.hasNext()) {
                        listIterator.next();
                    }
                    break;
                case 'B':
                    if(listIterator.hasPrevious()) {
                        listIterator.previous();
                        listIterator.remove();
                    }
                    break;
                case 'P':
                    char word = commandLine.charAt(2);
                    listIterator.add(word);
                    break;
                default:
                    break;
            }
        }

        for(Character word : strList) {
            bw.write(word);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
