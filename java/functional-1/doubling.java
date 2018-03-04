/*
Given a list of integers, return a list where each integer is multiplied by 2.
*/

public List<Integer> doubling(List<Integer> nums) {
  return nums.stream().map(n -> 2*n).collect(Collectors.toList());
}