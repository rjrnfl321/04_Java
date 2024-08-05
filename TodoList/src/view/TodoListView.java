package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {

	
	
	private TodoListService service = null;
	private BufferedReader br = null;
	
	public TodoListView ( ) {
		
		try {
			service = new TodoListServiceImpl();
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			System.out.println(" *** 프로그램 실행 중 오류 발생 ***");
			e.printStackTrace();
			
			System.exit(0); // 프로그램 종료
		}
		
	}
	
	
	// -------------------------------------------------------------------------
	// [Todo List 화면 시작]
	
	public void startView () {
		
		int selectNumber = 0;
		
		do {
			try { 
				selectNumber = selectMenu();
				
				switch(selectNumber) {
				
				case 1 : todoListFullView(); break;
				case 2 : todoDetailView();   break;
				case 3 : todoAdd(); 		 break;
				case 4 : todoComplete();     break;
				case 5 : todoUpdate(); 		 break;
				case 6 : todoDelete(); 		 break;
				
				case 0 : System.out.println("*** 프로그램 종료 ***");
						  br.close();
				break;
				
				default : System.out.println(" ### 메뉴에 작성된 번호만 입력 해주세요 ### ");
				
				}
				System.out.println(" =============================");
				
				
			} catch (NumberFormatException e) {
				System.out.println("\n ### 숫자만 입력 해주세요 \n");
			} catch (IOException e) {
				System.out.println("\n ### 입출력 관련 예외 발생 ### \n");
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (selectNumber !=0 ) ;
		
		try {
			if (br != null) br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// ----------------------------------------------------------------------------------------
	
	
	/**
	 * 메뉴 출력 및 선택
	 * @return 선택한 메뉴 번호 반환
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	private int selectMenu() throws NumberFormatException, IOException {
		
		
		System.out.println("\n ===== Todo List ===== \n");
		
		System.out.println("1. Todo List Full view ");
		System.out.println("2. Todo Detail View ");
		System.out.println("3. Todo Add ");
		System.out.println("4. Todo Complete ");
		System.out.println("5. Todo Update ");
		System.out.println("6. Todo Delete ");
		
		System.out.println("0. EXIT ");
		
		System.out.print("select menu number >>> ");
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		return input;
	}
	
	
	/* 할 일 목록 모두 보기 */ 
	
	
	private void todoListFullView() {
		System.out.println("\n ========== [1. Todo List Full View] ==========\n");
		
		// 할 일 목록, 완료 개수
		
		Map<String, Object> map = service.todoListFullView();
	}
	
	
	
}
