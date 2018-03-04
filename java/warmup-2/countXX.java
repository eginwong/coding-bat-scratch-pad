/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
*/

int countXX(String str) {
    int counter = 0;
    if(str.length() < 2) {
        return counter;
    }
    for(int i = 2; i <= str.length(); i++) {
        if(str.substring(i-2,i).equals("xx")) {
            counter++;
        }
    }

    return counter;
}