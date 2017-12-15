package com.overview.executiontest_6;

/**
 * Created by renwujie on 2017/12/15 at 14:57
 */
/*
* This class prints the given message on console.
*/
public class MessageUtil {

    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
