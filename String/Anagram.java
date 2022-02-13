//https://www.hackerrank.com/challenges/anagram/problem

public static int anagram(String s) {
        int res =0;
        int len = s.length();
        if (len%2!=0)   return -1;
        String s1 = s.substring(0,len/2);
        String s2 = s.substring(len/2,len);
        char[] a = s1.toCharArray();
        for(char ch: a ){
            int i = s2.indexOf(ch);
            if(i== -1){
                res++;
            }else s2 = s2.substring(0,i)+s2.substring(i+1);
        }
        return res;
}
