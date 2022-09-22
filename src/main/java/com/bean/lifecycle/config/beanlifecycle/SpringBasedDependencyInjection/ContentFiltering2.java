package com.bean.lifecycle.config.beanlifecycle.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF2")
public class ContentFiltering2 implements Filter {
    public String[] getRecommendations(String movie){


        return new String[]{"Italain Job","Mission Impossible", "MI3"};
    }
}
