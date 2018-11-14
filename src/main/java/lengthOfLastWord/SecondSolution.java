package lengthOfLastWord;

public class SecondSolution {
    public int lengthOfLastWord(String s) {
        if (s == null)
            return 0;

        String[] str = s.split(" ", 0);
        int res = str.length == 0 ? 0 : str[str.length - 1].length();

        return res;
    }
}
