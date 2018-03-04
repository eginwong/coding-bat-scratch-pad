/*
Given a list of strings, return a list where each string has "y" added at its start and end.
*/

public List<String> moreY(List<String> strings) {
  return strings.stream().map(n -> "y".concat(n).concat("y")).collect(Collectors.toList())
;}