package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ArrayList
		// : 크기가 가변적인 배열과 같은 형태를 기졌다.**클래스**
		
		// 1. ArrayList 생성
		// : 래퍼런스 타입의 데이터만 저장할 수 있다.(Ex=String,...)
		ArrayList<String> list = new ArrayList<String>();
		// 제네릭 기법 -> 자바 책 390p
		
		// 2. 데이터 추가하기
		list.add("진주강");
		list.add("김상원");
		list.add("정연재");
	
		// 3. 데이터 가져오기
		System.out.println( list.get(1));
		
		// 4. 데이터를 특정 위치에 추가하기
		list.add(2, "고등어");
		System.out.println(list.get(2));
		
		// 5. 데이터 삭제하기
		list.remove(2);
		System.out.println(list.get(2));
		
		// 6. 데이터의 크기 알아보기
		System.out.println("list의크기 : "	+	list.size());

		// 7. 데이터 전체 삭제하기
		list.clear();
		System.out.println("clear를 사용한후 list의 크기 " + list.size());
		
	
	
	}

}
