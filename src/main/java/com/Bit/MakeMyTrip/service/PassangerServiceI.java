package com.Bit.MakeMyTrip.service;

import com.Bit.MakeMyTrip.responce.Passanger;
import com.Bit.MakeMyTrip.responce.Ticket;

public interface PassangerServiceI {

	public Ticket bookTicket(Passanger psg);
	
	public Ticket bookTicketByWebClient(Passanger psg);
}
