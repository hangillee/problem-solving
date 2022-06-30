import java.io.*;
import java.util.StringTokenizer;

public class BOJ1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nodeNum = Integer.parseInt(br.readLine());
        Tree tree = new Tree();

        for(int i = 0; i < nodeNum; i++) {
            String data = br.readLine();
            tree.createNode(data.charAt(0), data.charAt(2), data.charAt(4));
        }

        tree.preorder(tree.root);
        bw.write("\n");
        bw.flush();
        tree.inorder(tree.root);
        bw.write("\n");
        bw.flush();
        tree.postorder(tree.root);

        bw.close();
        br.close();
    }
}

class Tree {
    TreeNode root;

    public void createNode(char data, char leftData, char rightData) {
        if(root == null) {
            root = new TreeNode(data);
            if(leftData != '.') {
                TreeNode leftNode = new TreeNode(leftData);
                root.addLeft(leftNode);
            }
            if(rightData != '.') {
                TreeNode rightNode = new TreeNode(rightData);
                root.addRight(rightNode);
            }
        } else {
            addNode(root, data, leftData, rightData);
        }
    }

    public void addNode(TreeNode root, char data, char leftData, char rightData) {
        if(root == null) {
            return;
        } else if(root.data == data) {
            if(leftData != '.') {
                TreeNode leftNode = new TreeNode(leftData);
                root.addLeft(leftNode);
            }
            if(rightData != '.') {
                TreeNode rightNode = new TreeNode(rightData);
                root.addRight(rightNode);
            }
        } else {
            addNode(root.left, data, leftData, rightData);
            addNode(root.right, data, leftData, rightData);
        }
    }
    public void preorder(TreeNode node) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(node.data);
        bw.flush();
        if(node.left != null) {
            preorder(node.left);
        }
        if (node.right != null) {
            preorder(node.right);
        }
    }
    public void inorder(TreeNode node) throws IOException {
        if(node.left != null) {
            inorder(node.left);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(node.data);
        bw.flush();
        if (node.right != null) {
            inorder(node.right);
        }
    }
    public void postorder(TreeNode node) throws IOException {
        if(node.left != null) {
            postorder(node.left);
        }
        if (node.right != null) {
            postorder(node.right);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(node.data);
        bw.flush();
    }
}
class TreeNode {
    char data;
    TreeNode left;
    TreeNode right;
    public TreeNode(char data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void addLeft(TreeNode node) {
        this.left = node;
    }

    public void addRight(TreeNode node) {
        this.right = node;
    }
}