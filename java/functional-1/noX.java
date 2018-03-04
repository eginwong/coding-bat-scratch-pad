/*
Given a list of strings, return a list where each string has all its "x" removed.
*/

public List<String> noX(List<String> strings) {
  return strings.stream().map(n -> n.replaceAll("x","")).collect(Collectors.toList())
;}