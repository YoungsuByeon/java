import java.util.Scanner;

public class Ex2_잔돈단위환산기 {

	public static void main(String[] args) {
		
		final int 오만원 = 50000;
		final int 만원 = 10000;
		final int 천원 = 1000;
		final int 오백원 = 500;
		final int 백원 = 100;
		final int 오십원 = 50;
		final int 십원 = 10;
		final int 일원 = 1;
		
		//안내문구
		System.out.println("금액을 지불하여 주세요");
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		int 입금액 = sc.nextInt();
		
		//금액을 거스름돈 단위로 환산처리
		int 몫_매수 = 입금액/오만원;   // 오만원권 몇장?
		입금액 = 입금액 % 오만원;  // 입금액을 오만원권 빼고 나머지로 갱신
		if(몫_매수>0) {
			System.out.println("오만원권 " + 몫_매수 + "매");
		}
		
		몫_매수 = 입금액/만원;    // 만원권 몇장?
		입금액 = 입금액 % 만원;
		if(몫_매수>0) {
			System.out.println("만원권 " + 몫_매수 + "매");
		}
		
		몫_매수 = 입금액/천원;
		입금액 = 입금액 % 천원;
		if(몫_매수>0) {
			System.out.println("천원권 " + 몫_매수 + "매");
		}
		
		몫_매수 = 입금액/오백원;
		입금액 = 입금액%오백원;
		if(몫_매수>0) {
			System.out.println("오백원 " + 몫_매수 + "개");
		}
		
		몫_매수 = 입금액/백원;
		입금액 = 입금액%백원;
		if(몫_매수>0) {
			System.out.println("백원 " + 몫_매수 + "개");
		}
		
		몫_매수 = 입금액/십원;
		입금액 = 입금액%십원;
		if(몫_매수>0) {
			System.out.println("십원 " + 몫_매수 + "개");
		}
		
		몫_매수 = 입금액/일원;
		입금액 = 입금액%일원;
		if(몫_매수>0) {
			System.out.println("일원 " + 몫_매수 + "개");
		}
	}
	
}