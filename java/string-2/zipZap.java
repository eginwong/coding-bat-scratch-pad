/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
*/

public String zipZap(String str) {
  String result = "";
  int i;
  for (i = 0; i < str.length() - 2; i++) {
    if((str.charAt(i) == 'z') && str.charAt(i + 2) == 'p') {
      result += "zp";
      i += 2;
    } else {
      result += str.substring(i, i+1);
    }
  }
  if (i < str.length()) {
    result += str.substring(i, str.length());
  }
  return result;
}
