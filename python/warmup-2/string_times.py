# Given a string and a non-negative int n, return a larger string that is n copies of the original string.

def string_times(str, n):
  ans = ''
  for i in range(n):
    ans+=str
  return ans