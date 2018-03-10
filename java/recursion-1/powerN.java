/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
*/

public int powerN(int base, int n) {
  // base case: if no more multiplier, return 1 to maintain the same value.
  if(n == 0) return 1;
  return base * powerN(base, n -1);
}