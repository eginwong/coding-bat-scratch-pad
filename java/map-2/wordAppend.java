/*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
*/

public String wordAppend(String[] strings) {
  Map<String, Integer> counterMap = new HashMap<>();
  
  String result = "";
  
  for(int i = 0; i < strings.length; i++) {
    if(counterMap.containsKey(strings[i])) {
      counterMap.put(strings[i], counterMap.get(strings[i]) + 1);
    } else {
      counterMap.put(strings[i], 1);
    }
    
    if(counterMap.get(strings[i]) > 0 && counterMap.get(strings[i]) % 2 == 0) {
      result+=strings[i];
    }
  }
  
  return result;
}