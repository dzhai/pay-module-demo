package com.github.dzhai.pay.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentResultData extends ResultData {

	private static final long serialVersionUID = 1L;

	/**
	 * 交易号
	 */
	private String tradeNo;

	/**
	 * 生成的可用字符串
	 */
	private String content;

}
