/*
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
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