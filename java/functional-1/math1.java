/*
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
*/

public List<Integer> math1(List<Integer> nums) {
  return nums.stream().map(n -> 10* (n + 1)).collect(Collectors.toList());
}