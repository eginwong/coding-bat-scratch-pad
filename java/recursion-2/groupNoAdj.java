/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint: If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. (No loops needed.)
*/

public boolean groupNoAdj(int start, int[] nums, int target) {
  // base case: target less than 0
  if (target < 0) return false;
  // other base case: terminating logic when successful
  if(start >= nums.length) {
    if(target == 0) return true;
    return false;
  }
  
  // recursively cover either case of skipping one and not the other
  return groupNoAdj(start + 1, nums, target) || groupNoAdj(start + 2, nums, target - nums[start]);
}