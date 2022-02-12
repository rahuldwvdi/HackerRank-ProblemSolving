//https://www.hackerrank.com/challenges/pangrams/problem

public static String pangrams(String s) {
        s= s.replaceAll(" ","");
        s= s.toLowerCase();
        Set<Character> alphaSet = new HashSet<>();
        for(char ch: s.toCharArray()){
            if(!alphaSet.contains(ch))
                alphaSet.add(ch);
        }
        
        return (alphaSet.size()==26)? "pangram":"not pangram";

    }
