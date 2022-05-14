package ch16;
							// 프로그램의 메뉴를 운영하는 클래스로 입출력에 사용할
import java.util.ArrayList; // Scanner 객체, 사용자의 메뉴입력값을 저장할 menu,
import java.util.Scanner;   // 프로그램의 반복/종료를 제어할 flag 멤버변수를 갖는다

public class MemberMenu {
	private Scanner scanner = new Scanner(System.in);
	private int menu;
	boolean flag = true;
	private String menuStr = "1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.데이터초기화 7.종료";
	
	public void menuProcess(ArrayList<Member> data) { 
		int idx = 0;
		while (flag) {
			System.out.println(menuStr);
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				data.add(infoInput());
				break;
			case 2:
				idx = search(data);
				printMember(data.get(idx));
				break;
			case 3:
				editMember(data);
				break;
			case 4:
				delMember(data);
				break;
			case 5:
				for ( idx=0; idx<data.size(); idx++) {
					printMember(data.get(idx));
				}
				break;
			case 6:
				data.removeAll(data);
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	public Member infoInput() { // 사용자로부터 name, tel, address를 입력받아 
		System.out.println("이름"); // Member객체를 생성하여 반환한다.
		String name = scanner.next(); // case 1:에서 이 메서드를 호출해
		System.out.println("전화번호"); // 반한받은 Member 객체를 리스트에 추가한다.
		String tel = scanner.next(); 
		scanner.nextLine();
		System.out.println("주소");
		String address = scanner.nextLine();
		return new Member(name, tel, address);
	}
	public int search(ArrayList<Member> data) { // 검색을 담당하는 메서드
		System.out.println("이름");	// 이름을 입력받아, 리스트에서 그 이름이 있는 위치를 찾아 반환
		String name = scanner.next(); // 이 기능은 검색뿐 아니라 수정, 삭제에서도 수정, 삭제할 데이터의
		for( int i = 0; i<data.size(); i++) { // 위치를 찾아야하므로 사용
			if(name.equals(data.get(i).getName())) { // case 2: 에서 search()로 검색한 위치를 전달받아(22)오고
				return i; // 23번줄에서 get()으로 그 위치에 있는 값을 꺼내어 출력
			}
		}
		return 0;
	}
	public void editMember(ArrayList<Member> data) { // 수정을 처리하는 메서드로
		int idx = search(data); // 먼저 search()를 호출해 수정할 데이터의 위치를 찾는다.
		System.out.println("새 전화번호"); // 그리고 새 데이터를 입력받아
		String tel = scanner.next(); // set()으로 그 위치의 객체를 새 Member객체로 교체.
		scanner.nextLine();
		System.out.println("새 주소");
		String address = scanner.nextLine();
		data.set(idx, new Member(data.get(idx).getName(), tel, address));
	}
	public void delMember(ArrayList<Member> data) { // 삭제 메서드로 search()를 호출해 
		int idx = search(data); // 삭제할 데이터의 위치를 찾고
		data.remove(idx); // remove()로 데이터를 제거한다.
	} 
	public void printMember(Member m) { // Member객체 하나를 파라메터로 받아 처리한다.
		System.out.println(m);
	}
}

