import java.util.Scanner;
public class everlandInputProcess {
	public Scanner myInput = new Scanner(System.in);
	
	public int inputNumberOfTicket(){
		System.out.println("�� �� �����Ͻðڽ��ϱ�?");
		int numberOfTicket = myInput.nextInt();
		return numberOfTicket;
	}
	
	public String inputJumin(){
		System.out.println("�ֹι�ȣ ���ڸ��� �Է��ϼ���.(���ڷθ� �Է�)");
		String inputJunmin = myInput.next();
		return inputJunmin;
	}
	
	public int inputDate(){
		System.out.println("\n�̿볯¥�� �Է��ϼ���. ex)20210605");
		int inputDate = myInput.nextInt();
		return inputDate;
	}
	
	public int inputAdvantage() {
		System.out.printf("\n�������� �����ϼ���.\n"
				+ "1.���� (���� ���� �ڵ�ó��)\n"
				+ "2.�����\n"
				+ "3.����������\n"
				+ "4.���ڳ�\n"
				+ "5.�ӻ��\n"
				+ "��ȣ ����: ");
		int choice = myInput.nextInt();
		return choice;
	}
	
	
}
