/*
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
*/

public int countPairs(String str) {
  // base case: you can't have a pair if you have less than 3 characters
  if (str.length() < 3) return 0;
  
  if(str.charAt(0) == str.charAt(2)) {
    return 1 + countPairs(str.substring(1));
  }
  return countPairs(str.substring(1));
}
