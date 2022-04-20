package ch7_class;

public class StudentMain2 {

	public static void main(String[] args) {
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
				
		s4.name = "유재석";
		s4.kor = 70;
		s4.eng = 80;
		s4.math = 90;
		s4.eval_sum();
		s4.eval_avg();
		s4.eval_info();
		
		s5.name = "박명수";
		s5.kor = 100;
		s5.eng = 80;
		s5.math = 76;
		s5.eval_sum();
		s5.eval_avg();
		s5.eval_info();
		
		s6.name = "정형돈";
		s6.kor = 99;
		s6.eng = 88;
		s6.math = 77;
		s6.eval_sum();
		s6.eval_avg();
		s6.eval_info();
		
	}

}
