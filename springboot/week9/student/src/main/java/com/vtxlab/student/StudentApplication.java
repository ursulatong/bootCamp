package com.vtxlab.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication // =
// @SpringBootConfiguration (@Configuration) + // it try to find any bean in
// spring container
// @ComponentScan +
// @EnableAutoConfiguration (TBC)
// @Configuration // 一起機既時候自動config 同一level既file 成BEAN (e.g service, controller,
// entity)

@Slf4j
public class StudentApplication {

	private static ConfigurableApplicationContext applicationContext;

	// @Bean(name = "beanForVincent")
	// public Student getVincent() {
	// return new Student(1l, 150.0d, "vincent.lau");
	// }

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(StudentApplication.class, args);
		displayAllBeans();
	}

	public static void displayAllBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for (String s : allBeanNames) {
			log.info("Bean={}", s);
		}
	}

}
