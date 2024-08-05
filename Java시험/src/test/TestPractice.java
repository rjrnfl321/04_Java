package test;

import java.util.ArrayList;

import student.StudentPractice;

public class TestPractice {

	public static void main(String[] args) {
		ArrayList<StudentPractice> list = new ArrayList<StudentPractice>();
		
		list.add(new StudentPractice("강지원" , 85));
		list.add(new StudentPractice("이호연" , 73));
		list.add(new StudentPractice("김학규" , 69));
		list.add(new StudentPractice("배형진" , 94));
		
		for(int i = 0; i< list.size(); i++) {
			StudentPractice s = list.get(i);
			System.out.println(s);
		}
	
	}

}
