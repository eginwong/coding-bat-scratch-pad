/*
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
*/

public List<Integer> rightDigit(List<Integer> nums) {
  return nums.stream().map(n -> n%10).collect(Collectors.toList());
}