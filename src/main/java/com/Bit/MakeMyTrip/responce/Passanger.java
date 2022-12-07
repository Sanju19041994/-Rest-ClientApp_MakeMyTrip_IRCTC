package com.Bit.MakeMyTrip.responce;

public class Passanger {

private int pId;
	
	private String fName;
	
	private String lName;
	
	private String jFrom;
	
	private String jTo;
	
	private String dOj;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getjFrom() {
		return jFrom;
	}

	public void setjFrom(String jFrom) {
		this.jFrom = jFrom;
	}

	public String getjTo() {
		return jTo;
	}

	public void setjTo(String jTo) {
		this.jTo = jTo;
	}

	public String getdOj() {
		return dOj;
	}

	public void setdOj(String dOj) {
		this.dOj = dOj;
	}

	@Override
	public String toString() {
		return "Passanger [pId=" + pId + ", fName=" + fName + ", lName=" + lName + ", jFrom=" + jFrom + ", jTo=" + jTo
				+ ", dOj=" + dOj + "]";
	}
	
	
}
