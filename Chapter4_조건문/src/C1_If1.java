import java.util.Scanner;

public class C1_If1 {

	public static void main(String[] args) {
		
		String grade = null;
		
		System.out.println("성적을 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();

		
		if(score >= 97) {grade = "A+";} 
		else if(score>=94) {grade = "A";}
		else if(score>=90) {grade = "A-";}
		
		else if(score >= 80) {grade = "B";}
		else if(score >= 70) {grade = "c";}
		else if(score >= 60) {grade = "d";}
		else {grade = "F";}
		
		System.out.println("점수는" + score + "점 이고 학점은" + grade + "입니다");
		System.out.printf("");
	}
}
	
