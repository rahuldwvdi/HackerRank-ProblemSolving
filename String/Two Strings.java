//https://www.hackerrank.com/challenges/two-strings/problem

public static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for(char ch: s1.toCharArray()){
            set.add(ch);
        }
        for(int i=0;i<s2.length();i++){
            if(set.contains(s2.charAt(i))){
                return "YES";
            }
            
        }
        return "NO";
    }
