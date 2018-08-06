/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
*/

public String lastChars(String a, String b) {
  return getFirstSubstring(a) + getLastSubstring(b);
}

private String getFirstSubstring(String input) {
  if(input.length() < 1) {
    return "@";
  }
  return input.substring(0,1);
}

private String getLastSubstring(String input) {
  if(input.length() < 1) {
    return "@";
  }
  return input.substring(input.length() - 1);
}
