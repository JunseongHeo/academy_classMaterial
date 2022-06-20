package ch11;

public class MemberSortExample implements Comparable<MemberSortExample> {
	String name;
	public MemberSortExample( String name ) {
		this.name = name;
	}
	@Override
	public int compareTo(MemberSortExample o) {
		return name.compareTo(o.name);
	}
}
