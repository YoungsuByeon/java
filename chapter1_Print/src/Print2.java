import java.util.Scanner;

public class Print2 {
	
	/* class 속에는 아래의 속성들을 포함시킨다.
	 * 멤버변수(필드) - 명사
	 * 생성자
	 * 메소드(함수) - 기능, 동사
	 */
	
	
	public static void main(String [] args) {
		
		System.out.println("몇번재 프로그램을 작성하고 계신가요?");
		Scanner sc = new Scanner(System.in);
		     // sc ============> ( Scanner )
		
		String str = sc.next();
		
		System.out.println(str + "번째 작성해 보는 java프로그램 입니다.");
		
		sc.close();
	}

}
