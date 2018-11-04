/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
*/

public boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;
  
  for(int i = 0; i < str.length() - 2; i++) {
    String check = str.substring(i, i + 3);
    if(check.equals("cat")) {
      catCount++;
      i += 2;
    } else if(check.equals("dog")) {
      dogCount++;
      i += 2;
    }
  }
  return catCount == dogCount;
}
