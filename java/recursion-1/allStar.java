/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".
*/

public String allStar(String str) {
  // base case: no star on the last character
  if(str.length() < 2) return str;
  return str.substring(0,1).concat("*" + allStar(str.substring(1)));
}