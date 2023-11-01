package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class MathUtilTest {

  @Test
  void testPower1() {
    double actualAnswer = MathUtil.power(0, -2);
    assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1:期待値と実際の結果が異なります");
  }

  @Test
  void testPower2() {
    double actualAnswer = MathUtil.power(0, -1);
    assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC2:期待値と実際の結果が異なります");
  }

  @Test
  void testPower3() {
    double actualAnswer = MathUtil.power(0, 0);
    assertEquals(1.0, actualAnswer, "TC3:期待値と実際の結果が異なります");
  }

  @Test
  void testPower4() {
    double actualAnswer = MathUtil.power(0, 1);
    assertEquals(0.0, actualAnswer, "TC4:期待値と実際の結果が異なります");
  }

  @Test
  void testPower5() {
    double actualAnswer = MathUtil.power(0, 2);
    assertEquals(0.0, actualAnswer, "TC5:期待値と実際の結果が異なります");
  }

  @Test
  void testPower6() {
    double actualAnswer = MathUtil.power(1, -2);
    assertEquals(1.0, actualAnswer, "TC6:期待値と実際の結果が異なります");
  }

  @Test
  void testPower7() {
    double actualAnswer = MathUtil.power(1, -1);
    assertEquals(1.0, actualAnswer, "TC7:期待値と実際の結果が異なります");
  }

  @Test
  void testPower8() {
    double actualAnswer = MathUtil.power(1, 0);
    assertEquals(1.0, actualAnswer, "TC8:期待値と実際の結果が異なります");
  }

  @Test
  void testPower9() {
    double actualAnswer = MathUtil.power(1, 1);
    assertEquals(1.0, actualAnswer, "TC9:期待値と実際の結果が異なります");
  }

  @Test
  void testPower10() {
    double actualAnswer = MathUtil.power(1, 2);
    assertEquals(1.0, actualAnswer, "TC10:期待値と実際の結果が異なります");
  }

  @Test
  void testPower11() {
    double actualAnswer = MathUtil.power(-1, -2);
    assertEquals(1.0, actualAnswer, "TC11:期待値と実際の結果が異なります");
  }

  @Test
  void testPower12() {
    double actualAnswer = MathUtil.power(-1, -1);
    assertEquals(-1.0, actualAnswer, "TC12:期待値と実際の結果が異なります");
  }

  @Test
  void testPower13() {
    double actualAnswer = MathUtil.power(-1, 0);
    assertEquals(1.0, actualAnswer, "TC13:期待値と実際の結果が異なります");
  }

  @Test
  void testPower14() {
    double actualAnswer = MathUtil.power(-1, 1);
    assertEquals(-1.0, actualAnswer, "TC14:期待値と実際の結果が異なります");
  }

  @Test
  void testPower15() {
    double actualAnswer = MathUtil.power(-1, 2);
    assertEquals(1.0, actualAnswer, "TC15:期待値と実際の結果が異なります");
  }

  @Test
  void testPower16() {
    double actualAnswer = MathUtil.power(2, -2);
    assertEquals(0.25, actualAnswer, "TC16:期待値と実際の結果が異なります");
  }

  @Test
  void testPower17() {
    double actualAnswer = MathUtil.power(2, -1);
    assertEquals(0.5, actualAnswer, "TC17:期待値と実際の結果が異なります");
  }

  @Test
  void testPower18() {
    double actualAnswer = MathUtil.power(2, 0);
    assertEquals(1.0, actualAnswer, "TC18:期待値と実際の結果が異なります");
  }

  @Test
  void testPower19() {
    double actualAnswer = MathUtil.power(2, 1);
    assertEquals(2.0, actualAnswer, "TC19:期待値と実際の結果が異なります");
  }

  @Test
  void testPower20() {
    double actualAnswer = MathUtil.power(2, 2);
    assertEquals(4.0, actualAnswer, "TC20:期待値と実際の結果が異なります");
  }

  /**
   * 例外が発生するか検証
   */
  @Test
  void testPower21() {
    try {
      MathUtil.power(100, 0);
      fail("TC21:例外が発生しなければなりません");
    } catch (IllegalArgumentException e) {
      assertEquals("100以上の値は不正です", e.getMessage(), "TC21:期待値と実際の結果が異なります");
    }
  }

  /**
   * 例外が発生するか検証
   */
  @Test
  public void testPower22() {
    try {
      MathUtil.power(0, 1000);
      fail("TC22:例外が発生しなければなりません");
    } catch (IllegalArgumentException e) {
      assertEquals("100以上の値は不正です", e.getMessage(), "TC22:期待値と実際の結果が異なります");
    }
  }
}
