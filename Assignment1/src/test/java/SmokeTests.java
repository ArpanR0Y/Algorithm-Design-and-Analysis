import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SmokeTests {

  /**
   * Helper function for converting an array of ints to an array of CompareInts
   */
  private static CompareInt[] convert(int[] arr) {
    CompareInt[] newArr = new CompareInt[arr.length];
    for (int i = 0; i < newArr.length; i++) {
      newArr[i] = new CompareInt(arr[i]);
    }
    return newArr;
  }

  @Test
  public void KthSmallestTestSampleHeapTest() {
    CompareInt[] arr = convert(new int[]{4, 1, 3, 5, 9, 23, 18, 10, 8, 11});
    try {
      assertEquals(8, KthSmallest.heapImpl(5, arr));
    } catch (NullPointerException e) {
      Assert.fail("Heap implementation returns a null value, make sure to implement all required functions.");
    }
  }

  @Test
  public void KthSmallestTestSampleMergeTest() {
    CompareInt[] arr = convert(new int[]{4, 1, 3, 5, 9, 23, 18, 10, 8, 11});
    try {
      assertEquals(8, KthSmallest.mergeSortImpl(5, arr));
    } catch (NullPointerException e) {
      Assert.fail("Merge Sort implementation returns a null value, make sure to implement all required functions.");
    }
  }

  @Test
  public void KthSmallestTestSampleQuickSelectTest() {
    CompareInt[] arr = convert(new int[]{5, 1, 3, 6, 2});
    try {
      assertEquals(5, KthSmallest.quickSelectImpl(4, arr));
    } catch (NullPointerException e) {
      Assert.fail("Quick Select implementation returns a null value, make sure to implement all required functions.");
    }
  }

}
