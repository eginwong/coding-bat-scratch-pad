/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
*/

public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> resultMap = new HashMap<>();
  for(int i =0; i < strings.length; i++){
    if(!resultMap.containsKey(strings[i])) resultMap.put(strings[i], 1);
    else resultMap.put(strings[i], resultMap.get(strings[i]) + 1);
  }
  return resultMap;
}