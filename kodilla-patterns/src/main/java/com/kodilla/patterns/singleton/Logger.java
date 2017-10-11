package com.kodilla.patterns.singleton;

public class Logger {

    //dodajemy pole statyczne
    private static Logger loggerInstance = null;
    private String lastLog = "";

    //tworzymy i ukrywamy bezparametrowy konstruktor naszej klasy
    private Logger() {
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}