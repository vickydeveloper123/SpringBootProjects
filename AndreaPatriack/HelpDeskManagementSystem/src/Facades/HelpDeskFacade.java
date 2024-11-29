package Facades;

import com.entity.SupportType;

public interface HelpDeskFacade {
	
void addNewSupportTicket(SupportType supportTicket);
	
	SupportType getNextSupportTicket();

	int getNumberOfTickets();

	/**
	 * @return amount of tickets that are not processed
	 */

}
