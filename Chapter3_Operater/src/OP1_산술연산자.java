/*
     연산자
     산술연산자 : %,+,-,*,/
     증감연산자 : ++, --
     후위증감/전위증감: ++i, i++
     대입연산자: 우측 = 좌측,             num = num+3 >> num += 3
                                 num = num*3 >> num *= 3
     비교연산자: >=,
     논리연산자: AND(&&), OR(||), NOT(!)
     비트연산자: & , |
     쉬프트연산자: << , >>
      
 */
public class OP1_산술연산자 {
	public static void main (String [] args) {
		
		int a=5;
		int b=2;
		
		int sum = a+b;
		System.out.println("a+b="+sum);
		
		int sub = a-b;
		System.out.println("a-b="+sub);
		
		int mul = a*b;
		System.out.println("a*b="+mul);
		
		int div = a/b;
		System.out.println("a/b="+div);
		
		//double div = a/(float)b;
		//System.out.println("a/b="+div);
		
		int mod = a%b;
		System.out.println("%는 나머지 연산자이다. a%b="+mod);
		
		int c = a++;
		System.out.println("a의 전위증가 연산 ="+c);
		System.out.println("현재 a의 값은 ="+a);
	}
	

}
