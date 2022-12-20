package graph;

import java.util.Arrays;

public class DirectedGraph {
	private int size;
	private int[][] data;

	public DirectedGraph() {
		size = 0;
		data = new int[size][size];
	}

	public void addNode(int t) {
		if (t < size) {
			return;
		} else if (t > size - 1) {
			size++;
			data = Arrays.copyOf(data, t + 1);
			for (int i = 0; i < size; i++) {
				data[i] = Arrays.copyOf(data[i], t + 1);
			}
		}
	}

	public void addEdge(int a, int b) {
		if (a > size - 1 || b > size - 1 || a < 0 || b < 0) {
			throw new UnsupportedOperationException("Node doesn't exist");
		}
		data[a][b] = 1;
	}

	public void addEdge(int a, int b, int w) {
		if (a > size - 1 || b > size - 1 || a < 0 || b < 0) {
			throw new UnsupportedOperationException("Node doesn't exist");
		}
		data[a][b] = w;
	}

	public void removeNode(int t) {
		if (t == size - 1) {
			data = Arrays.copyOf(data, size - 1);
			for (int i = 0; i < size + 1; i++) {
				data[i] = Arrays.copyOf(data[i], size - 1);
			}
			size--;
		} else {
			for (int i = 0; i < size; i++) {
				data[i][t] = 0;
				data[t][i] = 0;
			}
		}
	}

	public void removeEdge(int a, int b) {
		if (a > size - 1 || b > size - 1 || a < 0 || b < 0) {
			throw new UnsupportedOperationException("Node doesn't exist");
		}
		data[a][b] = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public String topoSort() {
		return "";
	}
}
