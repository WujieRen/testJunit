package com.overview.testjunit_2;

/**
 * Created by renwujie on 2017/12/15 at 11:10
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
