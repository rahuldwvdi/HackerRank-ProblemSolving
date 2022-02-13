//https://www.hackerrank.com/challenges/making-anagrams/problem

public static int makingAnagrams(String s1, String s2) {
        int[] a = new int[26];
        int[] b = new int[26];
        int res = 0;
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
        }  
        for(int i =0;i<s2.length();i++){
            b[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            res = res + Math.abs(a[i]-b[i]);
        }
        return res;
}
