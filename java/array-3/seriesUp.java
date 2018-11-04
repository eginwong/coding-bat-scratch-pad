/*
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
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