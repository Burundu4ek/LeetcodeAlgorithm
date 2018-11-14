package toLowerCase;

public class Solution {
    public String toLowerCase(String str) {
        StringBuilder res = new StringBuilder();

        for (char s : str.toCharArray()) {
            char l = s < 91 && s > 64 ? (char) (s + 32) : s;
            res.append(l);
        }

        return res.toString();
    }
}
