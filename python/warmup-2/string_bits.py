# Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

def string_bits(str):
  ans=''
  for i in range(len(str)):
    if not i%2:
      ans+=str[i]
  return ans