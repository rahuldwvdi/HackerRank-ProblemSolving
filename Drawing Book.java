import java.util.*;
public class Roll{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        int leftturns = p/2;
        int rightturns =0;
        if( n%2==0){
            n=n+1;
            rightturns = (n-p)/2;
        }
        else{
            rightturns = (n-p)/2;
        }
        System.out.println(Math.min(left,right));
    }
}
