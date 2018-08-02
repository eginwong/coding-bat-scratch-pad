/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)

*/

public boolean shareDigit(int a, int b) {
  int left = a / 10;
  int right = a % 10;
  if (b / 10 == left || b / 10 == right) return true;
  if (b % 10 == left || b % 10 == right) return true;
  return false;
}
