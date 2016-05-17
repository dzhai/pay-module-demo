package com.github.dzhai.pay.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentData {

	private Integer payMehtod;
	private Integer payClientType;
	private Integer paymentType;

	private String outTradeNo;
	private String subject;
	private String totalFee;
	private String showUrl;

	private String sellerId;
	private String sellerAccountName;

	private String buyerId;
	private String buyerAccountName;

	private String price;
	private String quantity;
	private String body;
	private String extraCommonParam;

}
