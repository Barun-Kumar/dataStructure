package leetcode.string;

public class PalindromeSolution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
    /**
     * This method is used to determine whether the input character is a letter or a number.
     *
     * <b>Note:</b> Same functionality is provided by Character.isLetterOrDigit() method at the cost
     * of additional dependence and performance speed.
     *
     * @param ch        Input character value
     * @return boolean  TRUE:  Input IS a letter or a number
     *                  FALSE: Input is NOT a letter or a number
     */
    private static boolean isLetterOrDigit(char ch) {
        return ('A' <= ch && ch <= 'Z') ||
                ('a' <= ch && ch <= 'z') ||
                ('0' <= ch && ch <= '9');
    }


    /**
     * This method is used to convert an upper letter character to a lower case.
     *
     * <b>Note:</b> Same functionality is provided by Character.toLowerCase() method at the cost
     * of additional dependence and performance speed.
     *
     * @param ch        Input character value
     * @return char     Lower case character if the input is an upper letter character
     */
    private static char toLowerCase(char ch) {
        if ('A' <= ch && ch <= 'Z') {
            return (char)(ch - 'A' + 'a');
        }
        return ch;
    }

    /**
     * Determine whether a given string is palindrome.
     *
     * <b>Note:</b> Input validation to be completed higher in the call stack.
     *
     * @param s         Input string value
     * @return boolean  TRUE:  Input IS palindrome
     *                  FALSE: Input is NOT palindrome
     */
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();

        int indexLeft  = 0;
        int indexRight = chars.length - 1;

        char charLeft;
        char charRight;

        while (indexLeft < indexRight) {
            charLeft  = chars[indexLeft];
            charRight = chars[indexRight];

            if (!isLetterOrDigit(charLeft)) {
                indexLeft++;
            } else if (!isLetterOrDigit(charRight)) {
                indexRight--;
            } else if (toLowerCase(charLeft) != toLowerCase(charRight)) {
                return false;
            } else {
                indexLeft++;
                indexRight--;
            }
        }
        return true;
    }
}
