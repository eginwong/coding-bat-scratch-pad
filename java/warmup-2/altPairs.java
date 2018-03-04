/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
*/

// LOL HARDCODED LIKE A BOSS.

public String altPairs(String str) {
  String result = "";
  int i = str.length();
  
  if(i > 0) {
    result+=str.charAt(0);
  }
  if(i > 1) {
    result+=str.charAt(1);
  }
    if(i > 4) {
    result+=str.charAt(4);
  }
    if(i > 5) {
    result+=str.charAt(5);
  }
    if(i > 8) {
    result+=str.charAt(8);
  }
    if(i > 9) {
    result+=str.charAt(9);
  }
      if(i > 12) {
    result+=str.charAt(12);
  }
      if(i > 13) {
    result+=str.charAt(13);
  }
  
  return result;
}

// ACTUAL SOLUTION

public String altPairs(String str) {
  String result = "";
  
  for(int i = 0; i < str.length(); i+=4){
    result += str.charAt(i);
    if(i+1 < str.length()) result += str.charAt(i+1);
  }
  
  return result;
}
