package com.Bit.MakeMyTrip.responce;

public class Ticket {

	private int id;

	private double pnr;

	private String ticketStatus;

	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPnr() {
		return pnr;
	}

	public void setPnr(double pnr) {
		this.pnr = pnr;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", pnr=" + pnr + ", ticketStatus=" + ticketStatus + ", price=" + price + "]";
	}
	
	
}
