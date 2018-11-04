/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
*/

public int close10(int a, int b) {
  int deltaA = Math.abs(10 - a);
  int deltaB = Math.abs(10 - b);
  if(deltaA < deltaB) return a;
  if(deltaB < deltaA) return b;
  return 0;
}
