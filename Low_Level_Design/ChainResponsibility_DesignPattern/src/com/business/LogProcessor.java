package com.business;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 1;
    public static int ERROR = 1;


    LogProcessor newLogProcessor;

    public LogProcessor(LogProcessor newLogProcessor){
        this.newLogProcessor = newLogProcessor;
    }

    public void log(int logLlevel, String message){
        if(newLogProcessor != null){
            newLogProcessor.log(logLlevel, message);
        }
    }

}
