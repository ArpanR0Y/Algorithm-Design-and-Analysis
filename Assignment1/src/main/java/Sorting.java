import java.util.Arrays;

public class Sorting {

	/**
	 * Implement the mergesort function, which should sort the array of
	 * integers in place
	 *
	 * You will probably want to use helper functions here, as described in the lecture recordings
	 * (ex. merge(), a helper mergesort function)
	 * @param arr
	 */
	public static void mergeSort(CompareInt[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	public static CompareInt[] mergeSortedArrays (CompareInt[] arrayOne, CompareInt[] arrayTwo) {
    CompareInt[] mergedArray = new CompareInt[arrayOne.length + arrayTwo.length];

    int arrayOneIndex = 0;
    int arrayTwoIndex = 0;
    int mergedArrayIndex = 0;

    while (arrayOneIndex < arrayOne.length && arrayTwoIndex < arrayTwo.length) {
      if (arrayOne[arrayOneIndex].compareTo(arrayTwo[arrayTwoIndex]) < 0) {
        mergedArray[mergedArrayIndex] = arrayOne[arrayOneIndex];
        arrayOneIndex++;
        mergedArrayIndex++;
      } else {
        mergedArray[mergedArrayIndex] = arrayTwo[arrayTwoIndex];
        arrayTwoIndex++;
        mergedArrayIndex++;
      }
    }
    while (arrayOneIndex < arrayOne.length) {
      mergedArray[mergedArrayIndex++] = arrayOne[arrayOneIndex++];
    }
    while (arrayTwoIndex < arrayTwo.length) {
      mergedArray[mergedArrayIndex++] = arrayTwo[arrayTwoIndex++];
    }
    return mergedArray;
  }

  public static void mergeSort(CompareInt[] array, int lo, int hi) {
    if (hi - lo <= 0) {
      return;
    }

    int mid = (lo + hi) / 2;

    mergeSort(array, lo, mid);
    mergeSort(array, mid + 1, hi);

    CompareInt[] aux = mergeSortedArrays(Arrays.copyOfRange(array, lo, mid + 1), Arrays.copyOfRange(array, mid + 1, hi + 1));

    int j = 0;
    for (int i = lo; i <= hi; i++) {
      array[i] = aux[j++];
    }
  }

	/**
	 * Implement the quickSelect
	 *
	 * Again, you will probably want to use helper functions here
	 * (ex. partition(), a helper quickselect function)
	 */
	public static CompareInt quickSelect(int k, CompareInt[] arr) {
		//TODO
		return null;
	}

}
