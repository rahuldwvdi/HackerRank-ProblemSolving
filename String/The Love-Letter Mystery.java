//https://www.hackerrank.com/challenges/the-love-letter-mystery/problem

public static int theLoveLetterMystery(String s) {
        int res = 0;
        for(int i=0;i<s.length()/2;i++){
            res = res + Math.abs(s.charAt(i)- s.charAt(s.length()-i-1));
        }
        return res;
}
