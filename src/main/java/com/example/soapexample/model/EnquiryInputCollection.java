package com.example.soapexample.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnquiryInputCollection {
    private String columnName;
    private int criteriaValue;
    private String operand;
}
