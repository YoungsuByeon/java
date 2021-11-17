import java.util.Scanner;

public class OP2_산술연산자 {
	public static void main (String [] args) {
		
		int time;
		int second;
		int minute;
		int hour;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 시간을 초단위로 입력해 주세요.");
		
		time = sc.nextInt();
		
		sc.close();
		
		second = time % 60;         //초
		minute = (time/60) % 60;    //분
		hour = (time/60) / 60;      //시간
		
		System.out.println("입력받은" + time + "초는 ");
		System.out.print(hour + "시간 " + minute + "분 " + second + "초입니다");
	}

}
