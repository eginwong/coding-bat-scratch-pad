/*
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
*/

public List<String> lower(List<String> strings) {
  return strings.stream().map(n -> n.toLowerCase()).collect(Collectors.toList());
}