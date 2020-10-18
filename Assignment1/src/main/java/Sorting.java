import java.util.Arrays;

public class Sorting {

  /**
   * Implement the mergesort function, which should sort the array of integers in place
   * <p>
   * You will probably want to use helper functions here, as described in the lecture recordings
   * (ex. merge(), a helper mergesort function)
   *
   * @param arr
   */
  public static void mergeSort(CompareInt[] arr) {
    mergeSort(arr, 0, arr.length - 1);
  }

  public static CompareInt[] mergeSortedArrays(CompareInt[] arrayOne, CompareInt[] arrayTwo) {
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

    CompareInt[] aux = mergeSortedArrays(Arrays.copyOfRange(array, lo, mid + 1),
        Arrays.copyOfRange(array, mid + 1, hi + 1));

    int j = 0;
    for (int i = lo; i <= hi; i++) {
      array[i] = aux[j++];
    }
  }

  /**
   * Implement the quickSelect
   * <p>
   * Again, you will probably want to use helper functions here (ex. partition(), a helper
   * quickselect function)
   */
  public static CompareInt quickSelect(int k, CompareInt[] arr) {
    return new CompareInt(kthSmallest(arr, 0, arr.length - 1,k -1));
  }

  public static int kthSmallest(CompareInt[] arr, int low, int high, int k) {
    // find the partition
    int partition = partition(arr,low,high);

    // if partition value is equal to the kth position,
    // return value at k.
    if(partition == k)
      return arr[partition].val;

      // if partition value is less than kth position,
      // search right side of the array.
    else if(partition < k )
      return kthSmallest(arr, partition + 1, high, k );

      // if partition value is more than kth position,
      // search left side of the array.
    else
      return kthSmallest(arr, low, partition-1, k );
  }

  public static int partition (CompareInt[] arr, int low, int high)
  {
    CompareInt pivot = arr[high];
    int pivotloc = low;
    for (int i = low; i <= high; i++)
    {
      // inserting elements of less value
      // to the left of the pivot location
      if(arr[i].compareTo(pivot) < 0)
      {
        CompareInt temp = arr[i];
        arr[i] = arr[pivotloc];
        arr[pivotloc] = temp;
        pivotloc++;
      }
    }

    // swapping pivot to the final pivot location
    CompareInt temp = arr[high];
    arr[high] = arr[pivotloc];
    arr[pivotloc] = temp;

    return pivotloc;
  }

}
