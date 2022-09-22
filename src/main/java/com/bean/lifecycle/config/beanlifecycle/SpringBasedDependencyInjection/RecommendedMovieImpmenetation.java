package com.bean.lifecycle.config.beanlifecycle.SpringBasedDependencyInjection;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

@Component
public class RecommendedMovieImpmenetation {

//    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());




    private Filter filter ;

    @Autowired
    @Qualifier("CF2")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }



    @PostConstruct
    public void databaseConnection(){
//        logger.info("Running this method first before any bean methods");
        System.out.println("Running this method first before any bean methods in MongoDB");

    }

    @PreDestroy
    public void disconnecDatabase(){
        System.out.println("Discconnect the database or clean up the code");
    }

    public String [] recommendMovie(String movie){
        System.out.println("Checking the filter names in usage:" + filter + "\n");

        String[] resultMovies = filter.getRecommendations("ET");

        return resultMovies;


    }



}
