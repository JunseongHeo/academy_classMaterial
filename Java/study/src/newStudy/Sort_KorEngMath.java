package newStudy;

public class Sort_KorEngMath {

	public static void main(String[] args) {
		
		String[] names = { "Junkyu", "Sangkeun", "Sunyoung", "Soong", "Haebin", 
				"Kangsoo", "Donghyuk", "Sei", "Wonseob", "Sanghyun", "nsj",
				"Taewhan" };		

		{
			
		}
		Integer[] score = new Integer[12];
		
		score[0]  = { 50, 60, 100 };
		
		String[1]  = { "80", "60", "50" };
		String[2]  = { "80", "70", "100" };
		String[3]  = { "50", "60", "90" };
		String[4]  = { "50", "60", "100" };
		String[5]  = { "60", "80", "100" };
		String[6]  = { "80", "60", "100" };
		String[7]  = { "70", "70", "70" };
		String[8]  = { "70", "70", "90" };
		String[9]  = { "70", "70", "80" };
		String[10]  = { "80", "80", "80" };
		String[11]  = { "50", "60", "90" };

		Student[] array = {
				
		};
	}

		
}
class Student implements Comparable<Student> {
	String name;
	int Kor;
	int Eng;
	int Math;
	
	public Student(String name, int Kor, int Eng, int Math) {
		this.name = name;
		this.Kor = Kor;
		this.Eng = Eng;
		this.Math = Math;
	}
	
	public int compareTo(Student s1) {
		
		return 1;
	}
}
