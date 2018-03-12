/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
*/

public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> resultMap = new HashMap<>();
  for(int i = 0; i < strings.length; i++) {
    resultMap.put(strings[i], strings[i].length());
  }
  return resultMap;
}