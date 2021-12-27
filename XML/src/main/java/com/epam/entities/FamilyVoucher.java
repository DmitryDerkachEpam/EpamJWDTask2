package com.epam.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyVoucher", propOrder = {"numOfFamilyMembers"})
public class FamilyVoucher extends Voucher {
	@XmlElement(name = "numOfFamilyMembers", namespace = "test")
	private int numOfFamilyMembers;
	
	public FamilyVoucher() {
		
	}

	public int getNumOfFamilyMembers() {
		return numOfFamilyMembers;
	}

	public void setNumOfFamilyMembers(int numOfFamilyMembers) {
		this.numOfFamilyMembers = numOfFamilyMembers;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numOfFamilyMembers;
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
		FamilyVoucher other = (FamilyVoucher) obj;
		if (numOfFamilyMembers != other.numOfFamilyMembers) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "[FamilyVoucher object: \n" + 
				super.toString() + " \n" + 
			   "numOfFamilyMembers=" + numOfFamilyMembers + "]";
	}
	
}
