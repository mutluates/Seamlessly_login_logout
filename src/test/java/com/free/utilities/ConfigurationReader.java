package com.free.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();

    static {

        try{
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

        }catch (IOException e){

            System.out.println("File not fount in the ConfigurationReader class");
            e.getStackTrace();
        }

    }

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
