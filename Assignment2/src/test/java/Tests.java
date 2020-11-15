import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
  public Tests() {
  }

  ArrayList<Interval> make(int[] starts, int[] finishes) {
    ArrayList<Interval> l = new ArrayList(starts.length);

    for(int i = 0; i < starts.length; ++i) {
      l.add(i, new Interval(starts[i], finishes[i]));
    }

    return l;
  }

  @Test
  public void interval1red1blue() {
    int[] redStarts = new int[]{1};
    int[] redFinishes = new int[]{3};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[1];
    int[] blueFinishes = new int[]{4};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on test with 1 red and 1 blue interval", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == 1);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on test " + "with 1 red and 1 blue interval");
    }

  }

  @Test
  public void interval1red2blues() {
    int[] redStarts = new int[]{1};
    int[] redFinishes = new int[]{3};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[]{0, 2};
    int[] blueFinishes = new int[]{2, 4};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on test with 1 red and 2 blues interval", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == 1);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on test " + "with 1 red and 2 blue intervals");
    }

  }

  @Test
  public void interval2red2blues() {
    int[] redStarts = new int[]{1, 2};
    int[] redFinishes = new int[]{3, 2};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[]{0, 2};
    int[] blueFinishes = new int[]{2, 4};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on test with 2 red and 2 blue intervals", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == 1);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on test " + "with 2 red and 2 blue intervals");
    }

  }

  @Test
  public void intervalSmallNotCovered() {
    int[] redStarts = new int[]{1};
    int[] redFinishes = new int[]{3};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[]{0, 4};
    int[] blueFinishes = new int[]{2, 4};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on small test with intervals that do not overlap at all", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == -1);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on small test " + "with intervals that do not overlap at all");
    }

  }

  @Test
  public void interval7red4blues() {
    int[] redStarts = new int[]{0, 2, 4, 9, 9, 10, 11};
    int[] redFinishes = new int[]{4, 5, 8, 10, 11, 12, 12};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[]{0, 5, 7, 11};
    int[] blueFinishes = new int[]{2, 5, 10, 13};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on test with 7 red and 4 blue intervals", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == 2);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on test with " + "7 red and 4 blue intervals");
    }

  }

  @Test(
      timeout = 4L
  )
  public void interval13red13blues() {
    int[] redStarts = new int[]{0, 2, 4, 9, 9, 10, 11, 13, 15, 18, 21, 25, 28};
    int[] redFinishes = new int[]{4, 5, 8, 10, 11, 12, 12, 13, 16, 19, 21, 27, 28};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[]{0, 5, 7, 11, 12, 12, 15, 15, 16, 17, 19, 22, 25};
    int[] blueFinishes = new int[]{2, 5, 10, 13, 12, 14, 16, 18, 17, 18, 21, 26, 25};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on a large interval test", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == 5);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on large" + " interval test");
    }

  }

  @Test(
      timeout = 8L
  )
  public void interval16red16blues() {
    int[] redStarts = new int[]{0, 2, 4, 9, 9, 10, 11, 13, 15, 18, 21, 25, 28, 30, 30, 30};
    int[] redFinishes = new int[]{4, 5, 8, 10, 11, 12, 12, 13, 16, 19, 21, 27, 28, 30, 31, 32};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[]{0, 5, 7, 11, 12, 12, 15, 15, 16, 17, 19, 22, 25, 31, 32};
    int[] blueFinishes = new int[]{2, 5, 10, 13, 12, 14, 16, 18, 17, 18, 21, 26, 25, 32, 32};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on a large interval test 2", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == 6);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on large" + " interval test 2");
    }

  }

  @Test(
      timeout = 4L
  )
  public void interval12red12blues() {
    int[] redStarts = new int[]{0, 2, 4, 9, 9, 10, 11, 13, 15, 18, 21, 22, 28};
    int[] redFinishes = new int[]{4, 5, 8, 10, 11, 12, 12, 13, 21, 19, 21, 27, 28};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[]{0, 5, 7, 11, 12, 12, 15, 15, 16, 16, 19, 22};
    int[] blueFinishes = new int[]{2, 5, 10, 13, 12, 14, 16, 18, 17, 18, 21, 26};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on a large interval test 3", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == 4);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on large" + " interval test 3");
    }

  }

  @Test(
      timeout = 4L
  )
  public void intervalLargeNotCovered() {
    int[] redStarts = new int[]{0, 2, 4, 9, 9, 10, 11, 13, 15, 18, 21, 25, 28};
    int[] redFinishes = new int[]{4, 5, 8, 10, 11, 12, 12, 13, 16, 19, 21, 27, 28};
    ArrayList<Interval> red = this.make(redStarts, redFinishes);
    int[] blueStarts = new int[]{0, 5, 7, 11, 12, 12, 15, 15, 17, 17, 19, 22, 25};
    int[] blueFinishes = new int[]{2, 5, 10, 13, 12, 14, 16, 18, 17, 18, 21, 26, 25};
    ArrayList blue = this.make(blueStarts, blueFinishes);

    try {
      Assert.assertTrue("optimalIntervals() is incorrect on a large interval test where blues are not covered", GreedyDynamicAlgorithms.optimalIntervals(red, blue) == -1);
    } catch (NullPointerException var8) {
      Assert.fail("optimalIntervals() returns a null value, make sure to implement all required functions");
    } catch (Exception var9) {
      Assert.fail("optimalInterval() throws exception " + var9 + " on large" + " interval test where blues are not covered");
    }

  }

  private int cost(List<Direction> path, int[][] grid) {
    int i = 0;
    int j = 0;
    int cost = 0;
    cost = cost + grid[i][j];

    for(Iterator var7 = path.iterator(); var7.hasNext(); cost += grid[i][j]) {
      Direction d = (Direction)var7.next();
      if (d == Direction.DOWN) {
        ++i;
      } else {
        ++j;
      }
    }

    return cost;
  }

  @Test
  public void gridSmall() {
    int[][] grid = new int[][]{{1, 2}, {3, 4}};

    try {
      List<Direction> path = GreedyDynamicAlgorithms.optimalGridPath(grid);
      Assert.assertTrue("optimalGridPath()  is incorrect on 2x2 grid", this.cost(path, grid) == 7);
    } catch (NullPointerException var3) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var4) {
      Assert.fail("optimalGridPath() throws exception " + var4 + " on test with a 2x2 grid");
    }

  }

  @Test
  public void gridSmallNotGreedy() {
    int[][] grid = new int[][]{{1, 1, 50}, {5, 10, 50}, {6, 4, 4}};

    try {
      List<Direction> path = GreedyDynamicAlgorithms.optimalGridPath(grid);
      Assert.assertTrue("optimalGridPath()  is incorrect on 3x3 grid", this.cost(path, grid) == 20);
    } catch (NullPointerException var3) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var4) {
      Assert.fail("optimalGridPath() throws exception " + var4 + " on test with a 3x3 grid");
    }

  }

  @Test
  public void gridSmallNotGreedy2() {
    int[][] grid = new int[][]{{5, 1, 1}, {2, 4, 7}, {2, 4, 5}, {5, 6, 3}};

    try {
      List<Direction> path = GreedyDynamicAlgorithms.optimalGridPath(grid);
      Assert.assertTrue("optimalGridPath()  is incorrect on 4x3 grid", this.cost(path, grid) == 21);
    } catch (NullPointerException var3) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var4) {
      Assert.fail("optimalGridPath() throws exception " + var4 + " on test with a 4x3 grid");
    }

  }

  @Test
  public void gridSmallNotGreedy3() {
    int[][] grid = new int[][]{{1, 7, 9, 2}, {8, 6, 3, 2}, {1, 6, 7, 8}, {2, 9, 8, 2}};

    try {
      List<Direction> path = GreedyDynamicAlgorithms.optimalGridPath(grid);
      Assert.assertTrue("optimalGridPath()  is incorrect on 4x4 grid", this.cost(path, grid) == 29);
    } catch (NullPointerException var3) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var4) {
      Assert.fail("optimalGridPath() throws exception " + var4 + " on test with a 4x4 grid");
    }

  }

  @Test(
      timeout = 3000L
  )
  public void gridLarge1() {
    int[][] grid = new int[3000][3000];

    int i;
    for(i = 0; i < grid.length; ++i) {
      for(int j = 0; j < grid.length; ++j) {
        grid[i][j] = 3;
      }
    }

    for(i = 0; i < grid.length; ++i) {
      grid[1500][i] = 1;
    }

    try {
      List<Direction> path = GreedyDynamicAlgorithms.optimalGridPath(grid);
      Assert.assertTrue("optimalGridPath()  is incorrect very large grid test 1", this.cost(path, grid) == 11997);
    } catch (NullPointerException var4) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var5) {
      Assert.fail("optimalGridPath() throws exception " + var5 + " on very large grid test 1");
    }

  }

  @Test(
      timeout = 3000L
  )
  public void gridLargeArithmetic1() {
    int[][] grid = new int[3000][3000];

    for(int i = 0; i < grid.length; ++i) {
      for(int j = 0; j < grid.length; ++j) {
        grid[i][j] = i / 500 + j / 1000;
      }
    }

    try {
      List<Direction> path = GreedyDynamicAlgorithms.optimalGridPath(grid);
      Assert.assertTrue("optimalGridPath()  is incorrect very large grid test 2", this.cost(path, grid) == 15500);
    } catch (NullPointerException var4) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var5) {
      Assert.fail("optimalGridPath() throws exception " + var5 + " on very large grid test 2");
    }

  }

  @Test(
      timeout = 3000L
  )
  public void gridLargeArithmetic2() {
    int[][] grid = new int[2500][2500];

    for(int i = 0; i < grid.length; ++i) {
      for(int j = 0; j < grid.length; ++j) {
        if ((i + j) % 3 == 0) {
          grid[i][j] = i / 150 + j / 250;
        } else if ((i + j) % 3 == 1) {
          grid[i][j] = -1 * (i / 300 + j / 100);
        } else {
          grid[i][j] = i / 400 + j / 500;
        }
      }
    }

    try {
      List<Direction> path = GreedyDynamicAlgorithms.optimalGridPath(grid);
      Assert.assertTrue("optimalGridPath()  is incorrect very large grid test 3 with negative numbers", this.cost(path, grid) == -8060);
    } catch (NullPointerException var4) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var5) {
      Assert.fail("optimalGridPath() throws exception " + var5 + " on very large grid test 3 " + "with negative numbers");
    }

  }

  @Test
  public void test1() {
    String input = "abc";

    try {
      Huffman h = new Huffman(input);
      String encoding = h.encode();
      Assert.assertTrue("Huffman output of encoding and decoding is incorrect on 3-letter string test", input.equals(h.decode(encoding)));
      Assert.assertTrue("Huffman compression ratio is incorrect on 3-letter string test", Math.abs(Huffman.compressionRatio(input) - 0.20833D) < 0.01D);
    } catch (NullPointerException var4) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var5) {
      Assert.fail("Huffman test throws exception " + var5 + " on encoding and decoding " + "of 3-letter string");
    }

  }

  @Test
  public void test2() {
    String input = "aabbbbcddd";

    try {
      Huffman h = new Huffman(input);
      String encoding = h.encode();
      Assert.assertTrue("Huffman output of encoding and decoding is incorrect on test with 4 differentcharacters that each have different frequencies", input.equals(h.decode(encoding)));
      Assert.assertTrue("Huffman compression ratio is incorrect on test with 4 different characters that each have different frequencies", Math.abs(Huffman.compressionRatio(input) - 0.2375D) < 0.01D);
    } catch (NullPointerException var4) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var5) {
      Assert.fail("Huffman test throws exception " + var5 + " on encoding and decoding " + "of string with 4 different characters that each have different frequencies");
    }

  }

  @Test
  public void test3() {
    String input = "ab";

    try {
      Huffman h = new Huffman(input);
      String encoding = h.encode();
      Assert.assertTrue("Huffman output of encoding and decoding is incorrect on test with 2 characters", input.equals(h.decode(encoding)));
      Assert.assertTrue("Huffman compression ratio is incorrect on test with 2 characters", Math.abs(Huffman.compressionRatio(input) - 0.125D) < 0.01D);
    } catch (NullPointerException var4) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var5) {
      Assert.fail("Huffman test throws exception " + var5 + " on encoding and decoding " + "of string with 2 different characters");
    }

  }

  @Test
  public void test4() {
    String input = "aabbccdd";

    try {
      Huffman h = new Huffman(input);
      String encoding = h.encode();
      Assert.assertTrue("Huffman output of encoding and decoding is incorrect on test with 4 differentcharacters of equal frequencies", input.equals(h.decode(encoding)));
      Assert.assertTrue("Huffman compression ratio is incorrect on test with 4 different characters of equal frequencies", Math.abs(Huffman.compressionRatio(input) - 0.25D) < 0.01D);
    } catch (NullPointerException var4) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var5) {
      Assert.fail("Huffman test throws exception " + var5 + " on encoding and decoding " + "of string with 4 different characters of equal frequencies");
    }

  }

  @Test
  public void testLarge() {
    String input = "BACADAEAFABBAAAGAH";

    try {
      Huffman h = new Huffman(input);
      String encoding = h.encode();
      Assert.assertTrue("Huffman output of encoding and decoding is incorrect on large test", input.equals(h.decode(encoding)));
      Assert.assertTrue("Huffman compression ratio is incorrect on large test", Math.abs(Huffman.compressionRatio(input) - 0.29167D) < 0.01D);
    } catch (NullPointerException var4) {
      Assert.fail("optimalGridPath() returns a null value, make sure to implement all required functions");
    } catch (Exception var5) {
      Assert.fail("Huffman test throws exception " + var5 + " on encoding and decoding " + "large test");
    }

  }
}