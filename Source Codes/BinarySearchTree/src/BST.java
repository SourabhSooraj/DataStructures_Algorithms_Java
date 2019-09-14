
/**Implementation of binary search tree*/
import java.util.Scanner;

class TNode {
	int data;
	TNode left, right;

	public TNode(int x) {
		data = x;
		left = right = null;
	}
}

public class BST {
	TNode root;

	public BST() {
		root = null;
	}

	TNode insert(TNode t, int y) {
		if (t == null) {
			t = new TNode(y);
			return t;
		} else {
			if (y > t.data) {
				t.right = insert(t.right, y);
			} else {
				t.left = insert(t.left, y);
			}
			return t;		//Don't missout on the return t statement after the if and else block both of them share a common return t statement
		}
	}

	void Inorder(TNode root) {
		if (root == null)
			return;
		else {
			Inorder(root.left);
			System.out.print(root.data + " ");
			Inorder(root.right);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		TNode root = null;//Make sure you declare local variable for root
		BST b = new BST();
		System.out.println("Enter the number of elements which you want to enter into the Binary search tree");
		int n = sc.nextInt();
		while (n != 0) {
			System.out.println("Enter the value which you want to enter into the list");
			int x = sc.nextInt();
			root = b.insert(root, x);
			n--;
		}
		b.Inorder(root);
		sc.close();
	}
}
