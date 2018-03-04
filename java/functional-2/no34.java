/*
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
*/

public List<String> no34(List<String> strings) {
  return strings.stream().filter(n -> n.length() != 4 && n.length() != 3).collect(Collectors.toList());
}