//https://www.hackerrank.com/challenges/alternating-characters/problem

public static int alternatingCharacters(String s) {
        int min =0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                min++;
            }
        }
        return min;

    }
