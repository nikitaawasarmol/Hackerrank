 import java.util.HashSet;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Solution {

   public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        HashSet<Integer>hs=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            if(a==1)
            {
                int b=sc.nextInt();
                pq.add(b);
            }
            else if(a==2)
            {
                int b=sc.nextInt();
                if(b==pq.peek())
                {
                    pq.poll();
                }
                else{
                    hs.add(b);
                }
            }
            else{
                while(hs.contains(pq.peek()))
                {
                    pq.remove();
                }
                System.out.println(pq.peek());
            }
        }
    }
}

