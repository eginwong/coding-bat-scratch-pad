/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.
*/

public String noX(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x') {
    return noX(str.substring(1,str.length()));
  }
  return str.substring(0,1).concat(noX(str.substring(1,str.length())));
}
