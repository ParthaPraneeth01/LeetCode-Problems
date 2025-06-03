class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
        int pop=x%10;
        x=x/10;
        if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
        if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

        rev=rev*10+pop;
        }
        return rev;
    }
}
public class leetCode7_ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔽 Example input: 123 or -456 or 1534236469 (overflow test)
        System.out.print("Enter an integer to reverse: ");
        int x = sc.nextInt();

        Solution sol = new Solution();
        int reversed = sol.reverse(x);

        System.out.println("Reversed integer: " + reversed);
    }
}

