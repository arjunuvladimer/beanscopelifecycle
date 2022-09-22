package com.bean.lifecycle.config.beanlifecycle.callbacks;

public class CallBackCheck {
    public static void main(String[] args) throws Exception{

        new CallBackCheck().someMethod(new Callback() {
            @Override
            public void call(){
                System.out.println("Callback Check");
            }
        }); // Function Defintion passing it as a parameter to someMethod
    } // Functional Call of someMethod
    public void someMethod(Callback callback){
        // Step 1
        System.out.println("Hello World");
        // Step 2
        callback.call(); // Functional Call
    }

    public interface Callback{
        void call();
    }
}
