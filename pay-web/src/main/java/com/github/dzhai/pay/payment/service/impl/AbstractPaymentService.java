package com.github.dzhai.pay.payment.service.impl;

import com.github.dzhai.pay.payment.service.IPaymentService;

public abstract class AbstractPaymentService implements IPaymentService {

	
	public abstract void createAfterProcess();
	
	public void createProcess(){
		
		
	}
}
