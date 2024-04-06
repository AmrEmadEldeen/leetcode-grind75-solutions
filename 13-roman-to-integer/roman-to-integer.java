class Solution {
    public int romanToInt(String s) {
       int counter =0;
       char sss;
        for(int i= 0;i<s.length();i++){
        char ss = s.charAt(i);

        if (i<s.length()-1){
        sss = s.charAt(i+1);
        }
        else{sss=ss;}
       
        switch (ss) {
    case 'I':

        if(sss=='V'){
            counter+=4;
            i++;
        }
        else if(sss=='X'){
            counter+=9;
            ++i;
        }
        else{counter++;}
        break;
    case 'X':
         if(sss=='L'){
            counter+=40;
            ++i;
        }
        else if(sss=='C'){
            counter+=90;
            i++;
        }
        
        else{counter+=10;}
        break;
    case 'C':
        if(sss=='D'){
            counter+=400;
            i++;
        }
        else if(sss=='M'){
            counter+=900;
            i++;
        }
        
        else{counter+=100;}
        break;
    case 'V':
        counter+=5;
        break;
    case 'L':
        counter+=50;
        break;
    case 'D':
        counter+=500;
        break;
    case 'M':
        counter+=1000;
        break;
    default:
        // Handle any other unexpected values here
        break;
}
        }
    return counter;
    }
}