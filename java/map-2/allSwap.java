/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
*/

public String[] allSwap(String[] strings) {
  Map<String, Integer> positionMap = new HashMap<>();
  String[] result = new String[strings.length];
  
  for (int i = 0; i < strings.length; i++) {
    String key = strings[i].substring(0,1);
    if(positionMap.containsKey(key)) {
      // swap strings
      result[i] = strings[positionMap.get(key)];
      result[positionMap.get(key)] = strings[i];
      positionMap.remove(key);
    } else {
      result[i] = strings[i];
      positionMap.put(key, i);
    }
  }
  
  return result;
}