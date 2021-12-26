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

	public boolean isAvailable() {
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
	public String toString() {
		return "		[MealsIncludedData: \n" +
			   "		available=" + available + ", \n" + 
			   "		mealType=" + mealType + "]";
	} 
	
}
