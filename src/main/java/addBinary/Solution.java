package addBinary;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();

        res = a.length() > b.length() ?
                calculate(res, a.toCharArray(), b.toCharArray())
                : calculate(res, b.toCharArray(), a.toCharArray());

        return res.toString();
    }

    private StringBuilder calculate(StringBuilder res, char[] arrFst, char[] arrScd) {
        char remind = 48; // 0

        for (int i = arrScd.length - 1, j = 1; i >= 0; i--, j++) {
            int sum = (arrFst[arrFst.length - j] + arrScd[i] + remind) % 48;

            res.insert(0, (char) (48 + sum % 2));
            remind = (char) (48 + sum / 2);
        }

        for (int i = arrFst.length - arrScd.length - 1; i >= 0; i--) {
            if (remind == '1') {
                int sum = arrFst[i] + remind;
                res.insert(0, (char) (48 + sum % 2));
                remind = (char) (sum / 2);
            } else {
                res.insert(0, arrFst[i]);
            }
        }

        if (remind == '1')
            res.insert(0, remind);

        return res;
    }
}
