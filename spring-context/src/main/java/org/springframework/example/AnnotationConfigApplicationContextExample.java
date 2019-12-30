package org.springframework.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.example.components.HelloComponent;

/**
 * @Author qishiyu
 * @create 2019/12/27 15:14
 */
public class AnnotationConfigApplicationContextExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.springframework.example.components");
		context.refresh();
		HelloComponent helloComponent = (HelloComponent) context.getBean("helloComponent");
	}
}
