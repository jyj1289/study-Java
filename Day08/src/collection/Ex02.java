package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		// 리스트의 반복
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("Python");
		list.add("C lang");
		
		System.out.println("list = " + list + "\n");
		
		// 1. 일반 for
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("list[%d] = %s\n", i, list.get(i));
		}
		System.out.println();
		
		// 2. for-each : 요소를 한번씩 왼쪽 변수에 대입하며 반복 (= for n in list)
		for (String n : list) {
			System.out.println("n = " + n);
		}
		System.out.println();
		// 3. iterator : 순환자
		Iterator<String> it  = list.iterator();
		
		while (it.hasNext()) {		// hasNext() : 커서를 이동하지 안혹 다음 위치에 요소가 있는지 확인
									// - 있으면 true, 없으면 false
			
			String str = it.next();	// next() : 커서를 다음으로 이동 후, 그 위치의 요소를 반환
			
			System.out.println("str = " + str);
			
		}
	}
}
