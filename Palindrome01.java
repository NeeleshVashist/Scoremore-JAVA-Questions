import java.util.*;

public class Palindrome01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = 878;
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }

    public static int isPalindrome(int num) {
        if(num > 99 && num < 1000) {
            if(num/100 == num%10) {
                return 1;
            }
            return 0;
            // System.out.println("It's Working");
        }
        return -1;
    }
}
