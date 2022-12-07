package com.Bit.MakeMyTrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bit.MakeMyTrip.responce.Passanger;
import com.Bit.MakeMyTrip.responce.Ticket;
import com.Bit.MakeMyTrip.service.PassangerServiceI;

@RestController
public class PassengerController {

	@Autowired
	private PassangerServiceI passangerServiceI;
	
	/**
	 * @author Sanju
	 * @param psg
	 * @return
	 * @since 1.0
	 * @apiNote : bookTicket by RestTemplate
	 */
	
	@PostMapping(value = "/mytBookTicket" , produces = "application/json", 
			                                consumes = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg){
		Ticket bookedTicket = passangerServiceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(bookedTicket,HttpStatus.CREATED);
	}
	
	/**
	 * @author Sanju
	 * @param psg
	 * @return
	 * @since 1.0
	 * @apiNote : bookTicket by webClient
	 */
	
	@PostMapping(value = "bookTicketByWebClient", 
			           produces = "application/json", consumes = "application/json")
	public ResponseEntity<Ticket> bookTicketByWebClient(@RequestBody Passanger psg){
		Ticket ticketByWebClient = passangerServiceI.bookTicketByWebClient(psg);
		return new ResponseEntity<Ticket>(ticketByWebClient, HttpStatus.CREATED);
	}
}
