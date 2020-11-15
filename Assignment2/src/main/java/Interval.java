import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * A private Interval class to help with the interval question
 */
public class Interval {

  int start;
  int finish;

  public Interval(int start, int finish) {
    this.start = start;
    this.finish = finish;
  }

  /**
   * sorts a list of intervals by start time, you are free to use this on the first question
   */
  public static void sortByStartTime(ArrayList<Interval> l) {
    Collections.sort(l, new Comparator<Interval>() {
      public int compare(Interval o1, Interval o2) {
        Interval i1 = (Interval) o1;
        Interval i2 = (Interval) o2;
        return i1.start - i2.start;
      }
    });
  }

  /**
   * sorts a list of intervals by finish time, you are free to use this on the first question
   */
  public static void sortByFinishTime(ArrayList<Interval> l) {
    Collections.sort(l, new Comparator<Interval>() {
      public int compare(Interval o1, Interval o2) {
        Interval i1 = (Interval) o1;
        Interval i2 = (Interval) o2;
        return i1.finish - i2.finish;
      }
    });
  }
}