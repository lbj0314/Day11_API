package com.iu.collection.ex2;

import java.util.ArrayList;

public class StudentView {
	
	//메서드 명 view
	//학생 한명 출력
	public void view(Student stu) {
		if (stu != null) {
			System.out.println("학생의 정보를 조회합니다.");
			System.out.println("-----------------------");
			System.out.println("이름 : "+stu.getName());
			System.out.println("번호 : "+stu.getNum());
			System.out.println("국어 : "+stu.getLang());
			System.out.println("영어 : "+stu.getEng());
			System.out.println("수학 : "+stu.getMath());
			System.out.println("총점 : "+stu.getSum());
			System.out.println("평균 : "+stu.getAvg());
			System.out.println("-----------------------");
		}else {
			System.out.println("학생의 정보가 일치하지않거나 존재하지 않습니다.");
		}
	}
	//메서드 명 view
	//학생들의 정보를 전부 출력

	public void view(ArrayList<Student> stus) {
		System.out.println("전체 학생의 정보를 조회합니다.");
		
		for (int i = 0; i < stus.size(); i++) {
			System.out.println("이름 : "+stus.get(i).getName());
			System.out.println("번호 : "+stus.get(i).getNum()+"번");
			System.out.println("국어 : "+stus.get(i).getLang()+"점");
			System.out.println("영어 : "+stus.get(i).getEng()+"점");
			System.out.println("수학 : "+stus.get(i).getMath()+"점");
			System.out.println("총합 : "+stus.get(i).getSum()+"점");
			System.out.println("평균 : "+stus.get(i).getAvg()+"점");
			System.out.println("-----------------------");
		}//for
	}//view
		
	
}
