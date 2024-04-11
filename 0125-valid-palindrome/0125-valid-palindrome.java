class Solution {
    public boolean isPalindrome(String s) {
        boolean flag = true;
        int c = 0, i = 0, j, len;
        String chkStr = "";
        // removing all non-alphanumeric characters.
        while (c < s.length()) {
            if ((s.charAt(c) >= 48 && s.charAt(c) <= 57) || (s.charAt(c) >= 65 && s.charAt(c) <= 90)
                    || (s.charAt(c) >= 97 && s.charAt(c) <= 122)) {
                chkStr = chkStr + s.charAt(c);
            }
            c++;
        }
        // converting all uppercase letters into lowercase letters.
        chkStr = chkStr.toLowerCase();
        // length of the string after formatting.
        len = chkStr.length();
        j = len - 1;
        // check if the length is even or odd then itirate from the begining and end of
        // the string .
        if (len % 2 == 0) {
            while (i < (len / 2) && j >= (len / 2)) {
                // compare between chars to validate Palindrome
                if (chkStr.charAt(i) != chkStr.charAt(j)) {
                    flag = false;
                }
                i++;
                j--;
            }
        }
        // check if the length is even or odd then itirate from the begining and end of
        // the string .
        else {
            while (i < (len / 2) && j > (len / 2)) {
                // compare between chars to validate Palindrome
                if (chkStr.charAt(i) != chkStr.charAt(j)) {
                    flag = false;
                }
                i++;
                j--;
            }
        }
        return flag;
    }
}