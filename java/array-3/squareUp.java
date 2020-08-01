/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
*/

public int[] squareUp(int n) {
  List<Integer> result = new ArrayList<>();
  List<Integer> increment = new ArrayList<>();

  // prefill increment array
  for (int i = 0; i < n; i++) {
    increment.add(0);
  }

  for (int j = 0; j < n; j++) {
    increment.set(n - 1 - j, j + 1);
    result.addAll(increment);
  }

  // utility to convert to int[]
  return result.stream().mapToInt(Integer::intValue).toArray();
}
