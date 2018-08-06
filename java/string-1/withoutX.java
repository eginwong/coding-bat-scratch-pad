/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
*/

public String withoutX(String str) {
  if(str.length() < 1) return str;
  String copy = str;
  if(str.substring(0,1).equals("x")) {
    copy = str.substring(1);
  }
  if(copy.length() > 0 && copy.substring(copy.length() - 1).equals("x")) {
    copy = copy.substring(0, copy.length() - 1);
  }
  return copy;
}
