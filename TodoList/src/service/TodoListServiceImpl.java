package service;

import java.io.IOException;

import dao.TodoListDAO;
import dao.TodoListDAOImpl;

public class TodoListServiceImpl implements TodoListService{

	private TodoListDAO dao = null;
	
	
	
	public TodoListServiceImpl() throws NoSuchFieldError,IOException,ClassNotFoundException {
		
		// 객체 생성시 TodoListDAO 객체 생성
		dao = new TodoListDAOImpl();
	}
}
