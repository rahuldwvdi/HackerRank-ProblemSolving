//https://www.hackerrank.com/challenges/palindrome-index/problem

public static int palindromeIndex(String s) {
        int index = -1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                if(i+1<s.length()){
                    boolean palin = isPalin(s.substring(i+1,s.length()-i));
                    if(palin)   return i;
                    return s.length()-i-1;
                }
            }
        }
        return index;    
    }
    public static boolean isPalin(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))   return false;
        }
        return true;
    }
