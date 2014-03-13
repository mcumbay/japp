package com.dfwcomputech.japp.contractmodel;

import javax.jws.WebResult;
import javax.jws.WebService;

import com.dfwcomputech.japp.contractmodel.data.UserSession;

@WebService(targetNamespace="http://remotecontract.japp.dfwcomputech.com")
public interface MyWebService {
	@WebResult(name="loginResponse")
	UserSession login(String user,String password);
}
