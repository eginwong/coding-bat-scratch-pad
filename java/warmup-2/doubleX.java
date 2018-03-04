/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
*/

boolean doubleX(String str) {
    if(str.length() < 2) {
        return false;
    }
    for(int i = 2; i <= str.length(); i++) {
        if(str.substring(i-2,i-1).equals("x")){
            return str.substring(i-2,i).equals("xx");
        } 
    }
    return false;
}