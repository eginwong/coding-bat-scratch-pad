/*
We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
*/

public boolean dividesSelf(int n) {
  int current = n;
  while (current > 0) {
    int divisor = current % 10;
    if(divisor == 0) return false;
    if(n% divisor != 0) return false;
    current /= 10;
  }
  return true;
}