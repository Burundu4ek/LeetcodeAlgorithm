package licenseKeyFormatting;

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder res = new StringBuilder();
        int count = 0;

        for (int i = S.length() - 1; i >= 0; i--) {
            char curSimbol = S.charAt(i);

            if (curSimbol != '-') {
                if (count == K) {
                    res.append('-');
                    count = 0;
                }

                if (curSimbol >= 'a')
                    curSimbol -= 32;

                res.append(curSimbol);
                count++;
            }
        }

        return res.reverse().toString();
    }
}
