
public class Type1_Int {

	public static void main(String[] args) {
		
		int a;
		a = 100;
		
		int b = 0100;     //  4 2 1         0으로 시작하면 8진수
		int c = 0x100;    //  8 4 2 1       0x로 시작하면 16진수
		
		System.out.println("10진수 100 = " + a);
		System.out.println("8진수 100 = " + b);
		System.out.println("16진수 100 = " + c);
		System.out.println("8진수 0777 = " + 0777);
		System.out.println("16진수 0fff = " + 0xfff);
		

	}

}
