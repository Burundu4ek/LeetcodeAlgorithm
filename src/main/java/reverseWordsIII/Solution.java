package reverseWordsIII;

class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();

        for (String word : s.split(" ")) {
            if (word.length() > 0) {
                char[] ch = word.toCharArray();
                for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
                if (res.length() > 0)
                    res.append(" ");
                res.append(new String(ch));
            }
        }

        return res.toString();
    }
}