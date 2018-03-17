/*
Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.
*/

public int[] copyEndy(int[] nums, int count) {
  List<Integer> result = new ArrayList<>();
  for(int i = 0; i < nums.length; i++){
    if (isEndy(nums[i])) result.add(nums[i]);
  }
  int[] actual = new int[count];
  for(int j = 0; j < count; j++) {
    actual[j] = result.get(j);
  } 
  return actual;
}

public boolean isEndy(int n) {
  if((n >= 0 && n < 11) ||(n >=90 && n < 101)) return true;
  return false;
}