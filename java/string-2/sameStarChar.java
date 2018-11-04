/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
*/

public boolean bobThere(String str) {
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b') return true;
  }
  return false;
}
