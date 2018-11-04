/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
*/

public String startOz(String str) {
  if(str.length() == 0) return "";
  if(str.startsWith("oz")) return "oz";
  if(str.startsWith("o")) return "o";
  if(str.substring(1,2).equals("z")) return "z";
  return "";
}
