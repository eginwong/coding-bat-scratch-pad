/*
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
*/

public String plusOut(String str, String word) {
  StringBuilder output = new StringBuilder();
  String originalString = str;

  do {
    int index = str.indexOf(word);
    if (index > -1) {
      // add as many missing +
      for(int i = 0; i < index; i++) {
        output.append("+");
      }
      output.append(word);
      str = str.substring(index + word.length(), str.length());
    } else {
      for(int i = 0; i < str.length(); i++) {
        output.append("+");
      }
    }
  } while (output.length() != originalString.length());

  return output.toString();
}
