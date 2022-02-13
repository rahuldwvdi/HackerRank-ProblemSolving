public static int stringConstruction(String s) {
        int res =0;
        Set<Character> set = new HashSet<>();
        for(char ch: s.toCharArray()){
            if(set.contains(ch)){
                continue;
            }
            else{
                set.add(ch);
                res++;
            }
        }
        return res;
}
