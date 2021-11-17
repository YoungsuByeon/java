import java.util.Scanner;

public class Ex5_두개의사각형이겹치나요 {

	public static void main(String[] args) {
		
		// (50,50) (100,100)인 사각형에 내가 입력한 (x1, y1) (x2, y2) 사각형이 겹치는 체크
		
		// 두점의 값을 입력해주세요
		// 스캐너로 입력받아서 저장한다
		
		// 만약,  (   ) 겹친다면 겹친다고 출력, 아니면 안겹친다고 출력
		
		// 스캐너 닫는다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x1 값을 입력하세요 :");
		int x1 = sc.nextInt();
		System.out.println("y1 값을 입력하세요 :");
		int y1 = sc.nextInt();
		
		System.out.println("x2 값을 입력하세요 :");
		int x2 = sc.nextInt();
		System.out.println("y2 값을 입력하세요 :");
		int y2 = sc.nextInt();
		
		if(
				((x1>=50 && x1<=100) && ((y1>=50 && y1<=100) || (y2>=50 && y2<=100))) ||
				((x2>=50 && x2<=100) && ((y1>=50 && y1<=100) || (y2>=50 && y2<=100)))
				
			) {
			System.out.println("사각형이 겹칩니다.");
		}else {
			System.out.println("사각형이 겹치지 않습니다.");
		}
	}
}
