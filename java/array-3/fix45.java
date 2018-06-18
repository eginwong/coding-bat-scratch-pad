/*
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.
*/

public int[] fix34(int[] nums) {
  if(nums.length < 2) return nums;
  int[] result = new int[nums.length];
  // keep track of the positions
  List<Integer> threes = new ArrayList<>();
  List<Integer> fours = new ArrayList<>();
  
  for (int i = 0; i < nums.length; i++) {
    if(nums[i] == 3) threes.add(i);
    if(nums[i] == 4) fours.add(i);
    result[i] = nums[i];
  }
  
  int threeP = 0;
  int fourP = 0;
  
  while(threeP != threes.size() || fourP != fours.size()) {
    int threeLocation = threes.get(threeP);
    int fourLocation = fours.get(fourP);
    if((threeLocation + 1) != fourLocation) {
      int temp = result[threeLocation+1];
      result[threeLocation+1] = result[fourLocation];
      result[fourLocation] = temp;
    }
    threeP++;
    fourP++;
  }

  return result;
}