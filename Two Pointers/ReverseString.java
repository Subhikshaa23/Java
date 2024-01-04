import java.util.*;

class ReverseString
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println(reverse(str));
        sc.close();
    }
    
    static StringBuilder reverse(StringBuilder str)
    {
        int left = 0, right = str.length()-1; 
        char ch = ' ';
        
        while(left<right)
        {
            if(str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            }
            else
            {
                ch = str.charAt(left);
                str.setCharAt(left, str.charAt(right));
                str.setCharAt(right, ch);
                left++;
                right--;
            }
        }
        return str;
    }
} 
