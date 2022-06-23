package com.example.archive;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerConfigurator {
    private static Logger logger = Logger.getLogger(LoggerConfigurator.class);

    public static void main(String[] args){
        PropertyConfigurator.configure("C:\\TestPJRepo\\KafkaTest\\archive\\src\\main\\resources\\log4j.properties");
    }
}