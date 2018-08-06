/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
*/

public String withoutX2(String str) {
  String copy = str;
  if(copy.length() > 0) {
    if(copy.length() > 1 && copy.charAt(0) == 'x' && copy.charAt(1) == 'x') {
      return copy.substring(2);
    } else if(copy.length() > 1 && copy.charAt(1) == 'x') {
      return copy.substring(0,1) + copy.substring(2);
    } else if(copy.length() > 0 && copy.charAt(0) == 'x') {
      return copy.substring(1);
    }
  }
  return copy;
}
