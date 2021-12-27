package com.epam.entities.associatedclasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "type")
@XmlEnum
public enum Type {
	@XmlEnumValue("Business")
	BUSINESS,
	@XmlEnumValue("Weekend")
	WEEKEND
}
