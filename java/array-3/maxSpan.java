/*
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
*/

public int maxSpan(int[] nums) {
  if(nums.length == 0) return 0;
  int maxSpan = 1;
  for (int i = 0; i < nums.length; i++) {
    for(int j = nums.length - 1; j > i; j--) {
      if(nums[i] == nums[j]) {
        int span = j - i + 1;
        if (span > maxSpan) maxSpan = span;
        break;
      }
    }
  }
  return maxSpan;
}