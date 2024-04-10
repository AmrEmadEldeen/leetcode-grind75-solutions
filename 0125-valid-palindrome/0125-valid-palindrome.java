class Solution {
    public boolean isPalindrome(String s) {
        boolean flag = true;
       
        String s2 = s.replaceAll("[^a-zA-Z0-9]", "");
        s2=s2.toLowerCase();
        int size = s2.length();
        int i = 0; 
        int j = size -1 ;
      //  for (int i = 0; int j = (size -1); i< (size/2) ; j >= (size /2))
      if (size%2==0){
      while( i< (size/2) && j >= (size /2)){
            if(s2.charAt(i) != s2.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }}
        else{
            while( i< (size/2) && j > (size /2)){
            if(s2.charAt(i) != s2.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }}
    return flag;
    }
}