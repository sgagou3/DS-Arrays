package tree;

import java.util.Arrays;

public class BinaryTree {
	private int size;
	private int[] data;

	public BinaryTree() {
		size = 0;
		data = new int[size];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getDepth(int i) {
		if (i > size - 1) {
			throw new UnsupportedOperationException("Invalid index");
		}
		return (int) (Math.log(i) / Math.log(2));
	}

	public int getHeight(int i) {
		if (i > size - 1) {
			throw new UnsupportedOperationException("Invalid index");
		}
		return getDepth(size - 1) - getDepth(i);
	}

	public int getTreeHeight() {
		return getDepth(size - 1);
	}

	public String bfs() {
		int ret[] = new int[size];
		int ptr = 0;
		for (int i = 0; i < size; i++) {
			if (data[i] != 0) {
				ret[ptr++] = data[i];
			}
		}
		return Arrays.toString(ret);
	}
}
