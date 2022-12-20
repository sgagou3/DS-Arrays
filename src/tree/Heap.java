package tree;

import java.util.Arrays;

public class Heap {
	private int size;
	private int[] data;

	public Heap() {
		size = 0;
		data = new int[size];
	}

	public void add(int t) {
		data = Arrays.copyOf(data, ++size);
		data[size - 1] = t;
		siftUp(size - 1);
	}

	public void siftUp(int i) {
		while (data[i] < data[i / 2]) {
			data[i] ^= data[i / 2];
			data[i / 2] ^= data[i];
			data[i] ^= data[i / 2];
			i /= 2;
		}
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
		return Arrays.toString(data);
	}
}
