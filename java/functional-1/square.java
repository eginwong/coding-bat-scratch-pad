/*
Given a list of integers, return a list where each integer is multiplied with itself.
*/

public List<Integer> square(List<Integer> nums) {
  return nums.stream().map(n -> n*n).collect(Collectors.toList());
}