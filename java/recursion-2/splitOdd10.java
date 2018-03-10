/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
*/

public boolean splitOdd10(int[] nums) {
  return helperSplit(0, nums, 0, 0);
}

public boolean helperSplit(int start, int[] nums, int totalOdd, int totalMod10) {
  // base case: stop when out of numbers!
  if(start == nums.length) {
    if (totalOdd % 2 == 1 && totalMod10 % 10 == 0) return true;
    return false;
  }
  return helperSplit(start + 1, nums, totalOdd + nums[start], totalMod10) 
  || helperSplit(start + 1,nums, totalOdd, totalMod10 + nums[start]);
}