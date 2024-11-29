package com.utility;

import java.util.Comparator;

import  com.entity.*;

public class CustomSupportTicketComparator implements Comparator<SupportType> {
	@Override
	public int compare(SupportType ticket1, SupportType ticket2) {
		if (ticket1 == null || ticket2 == null || ticket1.getPriority() == null ||  
				ticket2.getPriority() == null) {
			return 0;
		}
		
		int result = ticket2.getPriority().compareTo(ticket1.getPriority());
		if (result == 0) {
			result = ticket1.getSequentialNumber() - ticket2.getSequentialNumber();
		}
		return result;
	}

}
