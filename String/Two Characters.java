public static int alternate(String s){
        if(s.length()<=1) return 0;
        int [][] pair = new int[26][26];
        int [][] count = new int[26][26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int num = ch -'a';
            for(int col=0;col<26;col++){
                if(pair[num][col]==ch)  count[num][col] = -1;
                if(count[num][col] !=-1){
                    pair[num][col] = ch;
                    count[num][col]++;
                }
            }
            for(int row =0;row<26;row++){
                if(pair[row][num]==ch)  count[row][num] =-1;
                if(count[row][num]!=-1){
                    pair[row][num] = ch;
                    count[row][num]++;
                }
            }
        }
        int max =0;
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                max = Math.max(max, count[i][j]);
            }
        }
    return max;
}
