package com.main;
import com.business.DebugLogProcessor;
import com.business.ErrorLogProcessor;
import com.business.InfoLogProcessor;
import com.business.LogProcessor;

public class main_Class {

    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));


        //Request
        logObject.log(LogProcessor.ERROR, "Exception Happens");
        logObject.log(LogProcessor.DEBUG, "Need to Debug This");
        logObject.log(LogProcessor.INFO, "Just for Info");
    }

}
