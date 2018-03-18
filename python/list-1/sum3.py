# Given an array of ints length 3, return the sum of all the elements.

def sum3(nums):
  sum = 0
  for i in xrange(0, len(nums)):
    sum += nums[i]
  return sum