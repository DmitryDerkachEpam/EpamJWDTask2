package com.epam.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessVoucher", propOrder = {"numOfMeetings"})
public class BusinessVoucher extends Voucher{
	@XmlElement(name = "numOfMeetings", namespace = "test")
	private int numOfMeetings;
	
	public BusinessVoucher() {
		
	}

	public int getNumOfMeetings() {
		return numOfMeetings;
	}

	public void setNumOfMeetings(int numOfMeetings) {
		this.numOfMeetings = numOfMeetings;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numOfMeetings;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		BusinessVoucher other = (BusinessVoucher) obj;
		if (numOfMeetings != other.numOfMeetings) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "[BusinessVoucher object: \n" + 
				super.toString() + " \n" + 
			   "numOfMeetings=" + numOfMeetings + "]";
	}

	
	
}
