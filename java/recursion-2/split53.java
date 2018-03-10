/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)
*/

public boolean split53(int[] nums) {
  return helperSplit(0, nums, 0, 0);
}

public boolean helperSplit(int start, int[] nums, int totalMod5, int totalMod3) {
  // base case: stop when out of numbers!
  if(start == nums.length) {
    if (totalMod5 == totalMod3) return true;
    return false;
  }
  
  if(nums[start]%5 == 0) {
    return helperSplit(start+1, nums, totalMod5 + nums[start], totalMod3);
  }
  if(nums[start]%3 == 0) {
    return helperSplit(start+1, nums, totalMod5, totalMod3 + nums[start]);
  }
  return helperSplit(start+1, nums, totalMod5 + nums[start], totalMod3)
    || helperSplit(start + 1, nums, totalMod5, totalMod3 + nums[start]);
}