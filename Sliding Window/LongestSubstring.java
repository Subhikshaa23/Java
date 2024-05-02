import java.util.*;

public class LongestSubstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int left=0, sum=0, len=0, k=1;
        for(int right=0; right<str.length(); right++)
        {
            if (str.charAt(right)=='0')
                sum++;
            while(sum>k)
            {
                if (str.charAt(left)=='0')
                    sum--;
                left++;
            }
            len = Math.max(len, right-left+1);
        }
        System.out.print(len);
    }
}