/*
Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
*/

public String allStar(String str) {
  // base case: no star on the last character
  if(str.length() < 2) return str;
  return str.substring(0,1).concat("*" + allStar(str.substring(1)));
}