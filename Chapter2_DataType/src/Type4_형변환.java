// byte(1) < short(2),char(2) < int(4) < long(8) < float(4) < double(8)
public class Type4_형변환 {
	public static void main (String [] args) {
		
		byte b = 127;
		
		int i = 100;
		
		System.out.println("b+i=" + (b+i));
		System.out.println("10/4=" + (10/4));
		System.out.println("10.0/4=" + (10.0/4));		
		System.out.println("(char)0x12340041=" + (char)0x12340041);		
		System.out.println("(byte)(b+i)=" + ((byte)(b+i)));
		System.out.println("(int)2.9+1.8=" + (int)(2.9+1.8));
		System.out.println("(int)2.9+(int)1.8=" + ((int)2.9+(int)1.8));
	}

}
