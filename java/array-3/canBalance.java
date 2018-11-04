/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
*/

public boolean canBalance(int[] nums) {
  if(nums.length < 2) return false;
  if(nums.length == 2) return nums[0] == nums[1];
  
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    sum += nums[i];
  }
  if (sum % 2 == 1) return false;
  
  int leftSum = sum;
  int rightSum = 0;
  int counter = 0;
  while (leftSum > 0 && rightSum != leftSum && rightSum != sum) {
    leftSum -= nums[counter];
    rightSum += nums[counter];
    counter++;
  }
  return leftSum == rightSum;
}
