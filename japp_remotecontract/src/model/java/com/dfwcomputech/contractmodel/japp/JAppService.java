package com.dfwcomputech.contractmodel.japp;

import javax.jws.WebResult;
import javax.jws.WebService;

import com.dfwcomputech.contractmodel.japp.data.JAppUser;

/**
 * Web Service Sample
 * @autor mcumbay
 * */
@WebService(targetNamespace="http://remotecontract.japp.dfwcomputech.com")
public interface JAppService {
	@WebResult(name="getCurrentUserResponse")
	JAppUser getCurrentUser();
}
