/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
*/

public boolean nearHundred(int n) {
  if((Math.abs(n - 100) < 11) || (Math.abs(n-200) < 11)) return true;
  return false;
}