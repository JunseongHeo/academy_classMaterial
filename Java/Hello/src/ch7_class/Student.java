package ch7_class;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	
	// ���� ����ϴ� �޼���
	void eval_sum() {
		sum = kor+eng+math;
	}
	
	// ��� ����ϴ� �޼���
	void eval_avg() {
		avg = (float) sum/3;
	}
	
	// �� ��ü�� ������ ����ϴ� �޼���
	void eval_info() {
	System.out.println("��ü "+name+"�� ����");
	System.out.println("�̸� : "+name);
	System.out.println("���� : "+kor);
	System.out.println("���� : "+eng);
	System.out.println("���� : "+math);
	System.out.println("���� : "+sum);
	System.out.println("��� : "+avg);
	System.out.println();
	}
	
	
}
