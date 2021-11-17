import java.util.Scanner;

public class C2_If2 {
	public static void main (String [] args) {
		
		System.out.println("월을 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		if(month >= 3 && month <=6) {
			System.out.println(month + "월은 봄입니다.");
		}
		else if (month >=7 && month <=9) {
			System.out.println(month + "월은 여름입니다.");
		}
		else if (month >=10 && month <=11) {
			System.out.println(month + "월은 가을입니다.");
		}
		else {
			System.out.println(month + "월은 겨울입니다.");
		}
		sc.close();
	}

}
