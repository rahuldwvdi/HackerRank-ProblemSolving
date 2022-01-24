import java.util.*;
public class Roll{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = Integer.MIN_VALUE;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]= s.nextInt();
        }
        int[] frequency = new int[101];
        for(int i=0;i<n;i++){
            int curr_num = a[i];
            frequency[curr_num]++;
        }
        for(int i=1;i<=100;i++){
            res = Math.max(res,frequency[i]+frequency[i-1]);
        }
        System.out.print(res);
    }
}
