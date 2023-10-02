import java.util.*;
class maxsubarr1
{
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        int pre[]=new int[arr.length];
        /*
        PREFIX SUM
        pre[0]=arr[0];
        for(int i=1;i<pre.length;i++)
        {
            pre[i]=pre[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(pre));
        */
       pre[0]=arr[0];
        for(int i=1;i<pre.length;i++)
        {
            pre[i]=pre[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(pre));
        int maxs=Integer.MIN_VALUE;
        int curr=0;
        for(int start=0;start<arr.length;start++)
        {
            for(int end=start;end<arr.length;end++)
            {
                curr=start==0 ? pre[end] : pre[end]-pre[start-1];
                if(curr>maxs)
            {
                maxs=curr;
            }
            }
            
        }
        System.out.println(maxs);
    }
}