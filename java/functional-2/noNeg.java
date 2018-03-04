/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.
*/

public List<Integer> noNeg(List<Integer> nums) {
  return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
}