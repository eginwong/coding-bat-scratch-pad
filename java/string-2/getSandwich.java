/*
A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
*/

public String getSandwich(String str) {
  int firstBread = str.indexOf("bread");
  int secondBread = str.lastIndexOf("bread");
  if (firstBread != secondBread) {
    return str.substring(firstBread + 5, secondBread);
  }
  return "";
}