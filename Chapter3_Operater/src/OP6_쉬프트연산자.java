
public class OP6_쉬프트연산자 {
	public static void main(String [] args) {
		
		int num = 5;
		System.out.println(num<<1);
		/*
		 *          64  32  16  8  4  2  1
		 *   5      0   0   0   0  1  0  1  -->> 5
		 *  num<<1  0   0   0   1  0  1  0  -->> 10  5*2(2의1승) = 10
		 *  num<<2  0   0   1   0  1  0  0  -->> 20  5*4(2의2승) = 20
		 *  num<<3  0   1   0   1  0  0  0  -->> 40  5*8(2의3승) = 40
		 */
		
		
	}

}
