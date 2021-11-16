import java.util.Scanner;

public class Print3 {
	public static void main (String [] args) {
		
		System.out.println("이름과 나이, 몸무게를 공백으로 구분하여 입력해주세요>>");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		
		System.out.printf("이름은 %s이고, 나이는 %d살이고, 몸무게는 %.1fkg입니다.",name,age,weight);  
		// 이름은 뭐고, 나이는 몇살이고, 몸무게는 몇 kg입니다.
	}

}
