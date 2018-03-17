/*
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
*/

public List wordsWithoutList(String[] words, int len) {
  List<String> result = new ArrayList<>();
  for(int i = 0; i < words.length; i++) {
    if(words[i].length() != len) result.add(words[i]);
  }
  return result;
}