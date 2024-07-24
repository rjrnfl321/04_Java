import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// 과일 바구니 만들기
		// 과일 이름을 5개 담을 수 있는 배열을 생성하고
		// 과일 이름이 5개가 배열에 저장될 때 까지 반복
		// 단, 중복되는 과일이 존재하는 경우 추가 X

		String[] fruits = new String[5];
		// 문자열로 된 5칸의 배열을 생성하고 fruits에 저장
		
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 입력을 받는 Scanner 객체를 생성
		
		int index = 0;
		/* index는 배열에 저장되있는 과일 이름의 개수를 추적한다.
		 * index의 초기값은 0이고, 새로운 과일 이름이 배열에 추가될시 1씩 증가
		 */
		
		while (index < 5) {
		/* while문은 특정 조건을 만족할때까지 무한반복한다.
		 * 무한반복 대신 배열의 맞게
		 * index가 5보다 작을때까지만이라는 조건을 사용
		 * 배열이 5칸이기때문에 과일 입력을 5개 입력 받을때까지
		 * 계속 반복함
		 * 
		 */
		
			System.out.print("과일 이름 입력 >>> ");
			// 사용자가 과일 이름을 입력할 수 있는 메시지 출력
			
			String f = sc.nextLine();
			/* sc.nextInt()는 정수를 입력받는 메소드(기능)이다.
			 * 과일의 이름은 String(문자열) 이므로
			 * sc.next() 또는 sc.nextLine()으로 수정
			 */

			boolean flag = false;
			// flag 라는 이름의 변수를 선언
			// 중복 여부를 확인함, 초기값은 중복이 없음을 의미한다.
			
			for (int i = 0; i < index; i++) { /* for는 변수 i를 0으로 초기화하고
			 * i가 index보다 작을때까지 반복한다. i는 각 반복에서 1씩 증가 */ 
				
				if (fruits[i].equals(f)) { /* fruits[i]는 배열의 'i'번째 요소
					 equals(f)는 입력된 과일 이름 f와 배열의 i번째 요소를 비교한다
					 equals 메소드(기능)은 두 문자열이 동일한지 여부를 확인한다
					 == 연산자는 객체 참조를 비교하고, 문자열 비교는 equals 메소드 사용 */
				
					flag = true;
					break;
					/* 만약에 fruits[i]가 f와 같다면, 입력된 과일 이름이 중복일 시
					   flag를 true로 설정한다. break으로 for를 즉시 종료한다 */
					 
				}
			}
			/* flag 변수의 값에 따라 새로운 과일 이름을 배열에 추가할지
			 * 아니면 중복 메시지를 출력할지 결정한다. */
			if (!flag) { /* !flag는 flag의 값을 반전시킴, --- flag가 false일때 실행 ---
			(중복되는 과일 이름이 없을 떄) 내부 코드 실행 */
				fruits[index] = f;
				index++;
				/* --- fruits[index] = f;는 입력된 과일 이름 'f'를
				 * fruits라는 배열에 현재 index 위치에 저장한다 ----
				 * index++는 index 변수를 1 증가시킨다
				 * 이것은 다음 과일 이름을 배열의 다음 위치에 저장할수 있게한다.*/
			} else { /* --- else는 flag가 true일때 실행이 됩니다 --- 
			 			이는 입력된 과일이 이미 존재하는 경우를 의미함 */ 
				System.out.println(f + "는 이미 바구니에 존재합니다");
			}

		}

		System.out.println("과일 목록 : " + Arrays.toString(fruits));
	}
}


/*
 * 프로그래밍활용 수정내용

	1) while (true)  ㅡㅡㅡ> while (index < 5)
	
	while문은 특정 조건을 만족할때까지 무한반복한다.
	무한반복 대신 배열의 맞게
	index가 5보다 작을때까지만이라는 조건을 사용
	배열이 5칸이기때문에 과일 입력을 5개 입력 받을때까지 계속 반복함


	2) String f = sc.nextInt(); ㅡㅡㅡ> String f = sc.nextLine(); 또는 String f = sc.next();
	
	sc.nextInt()는 정수를 입력받는 메소드(기능)이다.
	과일의 이름은 String(문자열) 이므로
	 sc.next() 또는 sc.nextLine()으로 수정


	3) if (fruits[i] == f) ㅡㅡㅡ> if (fruits[i].equals(f))

	fruits[i]는 배열의 'i'번째 요소 equals(f)는 입력된
	과일 이름 f와 배열의 i번째 요소를 비교한다
	equals 메소드(기능)은 두 문자열이 동일한지 여부를 확인			 
	== 연산자는 객체 참조를 비교하고, 문자열 비교는 equals 메소드 사용


	4) if (!flag) ㅡㅡㅡ> if (!flag) 

	!flag는 flag의 값을 반전시킴
	flag가 false일때 실행 (중복되는 과일 이름이 없을 떄) 내부 코드 실행


 */



