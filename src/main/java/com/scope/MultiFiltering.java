package com.scope;

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
