package shortestWordDistance;

public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int a = -1, b = -1;
        int res = words.length;

        for (int i = 0; i < words.length; i++) {
            while (a == -1 && b == -1) {
                if (word1.equals(words[i])) a = i;
                else if (word2.equals(words[i])) b = i;
                i++;
            }

            if (word2.equals(words[i])) {
                if (a != -1) {
                    res = Math.min(res, Math.abs(a - i));
                    a = -1;
                }
                b = i;
            } else if (word1.equals(words[i])) {
                if (b != -1) {
                    res = Math.min(res, Math.abs(b - i));
                    b = -1;
                }
                a = i;
            }

            if (res == 1) return res;
        }

        return res;
    }
}
