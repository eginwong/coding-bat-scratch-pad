/*
Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.
*/

public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] result = new String[n];
  int aCounter = 0;
  int bCounter = 0;
  int mergedCounter = 0;
  while (mergedCounter != n) {
    if(aCounter == a.length) {
      result[mergedCounter] = b[bCounter];
      bCounter++;
    } else if (bCounter == b.length) {
      result[mergedCounter] = a[aCounter];
      aCounter++;
    } else {
      int compare = a[aCounter].compareTo(b[bCounter]);
      if(compare > 0) {
        result[mergedCounter] = b[bCounter];
        bCounter++;
      } else if (compare < 0) {
        result[mergedCounter] = a[aCounter];
        aCounter++;
      } else {
        // skip duplicates
        result[mergedCounter] = a[aCounter];
        aCounter++;
        bCounter++;
      }
    }

    mergedCounter++;
  }
  return result;
}