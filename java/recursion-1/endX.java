/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
*/

public String endX(String str) {
  // base case: when string is empty, stop
  if(str.length() < 1) return str;  
  if(str.charAt(0) == 'x') {
      return endX(str.substring(1)).concat("x");
  }
  return str.substring(0,1).concat(endX(str.substring(1)));
}