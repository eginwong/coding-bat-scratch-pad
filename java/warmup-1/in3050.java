/*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
*/

public boolean in3050(int a, int b) {
  if(in30(a) && in30(b)) return true;
  if(in50(a) && in50(b)) return true;
  return false;
}

public boolean in30(int num) {
  return num >= 30 && num <= 40;
}

public boolean in50(int num) {
  return num >= 40 && num <= 50;
}