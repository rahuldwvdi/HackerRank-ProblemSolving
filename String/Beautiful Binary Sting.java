//https://www.hackerrank.com/challenges/beautiful-binary-string/problem

public static int beautifulBinaryString(String b) {
        int min = 0;
        for(int i=0;i<=b.length()-3;){
            if(b.substring(i, i+3).equals("010")){
                min++;
                i=i+3;
            }
            else{
                i++;
            }
        }
        return min;
    }
