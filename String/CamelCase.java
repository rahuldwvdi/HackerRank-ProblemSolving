public static int camelcase(String s) {
        int c = 1;
        for(char ch: s.toCharArray()){
            if(Character.isUpperCase(ch)){
                c++;
            }
        }
        return c;
}
