import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class everland {
	
	public static void main(String[] args) {
		everlandProcess everProcess = new everlandProcess(); 
		EverlandData everData = new EverlandData();
		everlandInputProcess inputProcess = new everlandInputProcess();
		
		do {
			while(true) {
				
				everProcess.checkDate(inputProcess.inputDate());
				
				everProcess.checkJumin(inputProcess.inputJumin());
				
				if (everProcess.ticketNum=="A" || everProcess.ticketNum=="B" 
						|| everProcess.ticketNum=="C" ) {
					everProcess.checkAdvantage(inputProcess.inputAdvantage());
					everData.checkNumberOfTicket(everProcess.ticketNum,
							everProcess.age2, everProcess.count, 
							everProcess.price, everProcess.udae,
							everProcess.myInput, inputProcess.inputNumberOfTicket());
					break;
				}
				else if (everProcess.ticketNum =="-") {				// 예약할 수 없는 날짜의 경우
					everProcess.sorry();
					break;
				}	
			}
			everProcess.addTicket();
		}while(everProcess.type==1);
	}
}
