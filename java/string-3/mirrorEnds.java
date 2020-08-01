/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
*/

public String mirrorEnds(String string) {
  StringBuilder reverseString = new StringBuilder(); 
  // append a string into StringBuilder input1 
  reverseString.append(string); 
  // reverse StringBuilder reverseString 
  reverseString = reverseString.reverse(); 
  
  StringBuilder res = new StringBuilder();

  for (int counter = 0; counter < string.length(); counter++) {
    if (string.charAt(counter) == reverseString.charAt(counter)) {
      res.append(string.charAt(counter));
    } else {
      break;
    }
  }
  
  return res.toString();
}
