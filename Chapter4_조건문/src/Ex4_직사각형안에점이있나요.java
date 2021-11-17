import java.util.Scanner;

/*
 * 
 *                   너비(width)
 *                 *------------*                (50,50)----------------
 *                 | 높이(height)                    |                  |
 *                 *                                --------------(100,100)
 */
public class Ex4_직사각형안에점이있나요 {
	public static void main (String [] args) {
		
		System.out.println("point(x,y)의 좌표갑을 입력하시오");
		
		// 스캐너,      x,y값을 저장
		
		//입력받은  x값이 사각형안에 있는지?   입력받은 y값이 사각형안에 있는지?   비교
		
		//스캐너를 닫는다.
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		if ( (x>=50 && x<=100) && (y>=50 && y<=100) ) {
			System.out.println("사각형안에 점이 존재합니다.");
		}
		else {
			System.out.println("사각형 밖에 점이 존재합니다.");
		}
	}

}
