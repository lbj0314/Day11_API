package com.iu.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
		
	//메서드 명은 studentInput
	//학생의 정보를 입력 받는것
	private Scanner sc;
	private String input;
	public StudentService() {
		sc = new Scanner(System.in);
		input = "";
	}
	Student stu = new Student();
	public void studentInput(ArrayList<Student> stus) {
		System.out.println("학생의 정보를 입력합니다.");
		System.out.println("-----------------------");
		
		Student stu = new Student();
		System.out.println("학생의 이름을 입력하세요.");
		stu.setName(sc.next());
		System.out.println("학생의 번호를 입력하세요.");
		stu.setNum(sc.nextInt());
		System.out.println("학생의 국어 점수를 입력하세요.");
		stu.setLang(sc.nextInt());
		System.out.println("학생의 영어 점수를 입력하세요.");
		stu.setEng(sc.nextInt());
		System.out.println("학생의 수학 점수를 입력하세요.");
		stu.setMath(sc.nextInt());
		
		stu.setSum(stu.getLang() + stu.getEng() + stu.getMath());
		stu.setAvg((double)stu.getSum()/3);
		
		stus.add(stu); //집어 넣기
	}//studentInput
	//메서드 명은 studentSearch
	//메서드가 하는 일은 학생의 이름을 입력 받아서 같은 학생의 정보를 리턴
	public Student studentSearch(ArrayList<Student> stus) {
		
		System.out.println("학생의 정보를 검색합니다.");
		System.out.println("-----------------------");
		System.out.println("학생의 이름을 입력하세요.");
		input = sc.next();
		
		Student stu = null;
		for (int i = 0; i < stus.size(); i++) {
			if (stus.get(i).getName().equals(input)) {
				stu = stus.get(i);
				break;
			}//if
			
		}//for
		return stu;
	}//studentSearch
	
	//메서드명 studentDelete
	//이름을 입력해서 삭제
	public Student studentDelete(ArrayList<Student> stus) {
		Student stu = null;
		System.out.println("삭제할 학생의 이름을 입력하세요.");
		input = sc.next();
		for (int i = 0; i < stus.size(); i++) {
			if (stus.get(i).getName().equals(input)) {
				stus.remove(i);
				break;
			}//if
		}//for
		return stu;
	}//studentDelete
}//class
