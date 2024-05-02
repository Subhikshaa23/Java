import java.util.*;

public class MaximumSumSubarray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i=0; i<n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        
        int left=0, sum=0, max_sum=0;
        for(int i=0; i<k; i++)
            sum+=nums[i];
        max_sum = sum;
        
        for(int right=k; right<n; right++)
        {
            sum = sum - nums[right-k] + nums[right];
            max_sum = Math.max(max_sum, sum);
        }
        System.out.print(max_sum);
    }
}