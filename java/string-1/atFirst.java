/*
Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
*/

public String atFirst(String str) {
  if(str.length() < 2) {
    String copy = str;
    while(copy.length() < 2) {
      copy +="@";
    }
    return copy;
  }
  return str.substring(0,2);
}
