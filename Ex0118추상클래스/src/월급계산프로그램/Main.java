package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		RegularEmployee rea= new RegularEmployee("SMHRD001","임경남",7000, 700);
		System.out.println(rea.print());
		
		TempEmployes tem= new TempEmployes("SMHRD002", "박0수", 3000);
		System.out.println(tem.print());
		
		PratTimeEmployee part=new PratTimeEmployee("SMHRD003", "임성훈", 10, 25);
		System.out.println(part.print());

	}

}
