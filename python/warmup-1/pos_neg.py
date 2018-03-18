# Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

def pos_neg(a, b, negative):
  if negative:
    return (a < 0 and b < 0)
  return ((a > 0 and b < 0) or (a < 0 and b > 0))