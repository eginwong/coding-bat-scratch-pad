/*
Given a non-empty string like "Code" return a string like "CCoCodCode".
*/

public String stringSplosion(String str) {
  String returnStr = "";
  String compiledStr = "";
  for(char a : str.toCharArray()) {
    compiledStr += a;
    returnStr += compiledStr;
  }
  return returnStr;
}