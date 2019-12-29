package org.springframework.example.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author qishiyu
 * @create 2019/12/27 15:14
 */
@Component
public class HelloComponent {
	@Autowired
	private ThankYouComponent thankYouComponent;

	public HelloComponent(){
		System.out.println("hello");
	}

}
