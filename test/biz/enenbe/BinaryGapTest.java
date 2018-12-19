package biz.enenbe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryGapTest {

  @Test
  void numGaps() {
    assertEquals(0, BinaryGap.numGaps(15));
    assertEquals(0, BinaryGap.numGaps(32));
    assertEquals(1, BinaryGap.numGaps(20));
    assertEquals(2, BinaryGap.numGaps(9));
    assertEquals(4, BinaryGap.numGaps(529));
    assertEquals(5, BinaryGap.numGaps(1041));
  }
}