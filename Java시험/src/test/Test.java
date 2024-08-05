package test;

import java.util.ArrayList; 

import student.Student;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("강건강", 84));
		list.add(new Student("남나눔", 78));
		list.add(new Student("도대담", 96));
		list.add(new Student("류라라", 67));
		
		
		for(int i = 0; i < list.size(); i++) {
			
			Student s = list.get(i);
			System.out.println(s);
			
			
		}
	
		
	}
	
	
	
}


/* 1. 원인 : Test 클래스에서 Student 객체 생성 시
*			 매개 변수 생성자가 작성되지 않아서
*  			 호출할 수 없는 문제가 발생
*
* 	  해결방법 : 매개 변수 생성자 만들기
*/

// ----------------------------------------------------------------------------------

/* 2. 원인 : for문의 조건식에서 list(컬렉션)의
 * 			 크기를 구할 때 잘못된 메서드 length()를 호출함
 * 
 * 	  해결방법 : 컬렉션에 저장된 객체의 개수를 반환하는 list.size() 호출

*/

// ----------------------------------------------------------------------------------

/* 3.  원인 : list 참조변수가 참조하는 객체가 생성되지 않아서
 * 			  list.add() 수행시 NullPointerException 발생
 * 
 * 	   해결방법 : list가 참조할 객체를 생성
 * 				   list = new ArrayList<Student>();
 */
// -----------------------------------------------------------------------------------

/* 4.  원인 : for문 내 println() 구문에서 s 출력 시
 * 		  	  자동으로 toString()이 호출 되는데
 * 	          Object.toString()을 호출해 반환하고 있어서
 * 	          주소 형태로 출력되는 문제 발생
 * 
 * 	   해결방법 : Student.toString()를
 * 				  요구사항에 맞는 형태로 변경
 * 
 */    




