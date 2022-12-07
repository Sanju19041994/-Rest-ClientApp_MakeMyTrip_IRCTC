package com.Bit.MakeMyTrip.service;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.client.RestTemplate;
import com.Bit.MakeMyTrip.responce.Passanger;
import com.Bit.MakeMyTrip.responce.Ticket;

@Service
public class PassangerServiceImpl implements PassangerServiceI {

	@Override
	public Ticket bookTicket(Passanger psg) {
		System.out.println(psg);
		String url = "http://localhost:9192/bookTicket";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> postForEntity = rt.postForEntity(url, psg, Ticket.class);
		Ticket ticket = postForEntity.getBody();
		return ticket;
	}

	@Override
	public Ticket bookTicketByWebClient(Passanger psg) {
		WebClient webClient = WebClient.create();
		String url = "http://localhost:9192/bookTicket";
		Ticket ticket = webClient.post()
		          .uri(url)
		          .contentType(MediaType.APPLICATION_JSON)
		          .accept(MediaType.APPLICATION_JSON)
		          .body(BodyInserters.fromValue(psg))
		          .retrieve()
		          .bodyToMono(Ticket.class)
		          .block();
		return ticket;
	}

	

}
