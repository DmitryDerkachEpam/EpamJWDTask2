package com.epam.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.epam.entities.associatedclasses.HotelCharacteristics;
import com.epam.entities.associatedclasses.Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Voucher", propOrder = {"id", "type", "country", "numberOfDays", "transport", "hotelCharacteristics", "cost"})
@XmlSeeAlso({FamilyVoucher.class, BusinessVoucher.class})
public abstract class Voucher {
    @XmlAttribute (name = "id")
	private int id;
    @XmlElement(namespace = "test")
	private Type type;
    @XmlElement(namespace = "test")
	private String country;
    @XmlElement(namespace = "test")
	private int numberOfDays;
    @XmlElement(namespace = "test")
	private String transport;
    @XmlElement(namespace = "test")
	private HotelCharacteristics hotelCharacteristics;
    @XmlElement(namespace = "test")
	private int cost;
	
	public Voucher() {
	
	}

	public int getId() {
		return id;
	}

	public Type getType() {
		return type;
	}

	public String getCountry() {
		return country;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public String getTransport() {
		return transport;
	}

	public HotelCharacteristics getHotelCharacteristics() {
		return hotelCharacteristics;
	}

	public int getCost() {
		return cost;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public void setHotelCharacteristics(HotelCharacteristics hotelCharacteristics) {
		this.hotelCharacteristics = hotelCharacteristics;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((hotelCharacteristics == null) ? 0 : hotelCharacteristics.hashCode());
		result = prime * result + id;
		result = prime * result + numberOfDays;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Voucher other = (Voucher) obj;
		if (cost != other.cost) {
			return false;
		}
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (hotelCharacteristics == null) {
			if (other.hotelCharacteristics != null) {
				return false;
			}
		} else if (!hotelCharacteristics.equals(other.hotelCharacteristics)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (numberOfDays != other.numberOfDays) {
			return false;
		}
		if (transport == null) {
			if (other.transport != null) {
				return false;
			}
		} else if (!transport.equals(other.transport)) {
			return false;
		}
		if (type != other.type) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return  "id=" + id + ", \n" +
				"type=" + type + ", \n" +
				"country=" + country + ", \n" +
				"numberOfDays=" + numberOfDays + ", \n" +
				"transport=" + transport + ", \n" +
				"hotelCharacteristics: \n" + hotelCharacteristics.toString() + ", \n" +
				"cost=" + cost;
	}
	
}
