import java.util.Scanner;

public class Ex3_삼각형을만들수있나요 {

	public static void main(String[] args) {
		
		System.out.println("세변의 길이를 입력해 주세요: ");
		Scanner sc = new Scanner(System.in);
		
		int 길이1 = sc.nextInt();
		int 길이2 = sc.nextInt();
		int 길이3 = sc.nextInt();
		
		//두변의 길이의 합이 한변의 길이보다 작으면 그릴수없다.
		if(길이1+길이2 < 길이3 || 길이1+길이3 < 길이2 || 길이2+길이3 < 길이1) {
			System.out.println("삼각형을 그릴수 없습니다.");
		}else {
			System.out.println("삼각형을 그릴수 있습니다.");
		}
		
		sc.close();

	}

}
