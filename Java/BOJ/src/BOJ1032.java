import java.util.Scanner;

public class BOJ1032 {
    public static void main(String args[]) {
        Scanner myScan = new Scanner(System.in);
        int fileNum = myScan.nextInt();
        char[][] fileName = new char[fileNum][50];
        char[] patternArr;

        for(int i = 0; i < fileNum; i++) {
            fileName[i] = myScan.next().toCharArray();
        }

        patternArr = fileName[0];
        for(int k = 0; k < fileNum; k++) {
            for(int j = 0; j < fileName[0].length; j++){
                if(patternArr[j] != fileName[k][j]) {
                    patternArr[j] = '?';
                }
            }
        }
        System.out.println(patternArr);
    }
}
