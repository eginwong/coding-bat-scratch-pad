/*
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
*/

public List<Integer> no9(List<Integer> nums) {
  return nums.stream().filter(n -> n%10 != 9).collect(Collectors.toList());
}