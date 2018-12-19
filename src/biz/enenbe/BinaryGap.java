package biz.enenbe;


/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is
 * surrounded by ones at both ends in the binary representation of N. This project, returns the
 * length of the longest binary gap given an integer N.
 */
public class BinaryGap {

  /**
   * Numgaps takes an integer N and returns the length of the longest binary gap.
   *
   * @param N an integer
   * @return int the length of the longest binary gap.
   */
  public static int numGaps(int N){
    int numGaps = 0;
    String str = Integer.toBinaryString(N);
    int j = 0;
    for (int i = 0; i<str.length(); i++){
      if(str.charAt(i) == '0'){
        j += 1;
      }
      if (str.charAt(i) == '1'){
        if(j > numGaps){
          numGaps = j;
        }
        j = 0;
      }
    }
    return numGaps;
  }

}
