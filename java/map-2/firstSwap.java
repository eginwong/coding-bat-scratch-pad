/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
*/

public String[] firstSwap(String[] strings) {
  Map<String, Integer> positionMap = new HashMap<>();
  String[] result = new String[strings.length];
  
  for (int i = 0; i < strings.length; i++) {
    String key = strings[i].substring(0,1);
    if(positionMap.containsKey(key)) {
      if(positionMap.get(key) != null) {
      // swap strings
        result[i] = strings[positionMap.get(key)];
        result[positionMap.get(key)] = strings[i];
        positionMap.put(key, null);
      } else {
        result[i] = strings[i];
      }
    } else {
      result[i] = strings[i];
      positionMap.put(key, i);
    }
  }
  
  return result;
}