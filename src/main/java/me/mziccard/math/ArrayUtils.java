package me.mziccard.math;

import java.util.Arrays;

public abstract class ArrayUtils {

  private static void checkEqualLength(short[] arr1, short[] arr2)
    throws DifferentLengthException {
      if (arr1.length != arr2.length) {
        throw new DifferentLengthException();
      }
  }

  private static void checkEqualLength(int[] arr1, int[] arr2)
    throws DifferentLengthException {
      if (arr1.length != arr2.length) {
        throw new DifferentLengthException();
      }
  }

  private static void checkEqualLength(long[] arr1, long[] arr2)
    throws DifferentLengthException {
      if (arr1.length != arr2.length) {
        throw new DifferentLengthException();
      }
  }

  private static void checkEqualLength(float[] arr1, float[] arr2)
    throws DifferentLengthException {
      if (arr1.length != arr2.length) {
        throw new DifferentLengthException();
      }
  }

  private static void checkEqualLength(double[] arr1, double[] arr2)
    throws DifferentLengthException {
      if (arr1.length != arr2.length) {
        throw new DifferentLengthException();
      }
  }

  /**
   * Converts an array of short values to an array of integer values. Returns a
   * new array.
   *
   * @param   arr a short array
   * @return  an integer array
   */
  public static int[] toInt(short[] arr) {
    int n = arr.length;
    int[] converted = new int[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Converts an array of short values to an array of long values. Returns a
   * new array.
   *
   * @param   arr a short array
   * @return  a long array
   */
  public static long[] toLong(short[] arr) {
    int n = arr.length;
    long[] converted = new long[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Converts an array of short values to an array of float values. Returns a new
   * array.
   *
   * @param   arr a short array
   * @return  a float array
   */
  public static float[] toFloat(short[] arr) {
    int n = arr.length;
    float[] converted = new float[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Converts an array of short values to an array of double values. Returns a
   * new array.
   *
   * @param   arr a short array
   * @return  a double array
   */
  public static double[] toDouble(short[] arr) {
    int n = arr.length;
    double[] converted = new double[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Converts an array of integer values to an array of long values. Returns a
   * new array.
   *
   * @param   arr an integer array
   * @return  a long array
   */
  public static long[] toLong(int[] arr) {
    int n = arr.length;
    long[] converted = new long[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Converts an array of integer values to an array of float values. Returns a
   * new array.
   *
   * @param   arr an integer array
   * @return  a float array
   */
  public static float[] toFloat(int[] arr) {
    int n = arr.length;
    float[] converted = new float[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Converts an array of integer values to an array of double values. Returns 
   * a new array.
   *
   * @param   arr an integer array
   * @return  a double array
   */
  public static double[] toDouble(int[] arr) {
    int n = arr.length;
    double[] converted = new double[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Converts an array of long values to an array of double values. Returns 
   * a new array.
   *
   * @param   arr a long array
   * @return  a double array
   */
  public static double[] toDouble(long[] arr) {
    int n = arr.length;
    double[] converted = new double[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Converts an array of float values to an array of double values. Returns 
   * a new array.
   *
   * @param   arr a flaot array
   * @return  a double array
   */
  public static double[] toDouble(float[] arr) {
    int n = arr.length;
    double[] converted = new double[n];
    for (int i = 0; i < n; i++) {
      converted[i] = arr[i];
    }
    return converted;
  }

  /**
   * Returns the sum of a short array.
   *
   * @param   arr a short array
   * @return  the sum of the elements in the provided array as an int value
   */
  public static int sum(short[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  
  /**
   * Returns the sum of an integer array.
   *
   * @param   arr an integer array
   * @return  the sum of the elements in the provided array as a long value
   */
  public static long sum(int[] arr) {
    long sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  /**
   * Returns the sum of a long array.
   *
   * @param   arr a long array
   * @return  the sum of the elements in the provided array as a long value
   */
  public static long sum(long[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  /**
   * Returns the sum of a float array.
   *
   * @param   arr a float array
   * @return  the sum of the elements in the provided array as a double value
   */
  public static double sum(float[] arr) {
    double sum = 0.0f;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  /**
   * Returns the sum of a double array.
   *
   * @param   arr a double array
   * @return  the sum of the elements in the provided array
   */
  public static double sum(double[] arr) {
    double sum = 0.0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  /**
   * Computes the absolute value for each element in the array, in place.
   *
   * @param   arr a short array
   */
  public static void abs(short[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (short)Math.abs(arr[i]);
    }
  }


  /**
   * Computes the absolute value for each element in the array, in place.
   *
   * @param   arr an integer array
   */
  public static void abs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Math.abs(arr[i]);
    }
  }

  /**
   * Computes the absolute value for each element in the array, in place.
   *
   * @param   arr a long array
   */
  public static void abs(long[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Math.abs(arr[i]);
    }
  }

  /**
   * Computes the absolute value for each element in the array, in place.
   *
   * @param   arr a float array
   */
  public static void abs(float[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Math.abs(arr[i]);
    }
  }

  /**
   * Computes the absolute value for each element in the array, in place.
   *
   * @param   arr a float array
   */
  public static void abs(double[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Math.abs(arr[i]);
    }
  }

  /**
   * Returns the average value of a short array.
   *
   * @param   arr a short array
   * @return  the average value of the array as a double
   */
  public static double avg(short[] arr) {
    return ((double)sum(arr))/arr.length;
  }

  /**
   * Returns the average value of an integer array.
   *
   * @param   arr an integer array
   * @return  the average value of the array as a double
   */
  public static double avg(int[] arr) {
    return ((double)sum(arr))/arr.length;
  }

  /**
   * Returns the average value of a long array.
   *
   * @param   arr a long array
   * @return  the average value of the array as a double
   */
  public static double avg(long[] arr) {
    return ((double)sum(arr))/arr.length;
  }

  /**
   * Returns the average value of a float array.
   *
   * @param arr a float array
   * @return the average value of the array as a double
   */
  public static double avg(float[] arr) {
    return sum(arr)/arr.length;
  }

  /**
   * Returns the average value of an double array.
   *
   * @param   arr a double array
   * @return  the average value of the array as a double
   */
  public static double avg(double[] arr) {
    return sum(arr)/arr.length;
  }

  /**
   * Returns the median value of a short array. The method sorts the input
   * array. If the array has odd length the median is the central value 
   * arr[arr.length/2]. If the array has even length the median is the average
   * of the two central values arr[(arr.length/2)-1]+arr[arr.length/2])/2. 
   *
   * @param   arr a short array
   * @return  the median value of the array as a double
   */
  public static double median(short[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int mid = n/2;
    double median = arr[mid];
    if ((n & 0x1) == 0) {
      median = (median + arr[mid-1])/2;
    }
    return median;
  }

  /**
   * Returns the median value of an integer array. The method sorts the input
   * array. If the array has odd length the median is the central value 
   * arr[arr.length/2]. If the array has even length the median is the average
   * of the two central values arr[(arr.length/2)-1]+arr[arr.length/2])/2. 
   *
   * @param   arr an integer array
   * @return  the median value of the array as a double
   */
  public static double median(int[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int mid = n/2;
    double median = arr[mid];
    if ((n & 0x1) == 0) {
      median = (median + arr[mid-1])/2;
    }
    return median;
  }

  /**
   * Returns the median value of a long array. The method sorts the input
   * array. If the array has odd length the median is the central value 
   * arr[arr.length/2]. If the array has even length the median is the average
   * of the two central values arr[(arr.length/2)-1]+arr[arr.length/2])/2. 
   *
   * @param   arr a long array
   * @return  the median value of the array as a double
   */
  public static double median(long[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int mid = n/2;
    double median = arr[mid];
    if ((n & 0x1) == 0) {
      median = (median + arr[mid-1])/2;
    }
    return median;
  }

  /**
   * Returns the median value of a float array. The method sorts the input
   * array. If the array has odd length the median is the central value 
   * arr[arr.length/2]. If the array has even length the median is the average
   * of the two central values arr[(arr.length/2)-1]+arr[arr.length/2])/2. 
   *
   * @param   arr a float array
   * @return  the median value of the array as a double
   */
  public static double median(float[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int mid = n/2;
    double median = arr[mid];
    if ((n & 0x1) == 0) {
      median = (median + arr[mid-1])/2;
    }
    return median;
  }

  /**
   * Returns the median value of a double array. The method sorts the input
   * array. If the array has odd length the median is the central value 
   * arr[arr.length/2]. If the array has even length the median is the average
   * of the two central values arr[(arr.length/2)-1]+arr[arr.length/2])/2. 
   *
   * @param   arr  a double array
   * @return  the median value of the array as a double
   */
  public static double median(double[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    int mid = n/2;
    double median = arr[mid];
    if ((n & 0x1) == 0) {
      median = (median + arr[mid-1])/2;
    }
    return median;
  }

  /**
   * Computes the autocorrelation of a short array with the brute force
   * approach (O(n^2)).
   *
   * @param   arr a short array
   * @return  the autocorrelation array as an array of long values
   */
  public static long[] autoCorrelation(short[] arr) {
    int n = arr.length;
    long[] corr = new long[n];
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        if (i+k < n) {
          corr[k] += arr[i]*arr[i+k];
        }
      }
    }
    return corr;
  }

  /**
   * Computes the autocorrelation of an integer array with the brute force
   * approach (O(n^2)).
   *
   * @param   arr an integer array
   * @return  the autocorrelation array as an array of long values
   */
  public static long[] autoCorrelation(int[] arr) {
    int n = arr.length;
    long[] corr = new long[n];
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        if (i+k < n) {
          corr[k] += arr[i]*arr[i+k];
        }
      }
    }
    return corr;
  }

  /**
   * Computes the autocorrelation of a long array with the brute force approach
   * (O(n^2)).
   *
   * @param   arr a long array
   * @return  the autocorrelation array as an array of long values
   */
  public static long[] autoCorrelation(long[] arr) {
    int n = arr.length;
    long[] corr = new long[n];
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        if (i+k < n) {
          corr[k] += arr[i]*arr[i+k];
        }
      }
    }
    return corr;
  }

  /**
   * Computes the autocorrelation of a float array with the brute force
   * approach (O(n^2)).
   *
   * @param   arr a float array
   * @return  the autocorrelation array as an array of double values
   */
  public static double[] autoCorrelation(float[] arr) {
    int n = arr.length;
    double[] corr = new double[n];
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        if (i+k < n) {
          corr[k] += arr[i]*arr[i+k];
        }
      }
    }
    return corr;
  }

  /**
   * Computes the autocorrelation of a double array with the brute force
   * approach (O(n^2)).
   *
   * @param   arr a double array
   * @return  the autocorrelation array as an array of double values
   */
  public static double[] autoCorrelation(double[] arr) {
    int n = arr.length;
    double[] corr = new double[n];
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        if (i+k < n) {
          corr[k] += arr[i]*arr[i+k];
        }
      }
    }
    return corr;
  }

  /**
   * Performs the element-wise sum of two short arrays.
   *
   * @param   arr1 a short array
   * @param   arr2 a short array
   * @return  a short array that is the element-wise sum of {@code arr1} and
   * {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static short[] sum(short[] arr1, short[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      short[] sum = new short[n];
      for (int i = 0; i < n; i++) {
        sum[i] = (short)(arr1[i] + arr2[i]);
      }
      return sum;
  }

  /**
   * Performs the element-wise sum of two integer arrays.
   *
   * @param   arr1 an integer array
   * @param   arr2 an integer array
   * @return  an integer array that is the element-wise sum of {@code arr1} and
   * {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static int[] sum(int[] arr1, int[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      int[] sum = new int[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise sum of two long arrays.
   *
   * @param   arr1 a long array
   * @param   arr2 a long array
   * @return  a long array that is the element-wise sum of {@code arr1} and
   * {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static long[] sum(long[] arr1, long[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      long[] sum = new long[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise sum of two float arrays.
   *
   * @param   arr1 a float array
   * @param   arr2 a float integer array
   * @return  a float array that is the element-wise sum of {@code arr1} and
   * {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static float[] sum(float[] arr1, float[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      float[] sum = new float[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise sum of two double arrays.
   *
   * @param   arr1 a double array
   * @param   arr2 a double integer array
   * @return  a double array that is the element-wise sum of {@code arr1} and
   * {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static double[] sum(double[] arr1, double[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      double[] sum = new double[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise subtraction of two short arrays.
   *
   * @param   arr1 a short array
   * @param   arr2 a short array
   * @return  a short array that is the element-wise subtraction of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static short[] sub(short[] arr1, short[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      short[] sum = new short[n];
      for (int i = 0; i < n; i++) {
        sum[i] = (short)(arr1[i] - arr2[i]);
      }
      return sum;
  }

  /**
   * Performs the element-wise subtraction of two integer arrays.
   *
   * @param   arr1 an integer array
   * @param   arr2 an integer array
   * @return  an integer array that is the element-wise subtraction of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static int[] sub(int[] arr1, int[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      int[] sum = new int[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] - arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise subtraction of two long arrays.
   *
   * @param   arr1 a long array
   * @param   arr2 a long array
   * @return  a long array that is the element-wise subtraction of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static long[] sub(long[] arr1, long[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      long[] sum = new long[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] - arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise subtraction of two float arrays.
   *
   * @param   arr1 a float array
   * @param   arr2 a float array
   * @return  a float array that is the element-wise subtraction of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static float[] sub(float[] arr1, float[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      float[] sum = new float[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] - arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise subtraction of two double arrays.
   *
   * @param   arr1 a double array
   * @param   arr2 a double array
   * @return  a double array that is the element-wise subtraction of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static double[] sub(double[] arr1, double[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      double[] sum = new double[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] - arr2[i];
      }
      return sum;
  }


  /**
   * Performs the element-wise multiplication of two short arrays.
   *
   * @param   arr1 a short array
   * @param   arr2 a short array
   * @return  a short array that is the element-wise multiplication of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static short[] mul(short[] arr1, short[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      short[] sum = new short[n];
      for (int i = 0; i < n; i++) {
        sum[i] = (short)(arr1[i] * arr2[i]);
      }
      return sum;
  }

  /**
   * Performs the element-wise multiplication of two integer arrays.
   *
   * @param   arr1 an integer array
   * @param   arr2 an integer array
   * @return  an integer array that is the element-wise multiplication of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static int[] mul(int[] arr1, int[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      int[] sum = new int[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] * arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise multiplication of two long arrays.
   *
   * @param   arr1 a long array
   * @param   arr2 a long array
   * @return  a long array that is the element-wise multiplication of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static long[] mul(long[] arr1, long[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      long[] sum = new long[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] * arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise multiplication of two float arrays.
   *
   * @param   arr1 a float array
   * @param   arr2 a float array
   * @return  a float array that is the element-wise multiplication of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static float[] mul(float[] arr1, float[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      float[] sum = new float[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] * arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise multiplication of two double arrays.
   *
   * @param   arr1 a double array
   * @param   arr2 a double array
   * @return  a double array that is the element-wise multiplication of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static double[] mul(double[] arr1, double[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      double[] sum = new double[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] * arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise division of two short arrays.
   *
   * @param   arr1 a short array
   * @param   arr2 a short array
   * @return  a short array that is the element-wise division of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static short[] div(short[] arr1, short[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      short[] sum = new short[n];
      for (int i = 0; i < n; i++) {
        sum[i] = (short)(arr1[i] / arr2[i]);
      }
      return sum;
  }

  /**
   * Performs the element-wise division of two integer arrays.
   *
   * @param   arr1 an integer array
   * @param   arr2 an integer array
   * @return  an integer array that is the element-wise division of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static int[] div(int[] arr1, int[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      int[] sum = new int[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] / arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise division of two long arrays.
   *
   * @param   arr1 a long array
   * @param   arr2 a long array
   * @return  a long array that is the element-wise division of
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static long[] div(long[] arr1, long[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      long[] sum = new long[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] / arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise division of two float arrays.
   *
   * @param   arr1 a float array
   * @param   arr2 a float array
   * @return  a float array that is the element-wise division of {@code arr1}
   * and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static float[] div(float[] arr1, float[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      float[] sum = new float[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] / arr2[i];
      }
      return sum;
  }

  /**
   * Performs the element-wise division of two double arrays.
   *
   * @param   arr1 a double array
   * @param   arr2 a double array
   * @return  a double array that is the element-wise division of {@code arr1}
   * and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static double[] div(double[] arr1, double[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      int n = arr1.length;
      double[] sum = new double[n];
      for (int i = 0; i < n; i++) {
        sum[i] = arr1[i] / arr2[i];
      }
      return sum;
  }

  /**
   * Performs the dot product (i.e. the inner product) of two short arrays.
   *
   * @param   arr1 a short array
   * @param   arr2 a short array
   * @return  the dot product (i.e. inner product) of the two arrays
   * {@code arr1} and {@code arr2} as a long value.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static long dotProd(short[] arr1, short[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      long prod = 0;
      for (int i = 0; i < arr1.length; i++) {
        prod += arr1[i] * arr2[i];
      }
      return prod;
  }

  /**
   * Performs the dot product (i.e. the inner product) of two integer arrays.
   *
   * @param   arr1 an integer array
   * @param   arr2 an integer array
   * @return  the dot product (i.e. inner product) of the two arrays
   * {@code arr1} and {@code arr2} as a long value.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static long dotProd(int[] arr1, int[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      long prod = 0;
      for (int i = 0; i < arr1.length; i++) {
        prod += arr1[i] * arr2[i];
      }
      return prod;
  }

  /**
   * Performs the dot product (i.e. the inner product) of two long arrays.
   *
   * @param   arr1 a long array
   * @param   arr2 a long array
   * @return  the dot product (i.e. inner product) of the two arrays
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static long dotProd(long[] arr1, long[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      long prod = 0;
      for (int i = 0; i < arr1.length; i++) {
        prod += arr1[i] * arr2[i];
      }
      return prod;
  }

  /**
   * Performs the dot product (i.e. the inner product) of two float arrays.
   *
   * @param   arr1 a float array
   * @param   arr2 a float array
   * @return  the dot product (i.e. inner product) of the two arrays
   * {@code arr1} and {@code arr2} as a double value.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static double dotProd(float[] arr1, float[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      double prod = 0.0f;
      for (int i = 0; i < arr1.length; i++) {
        prod += arr1[i] * arr2[i];
      }
      return prod;
  }

  /**
   * Performs the dot product (i.e. the inner product) of two double arrays.
   *
   * @param   arr1 a double array
   * @param   arr2 a double array
   * @return  the dot product (i.e. inner product) of the two arrays
   * {@code arr1} and {@code arr2}.
   * @throws  DifferentLengthException if the two arrays have different length
   */
  public static double dotProd(double[] arr1, double[] arr2) 
    throws DifferentLengthException {
      checkEqualLength(arr1, arr2);
      double prod = 0.0;
      for (int i = 0; i < arr1.length; i++) {
        prod += arr1[i] * arr2[i];
      }
      return prod;
  }
}
