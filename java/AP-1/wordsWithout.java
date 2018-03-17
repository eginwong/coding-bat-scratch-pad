/*
Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
*/

public String[] wordsWithout(String[] words, String target) {
  List<String> result = new ArrayList<>();
  for(int i = 0; i < words.length; i++) {
    if(!words[i].equals(target)) result.add(words[i]);
  }
  String[] actual = new String[result.size()];
  for(int j = 0; j < result.size(); j++) {
    actual[j] = result.get(j);
  } 
  return actual;
}