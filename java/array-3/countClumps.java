/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
*/

public int countClumps(int[] nums) {
  int clumpCount = 0;

  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == nums[i + 1]) {
      clumpCount++;
      for (int clumpCont = i + 1; clumpCont < nums.length && nums[clumpCont] == nums[i]; i++, clumpCont++) {
        // continue while next num is same as previous clump number
      }
    }
  }

  return clumpCount;
}
