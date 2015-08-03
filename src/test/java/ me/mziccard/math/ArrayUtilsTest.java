package me.mziccard.math;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class ArrayUtilsTest {

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  @Test 
  public void shouldConvertShortToInt() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    int[] b = {1, 2, 3};
    Assert.assertArrayEquals(
      "toLong({1, 2, 3}) must be {1, 2, 3}",
      b, 
      ArrayUtils.toInt(a));
  }

  @Test 
  public void shouldConvertShortToLong() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    long[] b = {1, 2, 3};
    Assert.assertArrayEquals(
      "toLong({1, 2, 3}) must be {1, 2, 3}",
      b, 
      ArrayUtils.toLong(a));
  }

  @Test 
  public void shouldConvertShortToFloat() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    float[] b = {1.0f, 2.0f, 3.0f};
    Assert.assertArrayEquals(
      "toFloat({1, 2, 3}) must be {1.0, 2.0, 3.0}",
      b, 
      ArrayUtils.toFloat(a), 0.000001f);
  }

  @Test 
  public void shouldConvertShortToDouble() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    double[] b = {1.0, 2.0, 3.0};
    Assert.assertArrayEquals(
      "toDouble({1, 2, 3}) must be {1.0, 2.0, 3.0}",
      b, 
      ArrayUtils.toDouble(a), 0.000000001);
  }

  @Test 
  public void shouldConvertIntToLong() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    long[] b = {1, 2, 3};
    Assert.assertArrayEquals(
      "toLong({1, 2, 3}) must be {1, 2, 3}",
      b, 
      ArrayUtils.toLong(a));
  }

  @Test 
  public void shouldConvertIntToFloat() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    float[] b = {1.0f, 2.0f, 3.0f};
    Assert.assertArrayEquals(
      "toFloat({1, 2, 3}) must be {1.0, 2.0, 3.0}",
      b, 
      ArrayUtils.toFloat(a), 0.000001f);
  }

  @Test 
  public void shouldConvertIntToDouble() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    double[] b = {1.0, 2.0, 3.0};
    Assert.assertArrayEquals(
      "toDouble({1, 2, 3}) must be {1.0, 2.0, 3.0}",
      b, 
      ArrayUtils.toDouble(a), 0.000000001);
  }

  @Test 
  public void shouldConvertLongToDouble() throws DifferentLengthException {
    long[] a = {1, 2, 3};
    double[] b = {1.0, 2.0, 3.0};
    Assert.assertArrayEquals(
      "toDouble({1, 2, 3}) must be {1.0, 2.0, 3.0}",
      b, 
      ArrayUtils.toDouble(a), 0.000000001);
  }

  @Test 
  public void shouldConvertFloatToDouble() throws DifferentLengthException {
    float[] a = {1.0f, 2.0f, 3.0f};
    double[] b = {1.0, 2.0, 3.0};
    Assert.assertArrayEquals(
      "toDouble({1.0, 2.0, 3.0}) must be {1.0, 2.0, 3.0}",
      b, 
      ArrayUtils.toDouble(a), 0.000000001);
  }

  @Test 
  public void shouldSumShortArray() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    Assert.assertEquals(
      "sum({1, 2, 3}) must be 6",
      6, 
      ArrayUtils.sum(a));
  }

  @Test 
  public void shouldSumIntArray() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    Assert.assertEquals(
      "sum({1, 2, 3}) must be 6",
      6, 
      ArrayUtils.sum(a));
  }

  @Test 
  public void shouldSumLongArray() throws DifferentLengthException {
    long[] a = {1, 2, 3};
    Assert.assertEquals(
      "sum({1, 2, 3}) must be 6",
      6, 
      ArrayUtils.sum(a));
  }

  @Test 
  public void shouldSumFloatArray() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    Assert.assertEquals(
      "sum({1.5, 2.5, 3.5}) must be 7.5",
      7.5, 
      ArrayUtils.sum(a), 0.000001f);
  }

  @Test 
  public void shouldSumDoubleArray() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    Assert.assertEquals(
      "sum({1.5, 2.5, 3.5}) must be 7.5",
      7.5,
      ArrayUtils.sum(a), 0.000000001);
  }

  @Test 
  public void shouldAbsShortArray() throws DifferentLengthException {
    short[] a = {-1, -2, -3};
    short[] b = {1, 2, 3};
    ArrayUtils.abs(a);
    Assert.assertArrayEquals(
      "abs({-1, -2, -3}) must be {1, 2, 3}",
      b, 
      a);
  }

  @Test 
  public void shouldAbsIntArray() throws DifferentLengthException {
    int[] a = {-1, -2, -3};
    int[] b = {1, 2, 3};
    ArrayUtils.abs(a);
    Assert.assertArrayEquals(
      "abs({-1, -2, -3}) must be {1, 2, 3}",
      b, 
      a);
  }

  @Test 
  public void shouldAbsLongArray() throws DifferentLengthException {
    long[] a = {-1, -2, -3};
    long[] b = {1, 2, 3};
    ArrayUtils.abs(a);
    Assert.assertArrayEquals(
      "abs({-1, -2, -3}) must be {1, 2, 3}",
      b, 
      a);
  }

  @Test 
  public void shouldAbsFloatArray() throws DifferentLengthException {
    float[] a = {-1.5f, -2.5f, -3.5f};
    float[] b = {1.5f, 2.5f, 3.5f};
    ArrayUtils.abs(a);
    Assert.assertArrayEquals(
      "abs({-1.5, -2.5, -3.5}) must be {1.5, 2.5, 3.5}",
      b, 
      a, 0.000001f);
  }

  @Test 
  public void shouldAbsDoubleArray() throws DifferentLengthException {
    double[] a = {-1.5, -2.5, -3.5};
    double[] b = {1.5, 2.5, 3.5};
    ArrayUtils.abs(a);
    Assert.assertArrayEquals(
      "abs({-1.5, -2.5, -3.5}) must be {1.5, 2.5, 3.5}",
      b,
      a, 0.000000001);
  }

  @Test 
  public void shouldAvgShortArray() throws DifferentLengthException {
    short[] a = {1, 4, 5};
    Assert.assertEquals(
      "avg({1, 4, 5}) must be 3.333333333",
      3.333333333,
      ArrayUtils.avg(a), 0.000000001);
  }

  @Test 
  public void shouldAvgIntArray() throws DifferentLengthException {
    int[] a = {1, 4, 5};
    Assert.assertEquals(
      "avg({1, 4, 5}) must be 3.333333333",
      3.333333333,
      ArrayUtils.avg(a), 0.000000001);
  }

  @Test 
  public void shouldAvgLongArray() throws DifferentLengthException {
    long[] a = {1, 4, 5};
    Assert.assertEquals(
      "avg({1, 4, 5}) must be 3.333333333",
      3.333333333,
      ArrayUtils.avg(a), 0.000000001);
  }

  @Test 
  public void shouldAvgFloatArray() throws DifferentLengthException {
    float[] a = {1.3f, 3.6f, 5.1f};
    Assert.assertEquals(
      "avg({1.3, 3.6, 5.1}) must be 3.333333333",
      3.333333333, 
      ArrayUtils.avg(a), 0.000001);
  }

  @Test 
  public void shouldAvgDoubleArray() throws DifferentLengthException {
    double[] a = {1.3, 3.6, 5.1};
    Assert.assertEquals(
      "avg({1.3, 3.6, 5.1}) must be 3.333333333",
      3.333333333, 
      ArrayUtils.avg(a), 0.000000001);
  }

  @Test 
  public void shouldMedianShortOddArray() throws DifferentLengthException {
    short[] a = {5, 1, 4};
    Assert.assertEquals(
      "median({5, 1, 4}) must be 4.0",
      4.0, 
      ArrayUtils.median(a), 0.000000001);
  }

  @Test 
  public void shouldMedianShortEvenArray() throws DifferentLengthException {
    short[] a = {1, 5, 6, 4};
    Assert.assertEquals(
      "median({1, 5, 6, 4}) must be 4.5",
      4.5, 
      ArrayUtils.median(a), 0.000000001);
  }

  @Test 
  public void shouldMedianIntOddArray() throws DifferentLengthException {
    int[] a = {5, 1, 4};
    Assert.assertEquals(
      "median({5, 1, 4}) must be 4.0",
      4.0, 
      ArrayUtils.median(a), 0.000000001);
  }

  @Test 
  public void shouldMedianIntEvenArray() throws DifferentLengthException {
    int[] a = {1, 5, 6, 4};
    Assert.assertEquals(
      "median({1, 5, 6, 4}) must be 4.5",
      4.5, 
      ArrayUtils.median(a), 0.000000001);
  }

  @Test 
  public void shouldMedianLongOddArray() throws DifferentLengthException {
    long[] a = {5, 1, 4};
    Assert.assertEquals(
      "median({5, 1, 4}) must be 4.0",
      4.0, 
      ArrayUtils.median(a), 0.000000001);
  }

  @Test 
  public void shouldMedianLongEvenArray() throws DifferentLengthException {
    long[] a = {1, 5, 6, 4};
    Assert.assertEquals(
      "median({1, 5, 6, 4}) must be 4.5",
      4.5, 
      ArrayUtils.median(a), 0.000000001);
  }

  @Test 
  public void shouldMedianFloatOddArray() throws DifferentLengthException {
    float[] a = {1.1f, 5.4f, 6.2f};
    Assert.assertEquals(
      "median({1.1, 5.4, 6.2}) must be 5.4",
      5.4, 
      ArrayUtils.median(a), 0.000001);
  }

  @Test 
  public void shouldMedianFloatEvenArray() throws DifferentLengthException {
    double[] a = {1.1, 5.4, 6.2, 4.3};
    Assert.assertEquals(
      "median({1.1, 5.4, 6.2, 4.3}) must be 4.5",
      4.85, 
      ArrayUtils.median(a), 0.000000001);
  }

  @Test 
  public void medianShouldSortArray() throws DifferentLengthException {
    short[] a = {1, 5, 6, 4};
    int[] b = {1, 5, 6, 4};
    long[] c = {1, 5, 6, 4};
    float[] d = {1.1f, 5.4f, 6.2f, 4.3f};
    double[] e = {1.1, 5.4, 6.2, 4.3};
    ArrayUtils.median(a);
    ArrayUtils.median(b);
    ArrayUtils.median(c);
    ArrayUtils.median(d);
    ArrayUtils.median(e);
    Assert.assertArrayEquals(
      new short[]{1, 4, 5, 6}, a);
    Assert.assertArrayEquals(
      new int[]{1, 4, 5, 6}, b);
    Assert.assertArrayEquals(
      new long[]{1, 4, 5, 6}, c);
    Assert.assertArrayEquals(
      new float[]{1.1f, 4.3f, 5.4f, 6.2f}, d, 0.000001f);
    Assert.assertArrayEquals(
      new double[]{1.1, 4.3, 5.4, 6.2}, e, 0.000000001);
  }

  @Test 
  public void shouldCorrelateShortArray() throws DifferentLengthException {
    short[] a = {1, 5, 6, 4};
    long[] b = {78, 59, 26, 4};
    Assert.assertArrayEquals(
      "autoCorrelation({1, 5, 6, 4}) must be {78, 59, 26, 4}",
      b, 
      ArrayUtils.autoCorrelation(a));
  }

  @Test 
  public void shouldCorrelateIntArray() throws DifferentLengthException {
    int[] a = {1, 5, 6, 4};
    long[] b = {78, 59, 26, 4};
    Assert.assertArrayEquals(
      "autoCorrelation({1, 5, 6, 4}) must be {78, 59, 26, 4}",
      b, 
      ArrayUtils.autoCorrelation(a));
  }

  @Test 
  public void shouldCorrelateLongArray() throws DifferentLengthException {
    long[] a = {1, 5, 6, 4};
    long[] b = {78, 59, 26, 4};
    Assert.assertArrayEquals(
      "autoCorrelation({1, 5, 6, 4}) must be {78, 59, 26, 4}",
      b, 
      ArrayUtils.autoCorrelation(a));
  }

  @Test 
  public void shouldCorrelateFloatArray() throws DifferentLengthException {
    float[] a = {1.0f, 5.0f, 6.0f, 4.0f};
    double[] b = {78.0, 59.0, 26.0, 4.0};
    Assert.assertArrayEquals(
      "autoCorrelation({1.0, 5.0, 6.0, 4.0}) must be {78.0, 59.0, 26.0, 4.0}",
      b, 
      ArrayUtils.autoCorrelation(a), 0.000000001);
  }

  @Test 
  public void shouldCorrelateDoubleArray() throws DifferentLengthException {
    double[] a = {1.0, 5.0, 6.0, 4.0};
    double[] b = {78.0, 59.0, 26.0, 4.0};
    Assert.assertArrayEquals(
      "autoCorrelation({1.0, 5.0, 6.0, 4.0}) must be {78.0, 59.0, 26.0, 4.0}",
      b, 
      ArrayUtils.autoCorrelation(a), 0.000000001);
  }

  @Test 
  public void shouldSumShort() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    short[] sum = {2, 4, 6};
    Assert.assertArrayEquals(
      "sum({1, 2, 3}, {1, 2, 3}) must be {2, 4, 6}",
      sum, 
      ArrayUtils.sum(a, a));
  }

  @Test 
  public void shouldThrowSummingShort() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    short[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sum(a, b);
  }

  @Test 
  public void shouldSumInt() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    int[] sum = {2, 4, 6};
    Assert.assertArrayEquals(
      "sum({1, 2, 3}, {1, 2, 3}) must be {2, 4, 6}",
      sum, 
      ArrayUtils.sum(a, a));
  }

  @Test 
  public void shouldThrowSummingInt() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    int[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sum(a, b);
  }

  @Test 
  public void shouldSumLong() throws DifferentLengthException {
    long[] a = {1, 2, 3};
    long[] sum = {2, 4, 6};
    Assert.assertArrayEquals(
      "sum({1, 2, 3}, {1, 2, 3}) must be {2, 4, 6}",
      sum, 
      ArrayUtils.sum(a, a));
  }

  @Test 
  public void shouldThrowSummingLong() throws DifferentLengthException {
    long[] a = {1, 2, 3};
    long[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sum(a, b);
  }

  @Test 
  public void shouldSumFloat() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    float[] sum = {3.0f, 5.0f, 7.0f};
    Assert.assertArrayEquals(
      "sum({1.5, 2.5, 3.5}, {1.5, 2.5, 3.5}) must be {3, 5, 7}",
      sum, 
      ArrayUtils.sum(a, a), 0.0f);
  }

  @Test 
  public void shouldThrowSummingFloat() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    float[] b = {1.5f, 2.5f};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sum(a, b);
  }

  @Test 
  public void shouldSumDouble() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    double[] sum = {3.0, 5.0, 7.0};
    Assert.assertArrayEquals(
      "sum({1.5, 2.5, 3.5}, {1.5, 2.5, 3.5}) must be {3, 5, 7}",
      sum, 
      ArrayUtils.sum(a, a), 0.0);
  }

  @Test 
  public void shouldThrowSummingDouble() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    double[] b = {1.5, 2.5};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sum(a, b);
  }

  @Test 
  public void shouldSubtractShort() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    short[] b = {2, 3, 4};
    short[] sub = {-1, -1, -1};
    Assert.assertArrayEquals(
      "sub({1, 2, 3}, {2, 3, 4}) must be {-1, -1, -1}",
      sub, 
      ArrayUtils.sub(a, b));
  }

  @Test 
  public void shouldThrowSubtractingShort() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    short[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sub(a, b);
  }

  @Test 
  public void shouldSubtractInt() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    int[] b = {2, 3, 4};
    int[] sub = {-1, -1, -1};
    Assert.assertArrayEquals(
      "sub({1, 2, 3}, {2, 3, 4}) must be {-1, -1, -1}",
      sub, 
      ArrayUtils.sub(a, b));
  }

  @Test 
  public void shouldThrowSubtractingInt() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    int[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sub(a, b);
  }

  @Test 
  public void shouldSubtractLong() throws DifferentLengthException {
    long[] a = {1, 2, 3};
    long[] b = {2, 3, 4};
    long[] sub = {-1, -1, -1};
    Assert.assertArrayEquals(
      "sub({1, 2, 3}, {2, 3, 4}) must be {-1, -1, -1}",
      sub, 
      ArrayUtils.sub(a, b));
  }

  @Test 
  public void shouldThrowSubtractingLong() throws DifferentLengthException {
    long[] a = {1, 2, 3};
    long[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sub(a, b);
  }

  @Test 
  public void shouldSubtractFloat() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    float[] b = {1.2f, 2.2f, 3.2f};
    float[] sub = {0.3f, 0.3f, 0.3f};
    Assert.assertArrayEquals(
      "sub({1.5, 2.5, 3.5}, {1.2, 2.2, 3.2}) must be {0.3, 0.3, 0.3}",
      sub, 
      ArrayUtils.sub(a, b), 0.000001f);
  }

  @Test 
  public void shouldThrowSubtractingFloat() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    float[] b = {1.2f, 2.2f};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sub(a, b);
  }

  @Test 
  public void shouldSubtractDouble() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    double[] b = {1.2, 2.2, 3.2};
    double[] sub = {0.3, 0.3, 0.3};
    Assert.assertArrayEquals(
      "sub({1.5, 2.5, 3.5}, {1.2, 2.2, 3.2}) must be {0.3, 0.3, 0.3}",
      sub, 
      ArrayUtils.sub(a, b), 0.000000001);
  }

  @Test 
  public void shouldThrowSubtractingDouble() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    double[] b = {1.2, 2.2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.sub(a, b);
  }

  @Test 
  public void shouldMultiplyShort() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    short[] b = {2, 3, 4};
    short[] mul = {2, 6, 12};
    Assert.assertArrayEquals(
      "mul({1, 2, 3}, {2, 3, 4}) must be {2, 6, 12}",
      mul, 
      ArrayUtils.mul(a, b));
  }

  @Test 
  public void shouldThrowMultiply​ingShort() throws DifferentLengthException {
    short[] a = {1, 2, 3};
    short[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.mul(a, b);
  }

  @Test 
  public void shouldMultiplyInt() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    int[] b = {2, 3, 4};
    int[] mul = {2, 6, 12};
    Assert.assertArrayEquals(
      "mul({1, 2, 3}, {2, 3, 4}) must be {2, 6, 12}",
      mul, 
      ArrayUtils.mul(a, b));
  }

  @Test 
  public void shouldThrowMultiply​ingInt() throws DifferentLengthException {
    int[] a = {1, 2, 3};
    int[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.mul(a, b);
  }

  @Test 
  public void shouldMultiplyLong() throws DifferentLengthException {
    long[] a = {1, 2, 3};
    long[] b = {2, 3, 4};
    long[] mul = {2, 6, 12};
    Assert.assertArrayEquals(
      "mul({1, 2, 3}, {2, 3, 4}) must be {2, 6, 12}",
      mul, 
      ArrayUtils.mul(a, b));
  }

  @Test 
  public void shouldThrowMultiply​ingLong() throws DifferentLengthException {
    long[] a = {1, 2, 3};
    long[] b = {2, 4};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.mul(a, b);
  }

  @Test 
  public void shouldMultiplyFloat() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    float[] b = {2.0f, 3.0f, 4.0f};
    float[] mul = {3.0f, 7.5f, 14.0f};
    Assert.assertArrayEquals(
      "mul({1.5, 2.5, 3.5}, {2, 3, 4}) must be {3, 7.5, 14}",
       mul, 
       ArrayUtils.mul(a, b), 0.000001f);
  }

  @Test 
  public void shouldThrowMultiply​ingFloat() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    float[] b = {1.2f, 2.2f};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.mul(a, b);
  }

  @Test 
  public void shouldMultiplyDouble() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    double[] b = {2.0, 3.0, 4.0};
    double[] mul = {3.0, 7.5, 14.0};
    Assert.assertArrayEquals(
      "mul({1.5, 2.5, 3.5}, {2, 3, 4}) must be {3, 7.5, 14}",
      mul, 
      ArrayUtils.mul(a, b), 0.000000001);
  }

  @Test 
  public void shouldThrowMultiply​ingDouble() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    double[] b = {1.2, 2.2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.mul(a, b);
  }

  @Test 
  public void shouldDivideShort() throws DifferentLengthException {
    short[] a = {4, 5, 6};
    short[] b = {1, 2, 3};
    short[] div = {4, 2, 2};
    Assert.assertArrayEquals(
      "div({4, 5, 6}, {1, 2, 3}) must be {4, 2, 2}",
      div, 
      ArrayUtils.div(a, b));
  }

  @Test 
  public void shouldThrowDividingShort() throws DifferentLengthException {
    short[] a = {4, 5, 6};
    short[] b = {1, 2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.div(a, b);
  }

  @Test 
  public void shouldDivideInt() throws DifferentLengthException {
    int[] a = {4, 5, 6};
    int[] b = {1, 2, 3};
    int[] div = {4, 2, 2};
    Assert.assertArrayEquals(
      "div({4, 5, 6}, {1, 2, 3}) must be {4, 2, 2}",
      div, 
      ArrayUtils.div(a, b));
  }

  @Test 
  public void shouldThrowDividingInt() throws DifferentLengthException {
    int[] a = {4, 5, 6};
    int[] b = {1, 2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.div(a, b);
  }

  @Test 
  public void shouldDivideLong() throws DifferentLengthException {
    long[] a = {4, 5, 6};
    long[] b = {1, 2, 3};
    long[] div = {4, 2, 2};
    Assert.assertArrayEquals(
      "div({4, 5, 6}, {1, 2, 3}) must be {4, 2, 2}",
      div, 
      ArrayUtils.div(a, b));
  }

  @Test 
  public void shouldThrowDividingLong() throws DifferentLengthException {
    long[] a = {4, 5, 6};
    long[] b = {1, 2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.div(a, b);
  }

  @Test 
  public void shouldDivideFloat() throws DifferentLengthException {
    float[] a = {4.0f, 5.0f, 6.0f};
    float[] b = {1.0f, 2.0f, 5.0f};
    float[] div = {4.0f, 2.5f, 1.2f};
    Assert.assertArrayEquals(
      "div({4, 5, 6}, {1, 2, 5}) must be {4, 2.5, 1.2}",
      div, 
      ArrayUtils.div(a, b), 0.000001f);
  }

  @Test 
  public void shouldThrowDividingFloat() throws DifferentLengthException {
    float[] a = {4.0f, 5.0f, 6.0f};
    float[] b = {1.0f, 2.0f};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.div(a, b);
  }

  @Test 
  public void shouldDivideDouble() throws DifferentLengthException {
    double[] a = {4.0, 5.0, 6.0};
    double[] b = {1.0, 2.0, 5.0};
    double[] div = {4.0, 2.5, 1.2};
    Assert.assertArrayEquals(
      "div({4, 5, 6}, {1, 2, 5}) must be {4, 2.5, 1.2}",
      div, 
      ArrayUtils.div(a, b), 0.000000001);
  }

  @Test 
  public void shouldThrowDividingDouble() throws DifferentLengthException {
    double[] a = {4.0, 5.0, 6.0};
    double[] b = {1.0, 2.0};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.div(a, b);
  }

  @Test 
  public void shouldDotShort() throws DifferentLengthException {
    short[] a = {4, 5, 6};
    short[] b = {1, 2, 3};
    long prod = 32;
    Assert.assertEquals(
      "dotProd({4, 5, 6}, {1, 2, 3}) should be 32",
      prod, 
      ArrayUtils.dotProd(a, b));
  }

  @Test 
  public void shouldThrowDotShort() throws DifferentLengthException {
    short[] a = {4, 5, 6};
    short[] b = {1, 2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.dotProd(a, b);
  }


  @Test 
  public void shouldDotInt() throws DifferentLengthException {
    int[] a = {4, 5, 6};
    int[] b = {1, 2, 3};
    long prod = 32;
    Assert.assertEquals(
      "dotProd({4, 5, 6}, {1, 2, 3}) should be 32",
      prod, 
      ArrayUtils.dotProd(a, b));
  }

  @Test 
  public void shouldThrowDotInt() throws DifferentLengthException {
    int[] a = {4, 5, 6};
    int[] b = {1, 2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.dotProd(a, b);
  }

  @Test 
  public void shouldDotLong() throws DifferentLengthException {
    long[] a = {4, 5, 6};
    long[] b = {1, 2, 3};
    long prod = 32;
    Assert.assertEquals(
      "dotProd({4, 5, 6}, {1, 2, 3}) should be 32",
      prod, 
      ArrayUtils.dotProd(a, b));
  }

  @Test 
  public void shouldThrowDotLong() throws DifferentLengthException {
    long[] a = {4, 5, 6};
    long[] b = {1, 2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.dotProd(a, b);
  }

  @Test 
  public void shouldDotFloat() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    float[] b = {1.2f, 2.2f, 3.2f};
    double prod = 18.5f;
    Assert.assertEquals(
      "dotProd({1.5, 2.5, 3.5}, {1.2, 2.2, 3.2}) should be 18.5",
      prod, 
      ArrayUtils.dotProd(a, b), 0.000001f);
  }

  @Test 
  public void shouldThrowDotFloat() throws DifferentLengthException {
    float[] a = {1.5f, 2.5f, 3.5f};
    float[] b = {1.2f, 2.2f};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.dotProd(a, b);
  }

  @Test 
  public void shouldDotDouble() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    double[] b = {1.2, 2.2, 3.2};
    double prod = 18.5;
    Assert.assertEquals(
      "dotProd({1.5, 2.5, 3.5}, {1.2, 2.2, 3.2}) should be 18.5",
      prod, 
      ArrayUtils.dotProd(a, b), 0.000000001);
  }

  @Test 
  public void shouldThrowDotDouble() throws DifferentLengthException {
    double[] a = {1.5, 2.5, 3.5};
    double[] b = {1.2, 2.2};
    exception.expect(DifferentLengthException.class);
    ArrayUtils.dotProd(a, b);
  }
}