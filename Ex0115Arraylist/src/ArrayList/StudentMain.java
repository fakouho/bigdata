package ArrayList;
 
import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// 1. Student 자료형 보관할 수 있는 sList 라는 이름을 가진 Arraylist 생성
		ArrayList<Student> sList = new ArrayList<Student>();
		
		// 2. 데이터 추가(짝궁의 이름, 나이를 가지고 있는 데이터 추가)
		
		sList.add(new Student("김상원", 25));
		

		
		// 3. 짝꿍의 이름 출력
		System.out.println(sList.get(0).getName());
		// 본질적으로 어떤 자료형인지 확인할 것이!!
		// sList.get(0) --> return type : Student ---> 객체
		
		sList.add(new Student("김상원", 25));
		sList.add(new Student("정연재", 27));
		sList.add(new Student("노승우", 27));
		sList.add(new Student("조은해", 23));
		
		for(Student s : sList) {
			System.out.println(s.getName()+"\t"+s.getAge());
			
		}
		
		
		
		
		

	}

}
