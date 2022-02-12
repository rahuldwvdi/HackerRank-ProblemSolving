public static String funnyString(String s) {
        String rev = "";
        for(char ch : s.toCharArray()){
            rev = ch + rev;
        }
        List<Integer> org = new ArrayList<>();
        List<Integer> reverse = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            org.add(Math.abs((s.charAt(i)-'a')-(s.charAt(i+1)-'a')));
        }
        for(int i=0;i<s.length()-1;i++){
            reverse.add(Math.abs((rev.charAt(i)-'a')-(rev.charAt(i+1)-'a')));
        }
        return org.equals(reverse)==true? "Funny": "Not Funny";
}
