package com.scope;

import com.scope.Filter;
import com.scope.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContentFiltering implements Filter {


    private static int instances;
    @Autowired
    private Movie movie;

    public ContentFiltering(){
        super();
        instances++;
        System.out.println("Content Filter Constructor Called");
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return instances;
    }

    public String[] getMovies(String movie){
        return new String[]{"Italain Job","Mission Impossible", "MI3"};
    }


}
