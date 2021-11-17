import java.util.Scanner;

public class C3_If3 {

	public static void main(String[] args) {
		
		
		// 숫자를 입력받아서
		// 양수인지, 음수인지 판별 출력하시오. 단, 입력은 소수점이 있는 실수입니다.
		
		System.out.println("숫자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		if (num >= 0 ) {
			System.out.println(num + "양수 입니다.");
		}
		else if (num <0) {
			System.out.println(num + "\"음수\" 입니다.");
		}

	}

}
