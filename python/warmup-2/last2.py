# Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

def last2(str):
  substring = str[-2:]
  count = 0
  for i in range(len(str)):
    if not i == 0:
      if str[i-1]+str[i] == substring:
        count+=1
  if count == 0: return 0
  return count-1