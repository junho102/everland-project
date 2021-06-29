import java.util.Scanner;
public class everlandInputProcess {
	public Scanner myInput = new Scanner(System.in);
	
	public int inputNumberOfTicket(){
		System.out.println("몇 장 구입하시겠습니까?");
		int numberOfTicket = myInput.nextInt();
		return numberOfTicket;
	}
	
	public String inputJumin(){
		System.out.println("주민번호 앞자리를 입력하세요.(숫자로만 입력)");
		String inputJunmin = myInput.next();
		return inputJunmin;
	}
	
	public int inputDate(){
		System.out.println("\n이용날짜를 입력하세요. ex)20210605");
		int inputDate = myInput.nextInt();
		return inputDate;
	}
	
	public int inputAdvantage() {
		System.out.printf("\n우대사항을 선택하세요.\n"
				+ "1.없음 (나이 우대는 자동처리)\n"
				+ "2.장애인\n"
				+ "3.국가유공자\n"
				+ "4.다자녀\n"
				+ "5.임산부\n"
				+ "번호 선택: ");
		int choice = myInput.nextInt();
		return choice;
	}
	
	
}
