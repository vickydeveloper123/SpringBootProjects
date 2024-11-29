package Facades;

import java.util.PriorityQueue;
import java.util.Queue;

import com.entity.SupportType;

import com.utility.*;

public class DefaultHelpDeskFacade  implements HelpDeskFacade{
	
	
private Queue<SupportType> tickets;
	
	{
		tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}


	@Override
	public void addNewSupportTicket(SupportType supportTicket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SupportType getNextSupportTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfTickets() {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
