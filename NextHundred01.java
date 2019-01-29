import java.util.*;

public class NextHundred01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((getNextMultipleOf100(num)));
	}

	public static int getNextMultipleOf100(int num) {
		if(num <= 0) {
			return -1;
		}
		int mul = ((num/100) + 1) * 100;
		return mul;
	}
}
