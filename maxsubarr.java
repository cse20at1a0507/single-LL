class maxsubarr
{
    public static void main(String args[])
    {
        
        int maxs=Integer.MIN_VALUE;
        int arr[]={2,4,6,8,10};
        for(int start=0;start<arr.length;start++)
        {
            for(int end=start;end<arr.length;end++)
            {
                int currsum=0;
                for(int i=start;i<=end;i++)
                {
                    currsum+=arr[i];
                }
                System.out.println(currsum);
                if(currsum>maxs)
                {
                    maxs=currsum;
                }
            }
            
        }
        System.out.println("MaxSubArray :- "+maxs);
    }
}