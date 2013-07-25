package com.dfwcomputech.contractmodel.japp.data;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {})
public class JAppUser {
	private String userName;
	private String password;
	private String name;
	private String lastName;
	private String email;
	private String phone;
}
