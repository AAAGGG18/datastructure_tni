import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import javax.crypto.spec.DESedeKeySpec;

public class Sorting {
	private int[] array;

	public Sorting(int[] array) {
		this.array = array;
	}

	public void PrintSortedData() {
		for (int arr : array) {
			System.out.print(arr + " ");
		}
	}

	public void bubbleSort() {
		for (int i = 0; i < array.length; i++) {
			boolean is_swapped = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j]; // KEEP THE ELEMENT AT current_position IN A TEMPORARY PLACE
					array[j] = array[j + 1]; // MOVE THE ELEMENT AT THE NEXT POSITION INTO current_position
					array[j + 1] = temp; // PUT KEPT ELEMENT INTO NEXT POSITION
					is_swapped = true;
				}
			} // END Inner-loop
			if (!is_swapped) {
				break;
			}
		} // END outer-loop
	}

	public void selectionSort() {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;

		}
	}

	public void insertionSort() {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int walker_index = i - 1;

			while (walker_index >= 0 && array[walker_index] > key) {
				array[walker_index + 1] = array[walker_index];
				walker_index--;
			}
			array[walker_index + 1] = key;
		}
	}

	public void quicksort() {
		Deque<Integer> stacks = new ArrayDeque<Integer>();
		stacks.push(array.length-1);
		stacks.push(0);
		
		while (!stacks.isEmpty()) {
			int low = stacks.pop();
			int high = stacks.pop();
			
			if (high - low < 1) {
				continue;
			}
			
			int j = partition(low,high);
			stacks.push(high);
			stacks.push(j+1);
			stacks.push(j);
			stacks.push(low);
		}
		
	}

	private int partition(int low, int high) {
		int pivot = array[low];
		int i = low;
		int j = high;
		while (true) {
			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}

			if (i >= j) {
				break;
			}
			int temp = array[i]; // SWAPING
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;

		}
		return j;
	}
}