/*
Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.
*/

public Map<String, String> pairs(String[] strings) {
  Map<String, String> resultMap = new HashMap<>();
  for(int i = 0; i < strings.length; i++) {
    resultMap.put(strings[i].substring(0,1), strings[i].substring(strings[i].length() - 1));
  }
  return resultMap;
}