/*
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
*/

public String starOut(String str) {
  int i;
  String result = "";
  for (i = 0; i < str.length() - 1; i++) {
    if(str.charAt(i) == '*') {
      if (str.charAt(i + 1) == '*') {
        // do nothing
      } else {
        i++; // skip one and then skip another
      }
    } else { // current character is good
      if(str.charAt(i + 1) == '*') { // next char is wildcard
        // do nothing
      } else {
        result += str.substring(i, i+1);
      }
    }
  }
  if (i < str.length() && str.charAt(str.length() - 1) != '*') result += str.substring(i);
  return result;
}
