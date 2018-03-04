/*
Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
*/

public List<Integer> two2(List<Integer> nums) {
  return nums.stream().map(x -> 2*x).filter(x -> x%10 != 2).collect(Collectors.toList());
}