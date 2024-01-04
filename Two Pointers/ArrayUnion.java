import java.util.*;

class ArrayUnion
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        for(int i=0; i<m; i++)
            b[i] = sc.nextInt();

        arrayUnion(a, b, n, m);
        sc.close();
    }

    static void arrayUnion(int[] a, int[] b, int n, int m)
    {
        int left = 0, right = 0;
        while(left<n && right<m)
        {
            if(a[left] == b[right])  { 
                System.out.print(a[left] + " ");
                left++;
                right++;
            }
            else if(a[left] < b[right]) {
                System.out.print(a[left] + " ");
                left++;
            }
            else {
                System.out.print(b[right] + " ");
                right++;
            }
        }
        
        while(left < n)
        {
            System.out.print(a[left] + " ");
            left++;
        }

        while(right < m)
        {
            System.out.print(b[right] + " ");
            right++;
        }
    }
}

