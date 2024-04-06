class Solution {
    public String reverseWords(String s) {
         String str ="";
    String gg=s.trim().replaceAll("\\s{2,}", " ");
    String[] st = gg.split(" "); 
    
    Stack<String>StackSS = new Stack<>();
    StringBuilder CString = new StringBuilder();
     for (String w:st){
        String g = w.trim();
        StackSS.push(g);
     }
     while(!StackSS.isEmpty()){
     CString.append(StackSS.pop());
     CString.append(" ");
     }
     if(CString.length() > 0){
        CString.deleteCharAt(CString.length()-1);

     }
    
     return CString.toString();

    }
}