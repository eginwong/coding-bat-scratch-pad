# Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

def string_match(a, b):
  counter = 0
  string_a = len(a)
  string_b = len(b)
  maxNum = 0
  if (string_a > string_b):
    maxNum = string_b
  else:
    maxNum = string_a
    
  for i in range(maxNum - 1):
    a_sub = a[i:i+2]
    b_sub = b[i:i+2]
    if a_sub == b_sub:
      counter += 1
  
  return counter