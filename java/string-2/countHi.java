/*
Return the number of times that the string "hi" appears anywhere in the given string.
*/

public int countHi(String str) {
  int count = 0;
  String subject = str;
  int check = 0;
  while(check != -1 && subject.length() > 1) {
    check = subject.indexOf("hi");
    if(check > -1) {
      count++;
      subject = subject.substring(check + 2);
    }
  }
  return count;
}
