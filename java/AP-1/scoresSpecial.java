/*
Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text area.
*/

public int scoresSpecial(int[] a, int[] b) {
  return specialInArray(a) + specialInArray(b);
}

public int specialInArray(int[] a) {
  int specialScore = 0;
  for (int i = 0; i < a.length; i++) {
    if(a[i] % 10 == 0 && a[i] > specialScore) specialScore = a[i];
  }
  
  return specialScore;
}