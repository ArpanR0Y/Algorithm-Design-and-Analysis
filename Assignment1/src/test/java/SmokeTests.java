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
    CompareInt[] arr = convert(new int[]{4, 1, 3});
    try {
      assertEquals(3, KthSmallest.heapImpl(2, arr));
    } catch (NullPointerException e) {
      Assert.fail("Heap implementation returns a null value, make sure to implement all required functions.");
    }
  }

  @Test
  public void KthSmallestTestSampleMergeTest() {
    CompareInt[] arr = convert(new int[]{4, 1, 3});
    try {
      assertEquals(3, KthSmallest.mergeSortImpl(2, arr));
    } catch (NullPointerException e) {
      Assert.fail("Merge Sort implementation returns a null value, make sure to implement all required functions.");
    }
  }

  @Test
  public void KthSmallestTestSampleQuickSelectTest() {
    CompareInt[] arr = convert(new int[]{4, 1, 3});
    try {
      assertEquals(3, KthSmallest.quickSelectImpl(2, arr));
    } catch (NullPointerException e) {
      Assert.fail("Quick Select implementation returns a null value, make sure to implement all required functions.");
    }
  }

}
