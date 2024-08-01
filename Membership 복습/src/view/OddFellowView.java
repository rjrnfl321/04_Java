package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.OddFellowService;
import service.OddFellowServiceImpl;

// View : 사용자에게 보여지는 역할을 하는 클래스/객체
// - 보여질 화면을 출력 / 필요한 데이터 입력




public class OddFellowView {

	private OddFellowService service = null;
	private BufferedReader br = null;
	
	// 기본 생성자
	public OddFellowView () {
		
		try {
			// 객체 생성 중 발생한 예외를 View에 모아서 처리
			service = new OddFellowServiceImpl();
			// 키보드를 입력 받기 위한 스트림을 생성
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			
			System.out.println(" *** 프로그램 실행 중 오류가 발생했습니다.");
			e.printStackTrace();
			
			System.exit(99); // 프로그램을 종료시킴
		}
	}
	
	
	// --------------------------------------------------------------------------
	
	// [메인 메뉴] 
	public void mainMenu () { 
		
		int input = 0;
		do {
			try {
				// 메뉴 출력 후 입력된 번호를 반환 받기
				input = selectMenu();
				
				// 선택된 메뉴 번호에 따라 case 선택
				switch(input) {
				case 1 :	 break;
				case 2 : 	break;
				case 3 : 	break;
				case 4 : 	break;
				case 5 : 	break;
				case 6 : 	break;
				case 7 : 	break;
				case 99 : 	System.out.println(" *** 프로그램 종료하기 *** "); break;
				
				default : System.out.println(" ### 메뉴에 작성된 번호만 입력 해주십시오. ### ");
				
				}
			} catch (IOException e) {
				System.out.println("\n ### 숫자만 입력 해주십시오. ###\n");
				input = -1; // 첫 반복에 종료되지 않게 값 변경
			} catch (Exception e) {
				System.out.println("\n ### 입출력 관련 예외가 발생 \n");
				e.printStackTrace();
			}
		}
	}
	
	
	
	// --------------------------------------------------------------------------

	// [메뉴 출력 / 선택하는 메서드]
	
	private int selectMenu () throws NumberFormatException, IOException { 
		
		System.out.println("\n ===== 회원 관리 프로그램 =====\n");
		
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원 전체");
		System.out.println("3. 회원 이름 검색");
		System.out.println("4. 특정 회원 사용 금액 누적");
		System.out.println("5. 회원 정보 수정");
		System.out.println("6. 회원 정보 삭제");
		System.out.println("7. 회원 탈퇴");
		System.out.println("99. 프로그램 즉시 종료");
	
		System.out.print("메뉴 선택 >>> ");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println(); // 줄 바꿈
		return input;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
