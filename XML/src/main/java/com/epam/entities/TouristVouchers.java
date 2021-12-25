package com.epam.entities;

import java.util.ArrayList;
import java.util.List;

public class TouristVouchers {

	private List<Voucher> listOfVouchers = new ArrayList();
	
	public TouristVouchers() {
		
	}

	public List<Voucher> getListOfVouchers() {
		return listOfVouchers;
	}

	public void setListOfVouchers(List<Voucher> listOfVouchers) {
		this.listOfVouchers = listOfVouchers;
	}
	
}
