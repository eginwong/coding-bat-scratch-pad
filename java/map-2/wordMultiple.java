/*
Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.
*/

public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> counterMap = new HashMap<>();
  
  for(int i = 0; i < strings.length; i++) {
    if(counterMap.containsKey(strings[i])) {
      counterMap.put(strings[i], true);
    } else {
      counterMap.put(strings[i], false);
    }
  }
  
  return counterMap;
}