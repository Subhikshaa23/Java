import java.util.*;

public class ContiguousSubarrayProduct
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i=0; i<n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        
        if (k==0)
            System.out.print("0");
        else
        {
            int left=0, sum=1, len=0;
            // System.out.println(sum + " " + k);
            for(int right=0; right<n; right++)
            {
                // System.out.println(right);
                sum *= nums[right];
                while(sum>=k)
                {
                    // System.out.println(sum + " " + k);
                    sum /= nums[left];
                    left++;
                    // System.out.println(left);
                }
                len+=(right-left+1);
                // System.out.println("len " + len);
            }
            System.out.print(len);
        }
    }
}
