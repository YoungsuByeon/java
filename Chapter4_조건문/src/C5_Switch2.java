import java.util.Scanner;

public class C5_Switch2 {

	public static void main(String[] args) {
		
		System.out.println("월을 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		
	String season = "";
		
		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울"; break;
		case 3: 
		case 4: 
		case 5: 
			season="봄"; break;
		case 6: 
		case 7: 
		case 8:  
			season="여름"; break;
		case 9:
		case 10: 
		case 11: 
			season="가을이야~"; break;
		
		default: season="뭐야~";
		
		}
		System.out.println(month + "월은" + season + "입니다.");

	}

}
