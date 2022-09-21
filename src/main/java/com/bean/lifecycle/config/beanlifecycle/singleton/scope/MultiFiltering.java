package com.bean.lifecycle.config.beanlifecycle.singleton.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MultiFiltering implements  Filter{

    public MultiFiltering(){
        super();
    }

    public String[] getMovies(String movie) {
        return new String[]{"Ice Age", "Toy Story", "Evil Dead"};
    }
}
