/*
Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
*/

public List<String> noYY(List<String> strings) {
  return strings.stream().map(x -> x.concat("y")).filter(x -> x.indexOf("yy") == -1).collect(Collectors.toList());
}