/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
*/

public boolean bobThere(String str) {
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b') return true;
  }
  return false;
}
