package com.example.soapexample.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WebRequestCommon {
    private String company;
    private String password;
    private String userName;
}
