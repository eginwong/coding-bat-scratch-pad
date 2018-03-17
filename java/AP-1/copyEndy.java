/*
We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.
*/

public int[] copyEvens(int[] nums, int count) {
  List<Integer> result = new ArrayList<>();
  for(int i = 0; i < nums.length; i++){
    if (nums[i] % 2 == 0) result.add(nums[i]);
  }
  int[] actual = new int[count];
  for(int j = 0; j < count; j++) {
    actual[j] = result.get(j);
  } 
  return actual;
}