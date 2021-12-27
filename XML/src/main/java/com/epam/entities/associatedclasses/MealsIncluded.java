package com.epam.entities.associatedclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealsIncluded", propOrder = {"available", "mealType"})
public class MealsIncluded {
	@XmlAttribute(name = "available")
	private boolean available;
	@XmlElement(name = "mealType", namespace = "test")
	private MealType mealType;
	
	public MealsIncluded(boolean available, MealType mealType) {
		this.available = available;
		this.mealType = mealType;
	}
	
	public MealsIncluded() {
		
	}

	public boolean getAvailable() {
		return available;
	}

	public MealType getMealType() {
		return mealType;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setMealType(MealType mealType) {
		this.mealType = mealType;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (available ? 1231 : 1237);
		result = prime * result + ((mealType == null) ? 0 : mealType.hashCode());
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
		MealsIncluded other = (MealsIncluded) obj;
		if (available != other.available) {
			return false;
		}
		if (mealType != other.mealType) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "		[MealsIncludedData: \n" +
			   "		available=" + available + ", \n" + 
			   "		mealType=" + mealType + "]";
	} 
	
}
