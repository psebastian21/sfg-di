package com.psebastian21.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.psebastian21.sfgdi.controller.I18nController;
import com.psebastian21.sfgdi.controller.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		var i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		var myController = (MyController)ctx.getBean("myController");
		var greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
