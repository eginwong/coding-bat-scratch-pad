/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
*/

public Map<String, String> firstChar(String[] strings) {
  Map<String, String> resultMap = new HashMap<>();
  for(int i =0; i < strings.length; i++){
    if(!resultMap.containsKey(strings[i].substring(0,1))) resultMap.put(strings[i].substring(0,1), strings[i]);
    else resultMap.put(strings[i].substring(0,1), resultMap.get(strings[i].substring(0,1)).concat(strings[i]));
  }
  return resultMap;
}