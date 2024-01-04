import java.util.*;

class HasSumPair
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = sc.nextInt();
        int target = sc.nextInt();

        System.out.println(isTarget(nums, target));
        sc.close();
    }

    static boolean isTarget(int[] nums, int target)
    {
        int left = 0, right = nums.length-1, sum = 0;
        sum = nums[left]+nums[right];

        while(left < right)
        {
            if(sum == target) 
                return true;
            else if(sum < target)
                left++;
            else
                right--;
        }
        return false;
    }
}
