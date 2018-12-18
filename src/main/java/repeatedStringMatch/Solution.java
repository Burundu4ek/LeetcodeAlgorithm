package repeatedStringMatch;

public class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder concatStringA = new StringBuilder(A);

        while (concatStringA.length() <= B.length() + A.length()) {
            if (concatStringA.lastIndexOf(B) > -1) {
                return concatStringA.length() / A.length();
            }
            concatStringA.append(A);
        }

        return concatStringA.lastIndexOf(B) > -1 ? concatStringA.length() / A.length() : -1;
    }
}
