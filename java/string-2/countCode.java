/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
*/

public int countCode(String str) {
  int count = 0;
  for (int i = 0; i < str.length() - 3; i++) {
    String partOne = str.substring(i, i + 2);
    String partTwo = str.substring(i+3, i+4);
    if(partOne.equals("co") && partTwo.equals("e")) count++;
  }
  return count;
}
