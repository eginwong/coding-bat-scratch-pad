/*
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
*/

public int strCount(String str, String sub) {
    if (str.length() < sub.length()) return 0;
    int loc = str.indexOf(sub);
    if (loc > -1) {
        return 1 + strCount(str.substring(loc + sub.length()), sub);
    }
    return 0;
}