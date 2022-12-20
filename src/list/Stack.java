package list;

import java.util.Arrays;

public class Stack {
	private int size;
	private int[] data;

	public Stack() {
		size = 0;
		data = new int[size];
	}

	public void add(int t) {
		data = Arrays.copyOf(data, ++size);
		data[size - 1] = t;
	}

	public void remove() {
		data = Arrays.copyOf(data, --size);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getHead() {
		return data[0];
	}

	public int getTail() {
		return data[size - 1];
	}

	public String toString() {
		return Arrays.toString(data);
	}
}
