package Trees;

import Trees.BST.Node;

public class AVL {
    public static int height(Node node) {
        if (node == null) {
            return -1;
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
        return rotate(node);
    }

    public static Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // left heavy case
            if (height(node.left.left) - height(node.left.right) > 0) {
                node = rightRotate(node);
                return node;
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                node = rightRotate(node);
                return node;
            }
        }
        if (height(node.left) - height(node.right) < -1) {
            // right heavy case
            if (height(node.right.left) - height(node.right.right) < 0) {
                node = leftRotate(node);
                return node;
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                node = leftRotate(node);
                return node;
            }
        }
        return node;

    }

    public static Node rightRotate(Node c) {
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return p;

    }

    public static Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        return c;
    }
}
