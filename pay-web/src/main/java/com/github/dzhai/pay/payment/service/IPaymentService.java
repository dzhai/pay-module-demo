package com.github.dzhai.pay.payment.service;

import com.github.dzhai.pay.dto.PaymentResultData;

public interface IPaymentService {

	PaymentResultData paycreate();

	void pay();

	void refund();

	void paynotify();

	void payreturn();
}
