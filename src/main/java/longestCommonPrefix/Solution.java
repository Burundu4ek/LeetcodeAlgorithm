package longestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        StringBuilder prefix = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            if (prefix.length() == 0)
                return "";

            // if (strs[i].length() < prefix.length()) {
            //     // System.out.println("line 8: "+ prefix.toString() + " " + strs[i]);
            //     prefix.delete(strs[i].length(), prefix.length() - 1);
            // }

            while (!strs[i].startsWith(prefix.toString()) && prefix.length() != 0) {
                prefix.deleteCharAt(prefix.length() - 1);
            }
        }

        return prefix.toString();
    }
}