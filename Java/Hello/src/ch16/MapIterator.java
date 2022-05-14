package ch16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("�б���", "���ѹα��б�"); // 9~11 ���� �����ϰ� 3���� ���� ���� 
		map.put("�а���", "��ǻ�� ���а�");
		map.put("�г�", "3�г�"); 
		
		String key, value;
		
		System.out.println("iterator�� key�� ����"); 
		Iterator<String> keyIterator = map.keySet().iterator(); // key�� ����� Iterator�� ����
		while(keyIterator.hasNext()) { // key�� ���������� �ݺ��϶�� �ǹ�
			key = keyIterator.next(); // key�� �ϳ��� �о� ���� key�� ����
			value = map.get(key); // key�� ���� �о� ���� value�� ����
			System.out.println(key + ":" + value); // ����� key�� value ���
		}
		System.out.println("\niterator�� value�� ����");
		Iterator<String> valueIterator = map.values().iterator(); // value�� ����� iterator�� ����
		while (valueIterator.hasNext()) { // value�� �ִ� �� �ݺ��Ͽ� value�� �ϳ��� �о ���
			System.out.println(valueIterator.next());
		}
	}
}
