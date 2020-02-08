package org.springframework.example.factorybeans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.example.components.ThankYouComponent;
import org.springframework.stereotype.Component;

/**
 * @Author qishiyu
 * @create 2020/1/31 17:35
 */
@Component
public class ExampleFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new ExampleFactory();
	}

	@Override
	public Class<?> getObjectType() {
		return IExampleFactory.class;
	}
}
