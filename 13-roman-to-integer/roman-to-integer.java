class Solution {
    public int romanToInt(String s) {
       int intNum = 0;
       char nextChar, currentChar ;
        for(int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);

            if (i < s.length() - 1) {
                nextChar = s.charAt(i + 1);
            } else {
                nextChar = currentChar;
            }

            switch (currentChar) {
                case 'I':
                    if (nextChar == 'V') {
                        intNum += 4;
                        i++;
                    } else if (nextChar == 'X') {
                        intNum += 9;
                        ++i;
                    } else {
                        intNum++;
                    }
                    break;
                case 'X':
                    if (nextChar == 'L') {
                        intNum += 40;
                        ++i;
                    } else if (nextChar == 'C') {
                        intNum += 90;
                        i++;
                    } else {
                        intNum += 10;
                    }
                    break;
                case 'C':
                    if (nextChar == 'D') {
                        intNum += 400;
                        i++;
                    } else if (nextChar == 'M') {
                        intNum += 900;
                        i++;
                    } else {
                        intNum += 100;
                    }
                    break;
                case 'V':
                    intNum += 5;
                    break;
                case 'L':
                    intNum += 50;
                    break;
                case 'D':
                    intNum += 500;
                    break;
                case 'M':
                    intNum += 1000;
                    break;
                default:
                    break;
            }
        }
        return intNum;
    }
}