
public class Type2_char {
	public static void main (String [] args) {
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int unicode = c1;
		
		System.out.println("c1 A = " + c1);
		System.out.println("c2 65 = " + c2);
		System.out.println("c3 \u0041 = " + c3);
		System.out.println("c4 가 = " + c4);
		System.out.println("c5 44032 = " + c5);
		System.out.println("c6 \uac00 = " + c6);
		System.out.println("c1 A값의 유니코드값은 " +unicode);
	}

}
