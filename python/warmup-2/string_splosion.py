Given a non-empty string like "Code" return a string like "CCoCodCode".

def string_splosion(str):
  ans=''
  for i in range(len(str)+1):
    ans+=str[:i]
  return ans