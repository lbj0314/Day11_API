package com.iu.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	private ArrayList<Student> stus;
	private StudentService ss;
	private StudentView sv;
	private Scanner sc;
	
	public StudentMenu() {
		stus = new ArrayList<Student>();
		ss = new StudentService();
		sv = new StudentView();
		sc = new Scanner(System.in);
	}//생성자
	
	public void start() {

		//1. 학생 정보 등록
		//2. 학생 전체 정보 출력
		//3. 학생 정보 조회 - 이름으로 검색
		//4. 학생 정보 삭제
		//5. 프로그램 종료
		
		int select = 0;
		boolean check = true;
		while (check) {
			System.out.println("원하는 메뉴의 숫자를 입력해주세요.");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 전체 정보 출력");
			System.out.println("3. 학생 정보 조회 - 이름으로 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 프로그램 종료");
			select = sc.nextInt();
			switch (select) {
			case 1:
				
				ss.studentInput(stus);
				break;
			case 2:
				
				sv.view(stus);
				break;
			case 3:
				
				Student stu = ss.studentSearch(stus);
				sv.view(stu);
				break;
			case 4:
				ss.studentDelete(stus);
//				ss.studentDelete(stus, stu);
				
				
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				check = !check;
			}
		}


	}




}
