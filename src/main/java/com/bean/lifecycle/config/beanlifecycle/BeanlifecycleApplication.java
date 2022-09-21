package com.bean.lifecycle.config.beanlifecycle;

import com.bean.lifecycle.config.beanlifecycle.singleton.scope.ContentFiltering;
import com.bean.lifecycle.config.beanlifecycle.singleton.scope.Movie;
import com.bean.lifecycle.config.beanlifecycle.singleton.scope.MultiFiltering;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanlifecycleApplication {

	public static  void main(String[] args){

		ApplicationContext appContextObj = SpringApplication.run(BeanlifecycleApplication.class, args);

		//  Prototype Scope
		ContentFiltering cont1 = appContextObj.getBean(ContentFiltering.class);
		ContentFiltering cont2 = appContextObj.getBean(ContentFiltering.class);
		ContentFiltering cont3 = appContextObj.getBean(ContentFiltering.class);

		System.out.println(cont1);
		System.out.println(cont2);
		System.out.println(cont3);

		// Singleton Scope
		MultiFiltering multi1 = appContextObj.getBean(MultiFiltering.class);
		MultiFiltering multi2 = appContextObj.getBean(MultiFiltering.class);
		System.out.println(multi1);
		System.out.println(multi2);

		// Proxy Inserting Prototype Bean
		ContentFiltering filter = appContextObj.getBean(ContentFiltering.class);
		System.out.println("\n Content Filter Bean with Singleton Scope");
		System.out.println(filter);

		// Retrieve and print prototype bean from the single bean thrice
		// Prototype Movie = Singleton filter.getMovie()
		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();

		System.out.println("\n Movie Bean with prototype scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);


		// Number of instances

		System.out.println("Number of Content Filter Insances: " + ContentFiltering.getInstances());
		System.out.println("Number of Movie Instances: " + Movie.getInstances());









	}


}
