import java.util.*;

public class RussMult01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(getProduct(n1, n2));
    }
    public static String getProduct(int num1, int num2) {
        int result = 0;
        int sum = 0;
        String str = "";

        if(num1 <= 0 || num2 <= 0) {
            return "-1";
        }
        else if(num1 >= 100000 || num2 >= 100000) {
            return "-2";
        }
        else {
            while(num1 >= 1) {
                if(num1%2 != 0) {
                    result = num2;
                    sum += result;
                    if(num1 <= 1) {
                        str += result + "=";
                    }
                    else {
                        str += result + "+";
                    }
                    // System.out.println(result);
                }

                num1 = num1/2;
                num2 = num2*2;
            }
            str += sum;
        }
        return str;
    }
}
