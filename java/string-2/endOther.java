/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
*/

public boolean endOther(String a, String b) {
  String other = a.length() > b.length() ? b : a;
  String checkAgainst = a.length() > b.length() ? a : b;
  other = other.toLowerCase();
  checkAgainst = checkAgainst.toLowerCase();

  return checkAgainst.substring(checkAgainst.length() - other.length()).equals(other);
}
