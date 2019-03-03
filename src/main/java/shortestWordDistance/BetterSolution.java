package shortestWordDistance;

public class BetterSolution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int a = -1, b = -1;
        int res = words.length;

        for (int i = 0; i < words.length; i++) {
            if (word1.equals(words[i]))
                a = i;
            else if (word2.equals(words[i]))
                b = i;

            if (a > -1 && b > -1)
                res = Math.min(res, Math.abs(a - b));

            if (res == 1) return res;
        }

        return res;
    }
}
