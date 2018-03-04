/*
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
*/

public int strDist(String str, String sub) {
  if(str.indexOf(sub) == -1) return 0;
  return sub.length() + str.lastIndexOf(sub) - str.indexOf(sub);
}
