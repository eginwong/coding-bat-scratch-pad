/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
*/

public String stringX(String str) {
    String purgedX = "";
    if(str.length() <2) return str;

    purgedX += str.substring(0, 1);
    for(int i = 1; i < str.length() - 1; i++) {
        if(str.charAt(i) != 'x'){
            purgedX += str.charAt(i);
        }
    }
    purgedX += str.substring(str.length() -1, str.length());

    return purgedX;
}