package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee ely = new Employee();
		
		Employee[] emp = new Employee[3];
		
		int sum = 0;
		double avg3 = 0;
		double yearSum = 0;
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		System.out.print("emp[0] : " + emp[0].information());
		System.out.print("\nemp[1] : " + emp[1].information());
		System.out.print("\nemp[2] : " + emp[2].information());
		System.out.println("\n=====================================");

		emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'm', 3000000, 0.2, "01055559999", "전라도 광주");
		emp[1] = new Employee(1, "홍길동", "기획부", "부장", 19, 'm', 4000000, 0.3, "01022223333", "서울 잠실");
		
		
	
		for (int i = 0; i < emp.length; i++) {
			yearSum += (emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint())) * 12;
		}
		avg3 = yearSum / 3;
		
	
		
		
		System.out.print("emp[0] : " + emp[0].information());
		System.out.print("\nemp[1] : " + emp[1].information());
		System.out.println("\n=====================================");
		System.out.printf("김말똥의 연봉 : %.0f\n" , (emp[0].getSalary()+(emp[0].getSalary()*emp[0].getBonusPoint())) * 12,"원");
		System.out.printf("홍길동의 연봉 : %.0f\n" ,(emp[1].getSalary()+(emp[1].getSalary()*emp[1].getBonusPoint())) * 12,"원");
		System.out.printf("강말순의 연봉 : %.0f\n" ,(emp[2].getSalary()+(emp[2].getSalary()*emp[2].getBonusPoint())) * 12,"원");
		System.out.println("=====================================");
		System.out.printf("직원들의 연봉의 평균 : %.0f", avg3);
	}

}
