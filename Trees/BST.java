package Trees;

public class BST {
    static class Node {
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.height = 1;
            this.left = this.right = null;
        }
    }

    public static int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

}
