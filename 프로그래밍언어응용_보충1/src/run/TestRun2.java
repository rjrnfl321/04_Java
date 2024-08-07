package run;

import java.util.HashSet;
import java.util.Scanner;

public class TestRun2 {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("문미미");
		set.add("박보배");
		set.add("송성실");
		set.add("윤예의");
		set.add("정재주");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요 : ");
		String input = sc.next(); /**1번 원인**/
		
		boolean isExist = false;
		for(String name : set) {  /** 2번 원인 **/ 
			if(name.equals(null)) { /** 3번 원인 **/
				isExist = true;
				return;
			}
			break;
		}
		
		
		if(!isExist) {
			System.out.println("존재하는 회원입니다.");
		} else {
			System.out.println("존재하지 않는 회원입니다.");
		}
		
	}
}



/* 원인 1 : 19번째 구문에서 String으로 변수가 선언이 됐다.
 * 			하지만 정수형을 입력받는 메소드가 sc.nextIne();로 지정되있고
 * 			자료형이 맞지않아 에러가 발생함
 * 
 * 해결방법 1 : 키보드 입력값을 문자열의 자료형에 맞게 수정함
 * 				sc.nextInt() -> sc.next(); 또는 sc.nextline();
 */

/* 원인 2 : 21번째 구문에 일반 for문을 이용하여 다루고 있는 i 값을 통해서
 * 			set에 i번째 인덱스를 가져오려고한다 
 * 			하지만 set은 인덱스가 없어서 에러가 발생
 * 
 * 해결방법 2 : 일반 for문에서 향상된 for문으로 변경하였다.
 * 				for( int i = 0; i < set.size(); i++ )
 * 				-> for ( String name : set)으로 변경
 */

/* 	원인 3 : 22번 구문에 if문은 문자열 비교 시
 * 			 객체 참조를 비교하는 비교연산자 (==)를 사용해서
 * 			 값이 아닌 주소를 비교하여서 에러가 발생함
 * 
 * 해결방법 3 : 문자열을 비교하는 메서드인 equals를 사용
 * 				사용자가 어떤 이름을 입력하지 모르기에
 * 				어떤 객체도 가리키지 않는 값인 null을 매개 변수에 추가
 * 				if (name == input) -> if(name.equals(null)
 * 				
 */

/*	원인 4 : 저장되어 있지 않은 이름을 검색해도 존재한다는 문제가 발생
 * 			 저장된 이름이 아닌 이름을 입력했을 때 존재하지 않음을 출력하는
 * 			 처리가 되어있지 않음
 * 
 * 	
 */

 