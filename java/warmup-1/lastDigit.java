/*
Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
*/

public String endUp(String str) {
  if(str.length() <=3) return str.toUpperCase();
  return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
}
