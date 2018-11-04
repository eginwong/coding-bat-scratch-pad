/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
*/

public int max1020(int a, int b) {
  if(in20(a) && in20(b)) {
    if(a > b) return a;
    return b;
  } else if(in20(a) && !in20(b)) { 
    return a;
  } else if(!in20(a) && in20(b)) {
    return b;
  }
  return 0;
}

public boolean in20(int num) {
  return num >= 10 && num <= 20;
}