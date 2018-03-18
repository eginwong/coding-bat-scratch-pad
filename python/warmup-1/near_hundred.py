# Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

def near_hundred(n):
  if n > 100-11 and n < 100+11 or n > 200-11 and n < 200 + 11:
    return True
  return False