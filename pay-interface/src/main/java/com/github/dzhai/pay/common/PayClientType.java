package com.github.dzhai.pay.common;

/**
 * 支付客户端类型  pc 移动
 * 
 * @author dzhai
 *
 */
public enum PayClientType {

	/**
	 * PC端支付
	 */
	PC(1, "unionpay"),
	/**
	 * 移动端 ios支付
	 */
	Mobile_IOS(21, "IOS"),
	/**
	 * 移动端 Android支付
	 */
	Mobile_Android(22, "Android");

	private Integer id;
	private String name;

	private PayClientType(Integer id, String name) {
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
			for (PayClientType p : PayClientType.values()) {
				if (p.getId().equals(id)) {
					return p.getName();
				}
			}
		}
		return null;
	}
}
