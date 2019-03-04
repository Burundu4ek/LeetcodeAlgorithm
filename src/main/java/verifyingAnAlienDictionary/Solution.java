package verifyingAnAlienDictionary;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if (words != null && words.length > 1) {
            for (int i = 1; i < words.length; i++) {
                if (words[i - 1].length() > words[i].length() && words[i - 1].startsWith(words[i]))
                    return false;
                else {
                    for (int j = 0; j < words[i - 1].length() && j < words[i - 1].length(); j++) {
                        int fInx = order.indexOf(words[i - 1].charAt(j));
                        int sInd = order.indexOf(words[i].charAt(j));

                        if (fInx < sInd) break;
                        else if (fInx > sInd) return false;
                    }
                }
            }
        }

        return true;
    }
}
