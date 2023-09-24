import java.io.*;

public class BOJ5639 {
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BSTNode root = new BSTNode(Integer.parseInt(br.readLine()));
        while (true) {
            String input = br.readLine();
            if(input == null || input.equals("")) break;
            root.insert(Integer.parseInt(input));
        }

        postOrder(root);
        bw.flush();
        bw.close();
        br.close();
    }

    static void postOrder(BSTNode node) throws IOException {
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        bw.write(node.data + "\n");
    }
}

class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data) {
        this.data = data;
    }

    void insert(int num) {
        if(num < this.data) {
            if(this.left == null) {
                this.left = new BSTNode(num);
            } else {
                this.left.insert(num);
            }
        } else {
            if(this.right == null) {
                this.right = new BSTNode(num);
            } else {
                this.right.insert(num);
            }
        }
    }
}
