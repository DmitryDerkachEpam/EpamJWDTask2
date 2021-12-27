package com.epam.entities.associatedclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelCharacteristics", propOrder = {"numOfStars", "mealsIncluded", "roomType"})
public class HotelCharacteristics {
	@XmlElement(name = "numberOfStars", namespace = "test")
	private int numOfStars;
	@XmlElement(name = "mealsIncluded", namespace = "test")
	private MealsIncluded mealsIncluded;
	@XmlElement(name = "roomType", namespace = "test")
	private RoomType roomType;
	
	public HotelCharacteristics() {
		
	}

	public int getNumOfStars() {
		return numOfStars;
	}

	public MealsIncluded getMealsIncluded() {
		return mealsIncluded;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setNumOfStars(int numOfStars) {
		this.numOfStars = numOfStars;
	}

	public void setMealsIncluded(MealsIncluded mealsIncluded) {
		this.mealsIncluded = mealsIncluded;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mealsIncluded == null) ? 0 : mealsIncluded.hashCode());
		result = prime * result + numOfStars;
		result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
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
		HotelCharacteristics other = (HotelCharacteristics) obj;
		if (mealsIncluded == null) {
			if (other.mealsIncluded != null) {
				return false;
			}
		} else if (!mealsIncluded.equals(other.mealsIncluded)) {
			return false;
		}
		if (numOfStars != other.numOfStars) {
			return false;
		}
		if (roomType != other.roomType) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return  "   	[HotelCharacteristicsData: \n" + 
				"	numOfStars=" + numOfStars + ", \n" + 
				"	mealsIncluded: \n" + mealsIncluded.toString() + ", \n" +
				"	roomType=" + roomType + "]";
	}
	
	
	
}
