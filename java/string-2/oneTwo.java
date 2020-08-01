/*
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
*/

public String oneTwo(String str) {
  int pointer = 0;
  String result = "";
  while (pointer < str.length()) {
    int maxLength = (pointer + 3) > str.length() ? str.length() : pointer + 3;
    result += moveAround(str.substring(pointer, maxLength));
    pointer += 3;
  }
  return result;
}

private String moveAround(String str) {
  if(str.length() < 3) return "";
  return str.substring(1, 3) + str.substring(0,1);
}