package com.book.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 资源配置类<br>
 * 版权: Copyright (c) 2011-2018<br>
 * 公司: 活力天汇<br>
 *
 * @author: 孙常军<br>
 * @date: 2018-08-28<br>
 */
@Configuration
public class ResourceConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//添加错误页的资源映射
		registry.addResourceHandler("/resources/**").addResourceLocations("/templates/error/");
	}

}
