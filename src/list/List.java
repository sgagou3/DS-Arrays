package list;
import java.util.Arrays;

public class List {
	private int size;
	private int[] data;

	public List() {
		size = 0;
		data = new int[size];
	}

	public void add(int t) {
		data = Arrays.copyOf(data, ++size);
		data[size - 1] = t;
	}

	public void add(int t, int i) {
		if (i < 0 || i > size - 1) {
			throw new UnsupportedOperationException("Invalid index");
		}
		data = Arrays.copyOf(data, size++);
		System.arraycopy(data, i, data, i + 1, size - i + 1);
		data[i] = t;
	}

	public void remove(int i) {
		System.arraycopy(data, i + 1, data, i, size - i - 1);
		data = Arrays.copyOf(data, --size);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public String toString() {
		return Arrays.toString(data);
	}
}