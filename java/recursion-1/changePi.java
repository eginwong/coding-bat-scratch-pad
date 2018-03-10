/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
*/

public String changePi(String str) {
  // base case: no more string left to have enough for pi!
  if (str.length() < 2) return str;
  if(str.substring(0,2).equals("pi")){
    return "3.14".concat(changePi(str.substring(2)));
  }
  return str.substring(0,1).concat(changePi(str.substring(1)));
}