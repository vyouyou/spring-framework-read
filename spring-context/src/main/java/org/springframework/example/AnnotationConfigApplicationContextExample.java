package org.springframework.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.example.components.HelloComponent;

/**
 * @Author qishiyu
 * @create 2019/12/27 15:14
 */
@Configuration
@ComponentScan("org.springframework.example.components")
public class AnnotationConfigApplicationContextExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(AnnotationConfigApplicationContextExample.class);
//		context.scan("org.springframework.example.components");
//		context.refresh();
		HelloComponent helloComponent = (HelloComponent) context.getBean("helloComponent");
	}
}
