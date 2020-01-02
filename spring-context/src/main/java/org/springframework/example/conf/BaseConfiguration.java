package org.springframework.example.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.example.beans.ConfigBean;

@Configuration
public class BaseConfiguration {
	@Bean
	public ConfigBean getConfigBean(){
		return new ConfigBean();
	}

}
