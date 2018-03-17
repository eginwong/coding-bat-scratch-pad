/*
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
*/

public String[] wordsFront(String[] words, int n) {
  return Arrays.copyOfRange(words, 0, n); 
}