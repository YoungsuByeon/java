/*
 * AND(&) : 전부 1이면 1
 * OR(|)  : 전부 0이면 0
 * XOR(^) : 같으면 0, 그외는 1
 */




public class OP5_비트연산자 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 5;
		
		int result = n1 & n2;
		
		// 비트연산자 AND(&) 계산하는 방법
		/*       16 8 4 2 1
		 * ----------------------
		 * n1 10  0 1 0 1 0
		 * n2 5   0 0 1 0 1
		 * ----------------------
		 * AND(&) 0 0 0 0 0  >> 0
		 */
		
		System.out.println(result);
		
		
		result = n1 | n2;
		// 비트연산자 AND(&) 계산하는 방법
		/*       16 8 4 2 1
		 * ----------------------
		 * n1 10  0 1 0 1 0
		 * n2 5   0 0 1 0 1
		 * ----------------------
		 * OR(|)  0 1 1 1 1 >> 15
		 */
		System.out.println(result);

	}

}
