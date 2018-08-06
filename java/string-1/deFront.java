/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
*/

public String deFront(String str) {    
  if(str.length() < 2) return str;
  String result = "";
  if(str.substring(0,1).equals("a")) result += "a";
  if(str.substring(1,2).equals("b")) result += "b";
  result += str.substring(2);
  return result;
}
