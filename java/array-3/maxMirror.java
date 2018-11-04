/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
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