package condition.ex;

import java.util.Scanner;

/**
 * 조건문 예시 기능용 클래스
 */

public class ConditionEx {
	// 필드(field) == 멤버 변수 == 인스턴스 변수 (전역 변수 비슷)
	Scanner sc = new Scanner(System.in);

	/**
	 * 1 ~ 10 사이 난수가 짝수인지 홀수인지 출력
	 * 
	 */
	public void method1() {
		int ran = (int) (Math.random() * 10 + 1);
		if (ran % 2 != 1) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	/**
	 * 나이를 입력 받아 13세 이하 : 어린이 14세 이상 19세 이하 : 청소년 20세 이상 : 성인
	 * 
	 * 구분하여 출력하기
	 */
	public void method2() {
		int age = sc.nextInt(); // 필드 sc 이용
		String result;

		if (age <= 13) {
			result = "어린이";

		} else if (age <= 19) {
			result = "청소년";

		} else {
			result = "성인";
		}

		System.out.println(result);
	}

	/**
	 * 나이를 입력 받아 13세 이하 : 어린이 14세 이상 19세 이하 : 청소년 14 ~ 16 : 청소년 (중) 17 ~ 19 :청소년 (고)
	 * 20세 이상 : 성인 0 이하 또는 100 초과 : 잘못 입력하셨습니다
	 * 
	 * 구분하여 출력하기
	 * 
	 */

	public void method3() {
		int age = sc.nextInt();
		String result;

		if (age <= 0 || age > 100)
			result = "잘못 입력하셨습니다";
		else if (age <= 13)
			result = "어린이";
		else if (age <= 19)
			result = "청소년" + ((age <= 16) ? "(중)" : "(고)");

		else
			result = "성인";

		System.out.println(result);

	}

	/**
	 * [switch 를 이용한 메서드 호출]
	 * 
	 */

	public void displayMenu() {
		System.out.println("1. method1() - 난수 홀짝");
		System.out.println("2. method2() - 나이 구분1");
		System.out.println("3. method3() - 나이 구분2");
		System.out.println("3. method4() - 계절 찾기");

		System.out.print("번호 선택 >> ");
		int num = sc.nextInt();
		System.out.println("------------------------------------");
		switch (num) {
		case 1:
			method1();
			break; // 1 입력시 메서드 1 호출
		case 2:
			method2();
			break;
		case 3:
			method3();
			break;
		case 4:
			method3();
			break;
		default:
			System.out.println("잘못 입력 하셨습니다");
		}
	}

	/**
	 * [switch] 입력된 달(월)의 계절 출력하기
	 */
	public void method4() {
		System.out.println("달(월) 입력 :");
		int month = sc.nextInt();

		String result;
		switch (month) {
		// case를 연속해서 작성하는 여러 방법

		// 1) 세로로 쭉
		case 3:
		case 4:
		case 5:
			result = "봄";
			break;

		// 2) 가로로 쭉
		case 6:
		case 7:
		case 8:
			result = "여름";
			break;

		// 3) case 값, 값, 값 형식
		case 9, 10, 11:
			result = "가을";
			break;
		case 12, 1, 2:
			result = "겨울";
			break;
		default:
			result = "잘못 입력";

		}
		// switch end
		System.out.println(result);

	}

	/**
	 * [성적 판별기]
	 * 
	 * 중간고사 , 기말고사 , 과제 점수를 입력 받아 성적 부여
	 * 
	 * 
	 * - 중간고사 (40%), 기말고사 (50%), 과제(10%)
	 * 
	 * - 입력 시 각각 100점 만점으로 입력 받음
	 * 
	 * - 합산된 점수에 따라 성적 부여 95점이상 : A+ 90점이상 : A 85점이상 : B+ 80점이상 : B 75점이상 : C+ 70점이상
	 * : C 65점이상 : D+ 60점이상 : D 나머지 : F
	 *
	 *
	 * [실행 화면] 이름 : 홍길동 중간고사 점수(40%) : 100 기말고사 점수(50%) : 80 과제 점수(10%) : 50
	 * 
	 * 최종 점수 : 85점 성적 : B+
	 */
	public void method5() {
		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("중간고사 점수(40%) : ");
		int a = sc.nextInt();

		System.out.print("기말고사 점수(50%) : ");
		int b = sc.nextInt();

		System.out.print("과제 점수(10%) : ");
		int c = sc.nextInt();

		double sum = (a * 0.4 + b * 0.5 + c * 0.1); // 지역 변수 합계 생성

		String result;
		if (sum >= 95) {
			result = "A+";
		} else if (sum >= 90) {
			result = "A";
		} else if (sum >= 85) {
			result = "B+";
		} else if (sum >= 80) {
			result = "B";
		} else if (sum >= 75) {
			result = "C+";
		} else if (sum >= 70) {
			result = "C";
		} else if (sum >= 65) {
			result = "D+";
		} else if (sum >= 60) {
			result = "D";
		} else
			result = "F";
		System.out.println();

		System.out.println(name + "의 최종 점수 : " + sum);

		System.out.println("성적 : " + result);

	}
	/**
	 * [성적 판별기]
	 * 
	 * 중간고사 , 기말고사 , 과제 점수를 입력 받아 성적 부여
	 * 
	 * 
	 * - 중간고사 (40%), 기말고사 (50%), 과제(10%)
	 * 
	 * - 입력 시 각각 100점 만점으로 입력 받음
	 * 
	 * - 합산된 점수에 따라 성적 부여
	 * 
	 * 95점이상 : A+
	 * 90점이상 : A
	 * 85점이상 : B+
	 * 80점이상 : B
	 * 75점이상 : C+
	 * 70점이상	: C
	 * 65점이상 : D+
	 * 60점이상 : D
	 * 나머지 : F
	 *
	 *
	 * [실행 화면] 이름 : 홍길동 중간고사 점수(40%) : 100 기말고사 점수(50%) : 80 과제 점수(10%) : 50
	 * 
	 * 최종 점수 : 85점 성적 : B+
	 */
	
	
	public void method6() {
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("중간고사 점수(40%) :");
		int a1 = sc.nextInt();
		System.out.println("기말고사 점수(40%) :");
		int a2 = sc.nextInt();
		System.out.println("과제 점수(20%) :");
		int a3 = sc.nextInt();
		// 지역 변수 합계 생성
		double sum = (a1 * 0.4 + a2 * 0.4 + a3 * 0.2);
		String result;
		if(sum >= 95) { result = "A+"; }
		else if (sum >= 90) { result = "A"; }
		else if (sum >= 85) { result = "B+"; }
		else if (sum >= 80) { result = "B"; }
		else if (sum >= 75) { result = "C+"; }
		else if (sum >= 70) { result = "C"; }
		else if (sum >= 65) { result = "D+"; }
		else if (sum >= 65) { result = "D"; }
		else result = "F";
		
		System.out.println(name + "의 최종 점수 : " + sum);
		
		System.out.println("성적  : " + result);
	
	}
	
	
	
	
	
	
	
	
	
	
	public void method7() {
		System.out.println("이름 : ");
		
		
	}
	
	

	
}


//방법 1

//if(sum >= 95) {
//	result = "A+";
//} else if(sum >= 90) {
//	result = "A";
//} else if(sum >= 85) {
//	result = "B+";
//} else if(sum >= 80) {
//	result = "B";
//} else if(sum >= 75) {
//	result = "C+";
//} else if(sum >= 70) {
//	result = "C";
//} else if(sum >= 65) {
//	result = "D+";
//} else if(sum >= 60) {
//	result = "D";
//} else result = "F";

//방법 2
/*
* if(sum >= 90) result = "A" + ( sum>=95 ? "+" : "" ); else if(sum >= 80)
* result = "B" + ( sum>=85 ? "+" : "" ); else if(sum >= 70) result = "C" + (
* sum>=75 ? "+" : "" ); else if(sum >= 60) result = "D" + ( sum>=65 ? "+" : ""
* ); else result = "F";
*/

//방법 3
/*
* switch( (int)sum/5 ) { case 20, 19 : result = "A+"; break; case 18 : result =
* "A"; break; case 17 : result = "B+"; break; case 16 : result = "B"; break;
* case 15 : result = "C+"; break; case 14 : result = "C"; break; case 13 :
* result = "D+"; break; case 12 : result = "D"; break; default : result = "F";
* }
*/

//
