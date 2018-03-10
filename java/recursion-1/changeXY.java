/*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
*/

public String changeXY(String str) {
  // base case: no more string left
  if(str.length() < 1) return str;
  if(str.substring(0,1).equals("x")) return "y".concat(changeXY(str.substring(1)));
  return str.substring(0,1).concat(changeXY(str.substring(1)));
}