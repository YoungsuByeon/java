
// 상수는 대문자로 적어야 한다
public class Type5_상수 {
	public static void main (String [] args) {
		
		final double PI = 3.14;    //final은 상수를 표현하는 명령어
		double radius = 10;
		
		double circlearea = 0;
		//double circlelength = 0;
		
		circlearea = radius * radius * PI;
		//circlelength = (radius*2)*PI;
		
		System.out.println("원의 면적:"+circlearea);
		//System.out.println("원의 둘레:"+circlelength);
	}

}
