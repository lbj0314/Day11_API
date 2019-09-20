package com.iu.stringtokniger.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberMaker {
	
	private String memberInfo;
	
	public MemberMaker(){
		this.memberInfo = "momo-momo-24-sana-sana-24-nayeon-nayeon-25";
	}

	public void makeMember() {
		//memberInfo의 내용을 파싱해서
		//Member 객체를 생성해서
		//모든 정보를 출력
		//string tokeniger 로
//		String [] info = memberInfo.split("-");
		StringTokenizer st = new StringTokenizer(this.memberInfo, "-");
		ArrayList<Member> arr = new ArrayList<Member>();
//		int idx = 0;
//		for (int i = 0; i < info.length; i++) {
//			m.setId(info[i]);
//			m.setName(info[++i]);
//			m.setId(info[++i]);
//		}
		while (st.hasMoreTokens()) {
			Member m = new Member();
			m.setId(st.nextToken()); //문자열 파싱
			m.setName(st.nextToken());
			m.setAge(Integer.parseInt(st.nextToken()));
//			m.setId(s1);
//			m.setName(s2);
//			m.setAge(s4);
			arr.add(m);
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println("id : " + arr.get(i).getId());
			System.out.println("name : " + arr.get(i).getName());
			System.out.println("age : " + arr.get(i).getAge());
		}
		
		
	}

//	public String getMemberInfo() {
//		return memberInfo;
//	}
//
//	public void setMemberInfo(String memberInfo) {
//		this.memberInfo = memberInfo;
//	}
//	
	
	
	
}
