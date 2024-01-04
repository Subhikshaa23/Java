import java.util.*;

class IsSubsequence
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder seq = new StringBuilder(sc.nextLine());

        System.out.println(isSubsequence(str, seq));
        sc.close();
    }
    
    static boolean isSubsequence(StringBuilder str, StringBuilder seq)
    {
        int left = 0, right = 0, count = 0, m = seq.length(); 
        while(right<m)
        {
            if(str.charAt(left) == str.charAt(right)) {
                count++;
                left++;
                right++;
            }
            else
                right++;
        }
        return count==m;
    }
} 
