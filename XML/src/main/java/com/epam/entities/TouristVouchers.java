package com.epam.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "touristVouchers", namespace = "test")
@XmlAccessorType(XmlAccessType.FIELD)
public class TouristVouchers {

	@XmlElements({
		@XmlElement(name = "familyVoucher", namespace = "test", type = FamilyVoucher.class),
		@XmlElement(name = "businessVoucher", namespace = "test", type = BusinessVoucher.class),
	})
	private List<Voucher> listOfVouchers = new ArrayList<>();
	
	public TouristVouchers() {
		
	}

	public List<Voucher> getListOfVouchers() {
		return listOfVouchers;
	}

	public void setListOfVouchers(List<Voucher> listOfVouchers) {
		this.listOfVouchers = listOfVouchers;
	}
	
    public boolean add(Voucher voucher) {
        return listOfVouchers.add(voucher);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfVouchers == null) ? 0 : listOfVouchers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TouristVouchers other = (TouristVouchers) obj;
		if (listOfVouchers == null) {
			if (other.listOfVouchers != null) {
				return false;
			}
		} else if (!listOfVouchers.equals(other.listOfVouchers)) {
			return false;
		}
		return true;
	}

    
	
}
