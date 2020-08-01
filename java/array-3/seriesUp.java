/*
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
*/

public int[] seriesUp(int n) {
  List<Integer> result = new ArrayList<>();
  List<Integer> increment = new ArrayList<>();

  for (int j = 0; j < n; j++) {
    increment.add(j + 1);
    result.addAll(increment);
  }

  // utility to convert to int[]
  return result.stream().mapToInt(Integer::intValue).toArray();
}
