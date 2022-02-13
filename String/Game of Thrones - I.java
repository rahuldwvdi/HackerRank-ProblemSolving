//https://www.hackerrank.com/challenges/game-of-thrones/problem

public static String gameOfThrones(String s) {
        int[] ch = new int[26];
        int oddCount =0 ;
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ch[i]%2==1)
                oddCount += 1;
        }
        return oddCount>1?"NO":"YES";
}
