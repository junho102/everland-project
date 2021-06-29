import java.util.ArrayList;
import java.util.Scanner;

public class EverlandData {
	
	public ArrayList<String> arrTicketNum = new ArrayList<String>();
	public ArrayList<String> arrAge2 = new ArrayList<String>();
	public ArrayList<Integer> arrNumberOfTicket = new ArrayList<Integer>();
	public ArrayList<Integer> arrFinalPrice = new ArrayList<Integer>();
	public ArrayList<String> arrUdae = new ArrayList<String>();
	public int allFinalPrice;
	
	public void inputNumberOfTicket(String ticketNum,
			String age2, int count, int price, String udae,
			Scanner myInput) {
		System.out.println("몇 장 구입하시겠습니까?");
		int numberOfTicket = myInput.nextInt();
		arrTicketNum.add(ticketNum);
		arrAge2.add(age2);
		arrNumberOfTicket.add(numberOfTicket);
		arrFinalPrice.add(price*numberOfTicket);
		arrUdae.add(udae);
		
		allFinalPrice += (price*numberOfTicket);
		
		System.out.printf("\n가격은 %d원 입니다.",price*numberOfTicket);
		System.out.printf("\n감사합니다.\n");
		System.out.println();
		System.out.print("==================에버랜드==================");
		for(int index=0; index<arrNumberOfTicket.size(); index++) {
			
			System.out.printf("\n%s  %s x %d\t%d원\t   *%s",
					arrTicketNum.get(index),arrAge2.get(index),
					arrNumberOfTicket.get(index),
					arrFinalPrice.get(index),arrUdae.get(index));
		}
		System.out.print("\n=========================================\n");
		
		
		System.out.printf("\t\t\t\t총%d원\n",allFinalPrice);
		System.out.print("=========================================\n");
	}
	
}
