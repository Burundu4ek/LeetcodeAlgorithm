package reverseWords;

public class Solution {
    public String reverseWords(String s) {
        if (s == null || s == "")
            return "";

        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) {
                if (res.length() != 0)
                    res.append(" ");
                res.append(words[i]);
            }
        }

        System.out.println(res.toString());
        return res.toString();
    }
//
//    public static void main(String args[]) {
////        reverseWords("the sky is blue");
//        reverseWords("  the sky is blue ");
//        reverseWords("blue");
//    }
}
