package ch11;

import java.util.Arrays;

public class Member implements Cloneable { // �������� �ؾ���
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int[] scores;
	public Car car;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	public Member(String id) {
		this.id = id;
	}
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) { }
		return cloned;
	}
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
		Member cloned = (Member) super.clone();
		// score�� ���� ���� �Ѵ�. 
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car�� ���� ���� �Ѵ�.
		cloned.car = new Car(this.car.model);
		// ���� ������ Member ��ü�� ����
		return cloned;
	}
}
