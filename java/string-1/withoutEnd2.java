/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
*/

public String withoutEnd2(String str) {
  if(str.length() < 2) return "";
  return str.substring(1,str.length()-1);
}
