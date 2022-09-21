package com.bean.lifecycle.config.beanlifecycle.scopes;

import org.springframework.stereotype.Component;

@Component
public class ScopeCheck {
    // Members
    int a = 10;

    public void add(int a, int b){
        int c;

        try {

        }catch (Exception e){

        }

    }

}

// Member Variable Scope => Class Scope Check
// Method Parameter Scope =>  add()
// Exception Handler Parameter Scope =>  try{} catch
// Local Variable Scope => int c
