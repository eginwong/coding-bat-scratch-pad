/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
*/

public boolean sameStarChar(String str) {
  int pointer = 0;
  int endingPointer = str.lastIndexOf("*");
  
  while(pointer != endingPointer) {
    pointer = str.indexOf("*", pointer + 1);
    if(pointer >= 0 && pointer < str.length() - 1) {
      if(str.charAt(pointer - 1) != str.charAt(pointer + 1)) {
        return false;
      }
    }
  }
  return true;
}
