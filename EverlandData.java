import java.util.ArrayList;
import java.util.Scanner;

public class EverlandData {
	
//	public ArrayList<String> arrTicketNum = new ArrayList<String>();
//	public ArrayList<String> arrAge2 = new ArrayList<String>();
//	public ArrayList<Integer> arrNumberOfTicket = new ArrayList<Integer>();
//	public ArrayList<Integer> arrFinalPrice = new ArrayList<Integer>();
//	public ArrayList<String> arrUdae = new ArrayList<String>();
	public ArrayList<DataClass> arrData = new ArrayList<DataClass>();
	
	public int allFinalPrice;
	
	public void checkNumberOfTicket(String ticketNum,
			String age2, int count, int price, String udae,
			Scanner myInput, int numberOfTicket) {
		DataClass item = new DataClass();
		item.ticketNum = ticketNum;
		item.age2 = age2;
		item.count = count;
		item.price = price;
		item.udae = udae;
		item.myInput = myInput;
		item.numberOfTicket = numberOfTicket;
		arrData.add(item);
//		arrData.add(new DataClass(ticketNum,
//			age2, count, price, udae,
//			myInput, numberOfTicket));
//		arrTicketNum.add(ticketNum);
//		arrAge2.add(age2);
//		arrNumberOfTicket.add(numberOfTicket);
//		arrFinalPrice.add(price*numberOfTicket);
//		arrUdae.add(udae);
		
		allFinalPrice += (price*numberOfTicket);
		System.out.println(allFinalPrice);
		System.out.printf("\n������ %d�� �Դϴ�.",price*numberOfTicket);
		System.out.printf("\n�����մϴ�.\n");
		System.out.println();
		System.out.print("==================��������==================");
		for(int index=0; index<arrData.size(); index++) {
			
			System.out.printf("\n%s  %s x %d\t%d��\t   *%s",
					arrData.get(index).ticketNum, arrData.get(index).age2,
					arrData.get(index).numberOfTicket,
					arrData.get(index).price*numberOfTicket ,arrData.get(index).udae);
		}
		System.out.print("\n=========================================\n");
		
		
		System.out.printf("\t\t\t\t��%d��\n",allFinalPrice);
		System.out.print("=========================================\n");
	}
	
}
