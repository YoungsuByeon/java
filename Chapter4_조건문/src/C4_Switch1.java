import java.util.Scanner;

public class C4_Switch1 {

	public static void main(String[] args) {
		
		System.out.println("몇번에서 출력할까요>> ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("L");
		case 2:
			System.out.println("o");
		case 3:
			System.out.println("v");
		case 4:
			System.out.println("e");
		case 5:
			System.out.println("f");
		case 6:
			System.out.println("o");
		case 7:
			System.out.println("r"); //break;
		case 8:
			System.out.println("e");
		case 9:
			System.out.println("v");
		case 10:
			System.out.println("e");
		case 11:
			System.out.println("r");
			
			default : System.out.println("기본");
		}

	}

}
