/*
Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
*/

public int commonTwo(String[] a, String[] b) {
  int common = 0;
  List<String> matched = new ArrayList<>();
  int aCounter = 0;
  int bCounter = 0;
  while (aCounter != a.length && bCounter != b.length) {
    int comparison = a[aCounter].compareTo(b[bCounter]);
    if(comparison > 0) {
      bCounter++;
    } else if(comparison < 0) {
      aCounter++;
    } else {
      if(!matched.contains(a[aCounter])) {
        matched.add(a[aCounter]);
        common++;
      }
      aCounter++;
    }
  }
  return common;
}