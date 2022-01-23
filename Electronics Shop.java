import java.util.*;
public class Roll{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int n = s.nextInt();
        int m = s.nextInt();
        int[] key = new int[n];
        for(int i=0;i<n;i++){
            key[i] = s.nextInt();
        }
        int[] dri = new int[m];
        for(int i=0;i<m;i++){
            dri[i] = s.nextInt();
        }
        int max =-1;
        for(int kunit: key){
            for(int dunit: dri){
                if(kunit+dunit<=b) max = Math.max(max, kunit+dunit);
            }
        }
        System.out.println(max);        
    }
}
