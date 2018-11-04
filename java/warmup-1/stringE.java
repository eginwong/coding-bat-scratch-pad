/*
Return true if the given string contains between 1 and 3 'e' chars.
*/

public boolean stringE(String str) {
  int totalE = 0;
  char[] characters = str.toCharArray();
  
  for(char c: characters) {
    if(c == 'e') totalE++;
  }
  return totalE >= 1 && totalE <= 3;
}
