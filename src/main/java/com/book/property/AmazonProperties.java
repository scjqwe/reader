package com.book.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Amazon属性配置类<br>
 * 版权：Copyright (c) 2015-2018<br>
 * 作者：孙常军<br>
 * 版本：1.0<br>
 * 创建日期：2018/8/20<br>
 */
@Component
@ConfigurationProperties("amazon")
public class AmazonProperties {

	private String associateId;

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}

	public String getAssociateId() {
		return associateId;
	}
}
