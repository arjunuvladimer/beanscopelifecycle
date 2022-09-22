package com.bean.lifecycle.config.beanlifecycle.lifecycleprototypescopedbeans;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ContentFilter2 implements  Filter{
    public ContentFilter2(){
        super();
        System.out.println("In Content Filter constructor method");
    }

    @PostConstruct
    private void checkingPostConstructor(){
        System.out.println("In Content Filter Post Constructor Method");
    }

    @PreDestroy
    private void checkingPreDestroy(){
        System.out.println("In Content Filter Pre Destory Method");
    }


    @Override
    public String[] getRecommendations() {
        return new String[]{"MI1","MI2","MI3","MI4"};
    }
}
