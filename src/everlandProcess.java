import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class everlandProcess {
	public Scanner myInput = new Scanner(System.in);
	
	public String ticketNum =null;			// ��¥ �� A,B,C Ƽ�� ����
	public int price =0;
	public String udae = null;				// ��� ����
	public int age =0;
	public String age2 = null;				// ���ɺ� (���, ����, û�ҳ�, ����) ����
	public int type =0;					// �߰� ���� Ȯ��
	public int count =0;
	
	
	public Date date = new Date();
	public SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	
	public String todayDate= (dateFormat.format(date));
	public int todayYear = Integer.parseInt(todayDate.substring(0,4));
	public int todayMD = Integer.parseInt(todayDate.substring(4));

	
	public void checkJumin(String inputJunmin) {
		int juminYear = Integer.parseInt(inputJunmin.substring(0,2));
		int juminMD = Integer.parseInt(inputJunmin.substring(2,6));
		
		// �� ���� ���
		if (juminMD>todayMD && juminYear>21) {		
			age = 121-juminYear-1;
		}
		else if(juminMD<=todayMD && juminYear>21){
			age = 121-juminYear;
		}
		else if(juminMD>todayMD && juminYear<=21){
			age = 21-juminYear-1;
		}
		else if(juminMD<=todayMD && juminYear<=21){
			age = 21-juminYear;
		}
		
		// ���ɺ� (���, ����, û�ҳ�, ����) ����
		if(age>=65) {
			age2="���";
		}
		else if(age>=19 && age<=64) {
			age2="����";
		}
		else if(age>=13 && age<=18) {
			age2="û�ҳ�";
		}
		else if(age>=3 && age<=12) {
			age2="����";
		}
		else if(age<3) {
			age2="36���� �̸�";
		}
	}
	
	public void checkDate(int inputDate) {
		// ��¥ �� A,B,C Ƽ�� ����
		if(inputDate==20210701 || inputDate==20210702 || inputDate==20210705 || 
				inputDate==20210706 || inputDate==20210707 || inputDate==20210708 || 
				inputDate==20210709 || inputDate==20210712 || inputDate==20210713 || 
				inputDate==20210714 || inputDate==20210715 || inputDate==20210716 || 
				inputDate==20210719 || inputDate==20210720 || inputDate==20210721 || 
				inputDate==20210722 || inputDate==20210723 || inputDate==20210726 || 
				inputDate==20210727 || inputDate==20210728 || inputDate==20210804 || 
				inputDate==20210805 || inputDate==20210806 || inputDate==20210809 || 
				inputDate==20210810 || inputDate==20210811 || inputDate==20210812 || 
				inputDate==20210813 || inputDate==20210816 || inputDate==20210817 || 
				inputDate==20210818 || inputDate==20210819 || inputDate==20210820 || 
				inputDate==20210823 || inputDate==20210824 || inputDate==20210825 || 
				inputDate==20210826 || inputDate==20210827 || inputDate==20210830 || 
				inputDate==20210831 || inputDate==20210901 || inputDate==20210902 ) {
			ticketNum = "C";
		}
		else if(inputDate==20210703 || inputDate==20210704 || inputDate==20210710 || 
				inputDate==20210711 || inputDate==20210717 || inputDate==20210718 || 
				inputDate==20210724 || inputDate==20210725 || inputDate==20210729 || 
				inputDate==20210730 || inputDate==20210731 || inputDate==20210801 || 
				inputDate==20210802 || inputDate==20210803 || inputDate==20210807 || 
				inputDate==20210808 || inputDate==20210814 || inputDate==20210815 || 
				inputDate==20210821 || inputDate==20210822 || inputDate==20210828 || 
				inputDate==20210829 || inputDate==20210903 || inputDate==20210906 || 
				inputDate==20210907 || inputDate==20210908 || inputDate==20210909 || 
				inputDate==20210910 || inputDate==20210913 || inputDate==20210914 || 
				inputDate==20210915 || inputDate==20210916 || inputDate==20210917 || 
				inputDate==20210923 || inputDate==20210924 || inputDate==20210927 || 
				inputDate==20210928 || inputDate==20210929 || inputDate==20210930 ) {
			ticketNum = "B";
		}
		else if(inputDate==20210904 || inputDate==20210905 || inputDate==20210911 || 
				inputDate==20210912 || inputDate==20210918 || inputDate==20210919 || 
				inputDate==20210920 || inputDate==20210921 || inputDate==20210922 ||
				inputDate==20210925 ||inputDate==20210926 ) {
			ticketNum = "A";
			
		}else {
			ticketNum ="-";
		}
	}
	
	public void checkAdvantage(int choice) {
		if (choice==1) {		//��� ���� (����)
			udae = "��� ���� ����";
			if(age2=="����" || age2=="û�ҳ�") {
				if(ticketNum=="A") {
					price = 60000;
				}
				else if(ticketNum=="B") {
					price = 56000;
				}
				else if(ticketNum=="C") {
					price = 50000;
				}
			}
			else if(age2=="����" || age2=="���") {
				if(ticketNum=="A") {
					price = 48000;
				}
				else if(ticketNum=="B") {
					price = 44000;
				}
				else if(ticketNum=="C") {
					price = 40000;
				}
			}
			else if(age2=="36���� �̸�") {
				price =0;
			}
		}
		else if (choice==2) {		// ������ : �����
			udae = "����� �������";
			if(age2=="����" || age2=="û�ҳ�") {
				if(ticketNum=="A") {
					price = 36000;
				}
				else if(ticketNum=="B") {
					price = 33000;
				}
				else if(ticketNum=="C") {
					price = 30000;
				}
			}
			else if(age2=="����" || age2=="���") {
				if(ticketNum=="A") {
					price = 28000;
				}
				else if(ticketNum=="B") {
					price = 26000;
				}
				else if(ticketNum=="C") {
					price = 24000;
				}
			}
			else if(age2=="36���� �̸�") {
				price =0;
			}
		}
		else if (choice==3) {		// ������ : ����������
			udae = "���������� �������";
			if(age2=="����" || age2=="û�ҳ�") {
				if(ticketNum=="A") {
					price = 30000;
				}
				else if(ticketNum=="B") {
					price = 28000;
				}
				else if(ticketNum=="C") {
					price = 25000;
				}
			}
			else if(age2=="����" || age2=="���") {
				if(ticketNum=="A") {
					price = 24000;
				}
				else if(ticketNum=="B") {
					price = 22000;
				}
				else if(ticketNum=="C") {
					price = 20000;
				}
			}
			else if(age2=="36���� �̸�") {
				price =0;
			}
		}
		else if (choice==4) {		// ������ : ���ڳ�
			udae = "���ڳ� �������";
			if(age2=="����" || age2=="û�ҳ�") {
				if(ticketNum=="A") {
					price = 48000;
				}
				else if(ticketNum=="B") {
					price = 44000;
				}
				else if(ticketNum=="C") {
					price = 40000;
				}
			}
			else if(age2=="����" || age2=="���") {
				if(ticketNum=="A") {
					price = 38000;
				}
				else if(ticketNum=="B") {
					price = 35000;
				}
				else if(ticketNum=="C") {
					price = 32000;
				}
			}
			else if(age2=="36���� �̸�") {
				price =0;
			}
		}
		else if (choice==5) {		// ������ : �ӻ��
			udae = "�ӻ�� �������";
			if(age2=="����") {
				if(ticketNum=="A") {
					price = 51000;
				}
				else if(ticketNum=="B") {
					price = 47000;
				}
				else if(ticketNum=="C") {
					price = 42000;
				}
			}
		}
	}

	
	public void sorry() {
		System.out.println("\n�˼��մϴ�. ������ �� ���� ��¥�Դϴ�."); 
		System.out.println("\n============================");
	}
	
	public void addTicket() {
		System.out.printf("\n�߰� �����Ͻðڽ��ϱ�? (1.�߰�, 2.����)");
		type = myInput.nextInt();
	}
	
}
