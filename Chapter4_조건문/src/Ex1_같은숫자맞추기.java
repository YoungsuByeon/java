import java.util.Scanner;


// 101, 110, 123, 111 이런식으로 3자리의 숫자를 입력받아서 몇개의 숫자가 같은지 출력해주세요.
public class Ex1_같은숫자맞추기 {

	public static void main(String[] args) {
		
		
		System.out.println("숫자 3자리의 정수값을 입력해 주세요:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 값을 3개의 숫자로 분할처리한다.
		int num1 = num/100;       // 맨앞자리
		System.out.println(num1);
		
		int num2 = (num%100)/10;
		System.out.println(num2);
		
		int num3 = (num%10);
		System.out.println(num3);
			
		// 3개의 자숫자들이 같은지를 비교해서 출력
		if (num1==num2 && num2==num3) {
			System.out.println("3개의 숫자가 모두 같습니다.");
		}
		else if(num1==num2 || num1==num3 || num2==num3) {
			System.out.println("3개의 숫자중에서 2개의 숫자가 같습니다.");
		}
		else {
			System.out.println("3개의 숫자가 모두 다릅니다.");
		}
		sc.close();

	}

}
