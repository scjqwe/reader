package com.book.config;

import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryCustomizer;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * 错误页面配置<br>
 * 版权: Copyright (c) 2011-2018<br>
 * 公司: 活力天汇<br>
 *
 * @author: 孙常军<br>
 * @date: 2018-08-20<br>
 */
@Configuration
public class ErrorPageConfig {

	@Bean
	public ErrorPageRegistrar errorPageRegistrar() {
		return new DefaultErrorPageRegistrar();
	}

	/**
	 * 错误页面注册类
	 */
	class DefaultErrorPageRegistrar implements ErrorPageRegistrar {
		@Override
		public void registerErrorPages(ErrorPageRegistry registry) {
			registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
			registry.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html"));
		}
	}
}
