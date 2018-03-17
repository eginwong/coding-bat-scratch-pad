/*
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
*/

public boolean hasOne(int n) {
  int current = n;
  while (current > 0) {
    int sliced = current % 10; 
    current /= 10;
    if(sliced == 1) return true;
  }
  return false;
}