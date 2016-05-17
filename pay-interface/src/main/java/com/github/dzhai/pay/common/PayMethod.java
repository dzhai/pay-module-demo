package com.github.dzhai.pay.common;

/**
 * 支付方式
 * 
 * @author dzhai
 *
 */
public enum PayMethod {
	/**
	 * 银联支付 1
	 */
	UNIONPAY(1, "unionpay"),
	/**
	 * 支付宝支付 2
	 */
	ALIPAY(2, "alipay"),
	/**
	 * 微信支付 3
	 */
	WECHAT(3, "wechat"),
	/**
	 * paypal支付 4
	 */
	PAYPAL(4, "paypal");

	private Integer id;
	private String name;

	private PayMethod(Integer id, String name) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static String getName(Integer id) {
		if (id == null) {
			return null;
		} else {
			for (PayMethod p : PayMethod.values()) {
				if (p.getId().equals(id)) {
					return p.getName();
				}
			}
		}
		return null;
	}

}
