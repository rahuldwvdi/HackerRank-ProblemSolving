import java.util.*;
public class Roll {
   
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        int c =0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i =0;i<n;i++){
            int ele = a[i];
            if(set.contains(ele)){
                set.remove(ele);
                c +=1;
            }
            else{
                set.add(ele);
            }
        }
        System.out.println(c);
    }
}
