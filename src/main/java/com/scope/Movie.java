package com.scope;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    private static int instances;

    private int id;
    private String fname;
    private String genre;
    private String director;

    public Movie(){
        super();
        instances++;

        System.out.println("Movie Constructor Called");

    }

    @PostConstruct
    public void checkPrototypePostConstruct(){
        logger.info("Inside Movie post construct method");
    }

    @PreDestroy
    public void checkPreDestroy(){
        logger.info("Inside Movie pre destroy method");
    }
    public static int getInstances() {
        return instances;
    }

    public double movieSimilarity(int movie1, int movie2){
        double similarity = 0.0;

        return similarity;
    }
}
