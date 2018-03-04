/*
Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
*/

public List<Integer> square56(List<Integer> nums) {
  return nums.stream().map(n -> n*n + 10).filter(n -> n%10 != 6 && n%10 !=5 ).collect(Collectors.toList());
}