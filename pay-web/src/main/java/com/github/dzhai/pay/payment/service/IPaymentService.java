package com.github.dzhai.pay.payment.service;

public interface IPaymentService {

	void createProcess();

	void payProcess();

	void refundProcess();

	void notifyProcess();

	void returnProcess();
}
