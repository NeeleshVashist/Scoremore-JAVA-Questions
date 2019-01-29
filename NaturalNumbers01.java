import java.util.*;

public class NaturalNumbers01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();
        System.out.println(getNaturalNumbers(var1, var2));
    }
	public static String getNaturalNumbers(int num1, int num2)	{
        String str="";
        if(num1 <= 0 || num2 <= 0) {
           return "-1";
        }
        else if(num2 < num1) {
           return "-2";
        }
        else {
           for(int i=num1; i<=num2; i++) {
               if(i == num2) {
                   str += i;
               }
               else {
                   str += i + " ";
               }
           }
        }
        return str;
	}
}
