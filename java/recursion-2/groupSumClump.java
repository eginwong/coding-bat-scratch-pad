/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target, with this additional constraint: if there are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group. (one loop can be used to find the extent of the identical values).
*/

public boolean groupSumClump(int start, int[] nums, int target) {
  // base case: target less than 0
  if (target < 0) return false;
  // other base case: terminating logic when successful
  if(start >= nums.length) {
    if(target == 0) return true;
    return false;
  }
  
  int current = nums[start];
  int index = start;
  int next = nums[index];
  while(current == next) {
    // stop if over nums.length
    index++;
    if (index < nums.length) {
      next = nums[index];
    }
    else {
      // put the brakes on
      next = -1;
    }
  }
  
  // return both options with clump and skipping clump
  return groupSumClump(index, nums, target - (index-start)*current)
    || groupSumClump(index, nums, target);
}
