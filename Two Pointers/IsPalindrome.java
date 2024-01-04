import java.util.*;

class IsPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
        sc.close();
    }

    static boolean isPalindrome(String s)
    {
        int left = 0, right = s.length()-1;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right)) 
                return false;
            left++;
            right--;
        }
        return true;
    }
}