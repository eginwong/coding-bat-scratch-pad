/*
Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen. (No loops needed.)
*/

public boolean groupSum6(int start, int[] nums, int target) {
  if(target < 0) return false;
  if(start >= nums.length) {
    if(target == 0) return true;
    return false;
  }
  if(nums[start] % 6 == 0) {
      return groupSum6(start+1, nums, target-nums[start]);
  } else {
      // cover either case of using and not using the value
      return groupSum6(start+1, nums, target) 
      || groupSum6(start+1, nums, target - nums[start]);
  }
}