/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
*/

public String wordEnds(String str, String word) {
  StringBuilder output = new StringBuilder();
  String originalString = str;
  int offSet = 0;

  do {
    int index = str.indexOf(word, offSet);
    if (index > -1) {
      offSet = index + word.length();
      int beforeMatch = index - 1;
      int afterMatch = index + word.length();

      if (beforeMatch >= 0) {
        output.append(str.charAt(beforeMatch));
      }

      if (afterMatch < str.length()) {
        output.append(str.charAt(afterMatch));
      }
    } else {
      if (output.length() > 0) {
        return output.toString();
      } else {
        return "";
      }
    }
  } while (output.length() != originalString.length());

  return output.toString();
}
