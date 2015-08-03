# ArrayUtils

A bunch of recurrent Java mathematical functions on arrays you are tired to implement again and again.  
The library is made of a single abstract class `ArrayUtils` with a number of static methods.

## Usage

Latest version is `0.1`, corresponding to git tag `v0.1`. Follow instructions below to add it as a dependency to your project.

### Gradle

First add the maven url to the repositories in your `build.gradle`:

```
repositories {
    // Possibly other repos
    maven {
       url "https://dl.bintray.com/mziccard/maven/"
    }
}
```
And then add the library as a dependency:
```
dependencies {
    compile group: 'me.mziccard', name: 'array-utils', version: '0.1'
}
```

### Sbt

Add the bintray maven repository to your resolvers as:
```scala
resolvers += Resolver.bintrayRepo("mziccard", "maven")
```
And then add the library as a dependency:
```scala
libraryDependencies ++= Seq("me.mziccard" %% "array-utils" % "0.1")
```

### Maven
Add the bintray repository to your Maven configuration:
```xml
<repositories>
  <repository>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
    <id>bintray-mziccard-maven</id>
    <name>bintray</name>
      <url>http://dl.bintray.com/mziccard/maven</url>
    </repository>
</repositories>
```
An then add the library as a dependency:
```xml
<dependency>
  <groupId>me.mziccard</groupId>
  <artifactId>array-utils</artifactId>
  <version>0.1</version>
  <type>jar</type>
</dependency>
```

## API

Follows a list of the available static methods, in the following `T` stands for one of `{short, int, long, float, double}`.

- `int[] toInt(short[] arr)`: Convert an array of short values to an array of integer values. Returns a new array.

- `long[] toLong(short[] arr)`: Convert an array of short values to an array of long values. Returns a new array.

- `float[] toFloat(short[] arr)`: Convert an array of short values to an array of float values. Returns a new array.

- `double[] toDouble(short[] arr)`: Convert an array of short values to an array of double values. Returns a new array.

- `long[] toLong(int[] arr)`: Convert an array of integer values to an array of long values. Returns a new array.

- `float[] toFloat(int[] arr)`: Convert an array of integer values to an array of float values. Returns a new array.

- `double[] toDouble(int[] arr)`: Convert an array of integer values to an array of double values. Returns a new array.

- `double[] toDouble(long[] arr)`: Convert an array of long values to an array of double values. Returns a new array.

- `double[] toDouble(float[] arr)`: Convert an array of float values to an array of double values. Returns a new array.

- `int sum(short[] arr)`: Sum an array of short.

- `long sum(int[] arr)`: Sum an array of int.

- `long sum(long[] arr)`: Sum an array of long.

- `double sum(float[] arr)`: Sum an array of float.

- `double sum(double[] arr)`: Sum an array of double.

- `void abs(T[] arr)`: Compute the absolute value for each element in the array, in place.

- `double avg(T[] arr)`: Compute the average value of the array.

- `double median(T[] arr)`: Compute the median value of the array.

- `long[] autoCorrelation(short[] arr)`: Compute the autocorrelation of a short array.

- `long[] autoCorrelation(int[] arr)`: Compute the autocorrelation of a int array.

- `double[] autoCorrelation(float[] arr)`: Compute the autocorrelation of a float array.

- `double[] autoCorrelation(float[] arr)`: Compute the autocorrelation of a double array.

- `T[] sum(T[] arr1, T[] arr2)`: Element-wise sum of two arrays.

- `T[] sub(T[] arr1, T[] arr2)`: Element-wise subtraction of two arrays.

- `T[] mul(T[] arr1, T[] arr2)`: Element-wise multiplication of two arrays.

- `T[] div(T[] arr1, T[] arr2)`: Element-wise division of two arrays.

- `long dotProd(short[] arr1, short[] arr2)`: Dot product of two short arrays.

- `long dotProd(int[] arr1, int[] arr2)`: Dot product of two int arrays.

- `long dotProd(long[] arr1, long[] arr2)`: Dot product of two long arrays.

- `double dotProd(float[] arr1, float[] arr2)`: Dot product of two float arrays.

- `double dotProd(double[] arr1, double[] arr2)`: Dot product of two double arrays.