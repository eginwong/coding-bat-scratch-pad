/*
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
*/

// reverse the array and count indices that way

public int maxMirror(int[] nums) {
  List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
  List<Integer> reverseList = Arrays.stream(nums).boxed().collect(Collectors.toList());
  Collections.reverse(reverseList);

  int maxCount = 0;

  for (int globalCounter = 0; globalCounter < nums.length; globalCounter++) {
    // second counter for reverse
    for (int backCounter = 0; backCounter < nums.length; backCounter++) {
      int localCount = 0;

      if(numsList.get(globalCounter) == reverseList.get(backCounter)) {
        // another match for-loop for sequential mirror
        localCount = 1;
        for (int matchFor = globalCounter + 1, matchBack = backCounter + 1; matchFor < nums.length && matchBack < nums.length; matchFor += 1, matchBack +=1) {
          if(numsList.get(matchFor) == reverseList.get(matchBack)) {
            localCount++;
          } else {
            maxCount = maxCount > localCount ? maxCount : localCount;
            break;
          }
        }
        // set one more time in case break occurs because for loop condition ends
        maxCount = maxCount > localCount ? maxCount : localCount;
      }
    }
  }
  return maxCount;
}
