/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
*/

public boolean xyzThere(String str) {
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.charAt(i) == '.') {
      i += 1;
    } else if(str.substring(i, i + 3).equals("xyz")) {
      return true;
    }
  }
  return false;
}
