/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
*/

public boolean splitArray(int[] nums) {
  return helperSplit(0, nums, 0, 0);
}

public boolean helperSplit(int start, int[] nums, int total1, int total2) {
  // base case: stop when out of numbers!
  if(start == nums.length) {
    if (total1 == total2) return true;
    return false;
  }
  return helperSplit(start + 1, nums, total1, total2 + nums[start])
    || helperSplit(start + 1, nums, total1 + nums[start], total2);
}