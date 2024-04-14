class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder build1 = new StringBuilder(s);
        StringBuilder build2 = new StringBuilder(t);
        for (int i = 0; i < build1.length(); i++){
            for (int j = 0; j < build2.length(); j++){
                if (build1.charAt(i) == build2.charAt(j)) {
                    build1.deleteCharAt(i);
                    build2.deleteCharAt(j);
                    i--; // adjust index after deletion
                    break; // exit inner loop once match is found
                }
            }
        }
        return (build1.length() == 0 && build2.length() == 0);
    }
}
