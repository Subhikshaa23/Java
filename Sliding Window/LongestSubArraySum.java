import java.util.*;

public class LongestSubArraySum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i=0; i<n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        
        int left=0, sum=0, len=0;
        for(int right=0; right<n; right++)
        {
            sum += nums[right];
            while(sum>k)
            {
                sum -= nums[left];
                left++;
            }
            len = Math.max(len, right-left+1);
        }
        System.out.print(len);
    }
}