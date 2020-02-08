package org.springframework.example.components;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.example.factorybeans.IExampleFactory;
import org.springframework.stereotype.Component;

/**
 * @Author qishiyu
 * @create 2019/12/27 15:14
 */
@Component
public class HelloComponent implements InitializingBean {
	@Autowired(required = false)
	private ThankYouComponent thankYouComponent;
	@Autowired
	private IExampleFactory factory;

	public HelloComponent() {
		System.out.println("hello");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("hello,after properties set");
		thankYouComponent.say();
	}
}
