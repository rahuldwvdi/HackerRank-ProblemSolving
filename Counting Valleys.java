import java.util.*;
public class Roll{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int steps = s.nextInt();
        String path;
        do{
            path=s.next();
        }
        while(path.length() != steps);
        int groundlevel =0;
        int valley =0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='U'){
                if(groundlevel==-1){
                    valley++;
                }
                groundlevel++;
            }
            else if(path.charAt(i)=='D'){
                groundlevel--;
            }
        }
        System.out.println(valley);
    }
}
