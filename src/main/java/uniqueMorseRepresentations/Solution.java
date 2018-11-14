package uniqueMorseRepresentations;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 0)
            return 0;

        Set<String> res = new HashSet<String>();
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (String w : words) {
            StringBuilder str = new StringBuilder();
            for (char c : w.toCharArray()) {
                int index = alphabet.indexOf(c);
                str.append(codes[index]);
            }
            res.add(str.toString());
        }

        return res.size();
    }
}
