/* Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
*/

public boolean strCopies(String str, String sub, int n) {
    if(n == 0) {
        return true;
    }
    if(str.length() < sub.length()) return false;
    int location = str.indexOf(sub);
    if (location > -1) {
        return strCopies(str.substring(location + 1), sub, n-1);
    }
    return false;
}