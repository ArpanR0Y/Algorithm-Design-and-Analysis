/**
 * A Heap implementation class
 */
public class MinHeap {
	
	CompareInt[] heap;
	int size;

	/**
	 * Constructs a new heap with maximum capacity n
	 * Remember to index your heap at 1 instead of 0!
	 * @param n the maximum number of elements allowed in the heap
	 */
	public MinHeap(int n) {
		heap = new CompareInt[n+1];
		size = 0;
	}
	
	/**
	 * Adds an element to the heap
	 * 
	 * @param val the value to be added to the heap
	 */
	public void add(CompareInt val) {
    size++;
    heap[size] = val;
    swim(size);
	}

  public void swim(int k) {
    while (k > 1 && heap[k/2].compareTo(heap[k]) > 0) {
      CompareInt temp = heap[k];
      heap[k] = heap[k/2];
      heap[k/2] = temp;
      k = k/2;
    }
  }
	
	/**
	 * Extracts the smallest element from the heap
	 */
	public CompareInt extractMin() {
    CompareInt min = heap[1];
    // Bring the latest element to the root
    heap[1] = heap[size];
    size--;

    // rebuild the heap
    sink(1);
    return min;
	}

  private void sink(int k) {
    int leftChild = k*2;
    int rightChild = k*2+1;

    while (leftChild <= size) {
      if(leftChild == size) {
        if(heap[leftChild].compareTo(heap[k])<0) {
          swap(heap, k, leftChild);
        }else {
          break;
        }
      } else {
        if(heap[leftChild].compareTo(heap[rightChild])<0) {
          if(heap[k].compareTo(heap[leftChild])<0) {
            break;
          } else {
            swap(heap, k, leftChild);
            k = leftChild;
            leftChild = k*2;
            rightChild = k*2+1;
          }
        } else {
          if (heap[k].compareTo(heap[rightChild]) < 0) {
            break;
          } else {
            swap(heap, k, rightChild);
            k = rightChild;
            leftChild = k * 2;
            rightChild = k * 2 + 1;
          }

        }
      }
    }// end while loop

  }

  public static void swap(CompareInt[] arr, int i, int j) {
    CompareInt tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}
