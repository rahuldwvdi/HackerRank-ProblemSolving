public static List<String> weightedUniformStrings(String s, List<Integer> queries)     {
        List<String> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int len = s.length();
        int i=0;
        while(i<len){
             int j=i;
             int sum =0;
             while( j<len && s.charAt(i)==s.charAt(j) ){
                 sum += (s.charAt(i)-'a') +1;
                 set.add(sum);
                 j++;
             }
            i = j;
        }
        for(int query=0;query<queries.size();query++){
            if(set.contains(queries.get(query)))    res.add("Yes");
            else    res.add("No");    
        }
        return res;   
    }
