package toGoatLatin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String toGoatLatin(String S) {
        if (S == null)
            return "";

        String[] res = S.split(" ");
        StringBuilder str = new StringBuilder();
        StringBuilder ma = new StringBuilder("maa");
        Set<Character> vowel = new HashSet<>();
        vowel.addAll(Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u'}));

        for (String w : res) {
            StringBuilder word = new StringBuilder(w);

            if (!isVowel(vowel, word.charAt(0)) && word.length() > 1) {
                char firstChar = word.charAt(0);
                word = word.deleteCharAt(0).append(firstChar);
            }

            str.append(word).append(ma).append(' ');
            ma.append('a');
        }

        return str.deleteCharAt(str.length() - 1).toString();
    }

    private boolean isVowel(Set charact, char cr) {
        if (charact.contains(cr) || charact.contains((char) (cr + 32))) {
            return true;
        }

        return false;
    }
}