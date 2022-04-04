package com.example.testapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class SleepTime {

    @PostConstruct
    public String init() throws InterruptedException {
//        try {
//            File myObj = new File("test.txt");
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        try {
//            FileWriter myWriter = new FileWriter("test.txt");
//            myWriter.write("1");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//            return "Success";
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
        return "fail";
    }

    @Value("${defaultSleepTime}")
    public long sleeptime = 100;
}
