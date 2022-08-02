package newStudy;

public class Sort_KorEngMath {

	public static void main(String[] args) {
		
		String[] names = { "Junkyu", "Sangkeun", "Sunyoung", "Soong", "Haebin", 
				"Kangsoo", "Donghyuk", "Sei", "Wonseob", "Sanghyun", "nsj",
				"Taewhan" };		

		{
			
		}
		Integer[] score = new Integer[12];
		

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
