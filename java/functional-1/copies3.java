/*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
*/

public List<String> copies3(List<String> strings) {
  return strings.stream().map(n -> n.concat(n.concat(n)))
  .collect(Collectors.toList());
}