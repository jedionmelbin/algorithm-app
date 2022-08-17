package com.jedionmelbin.algorithmapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorithmAppApplication {

    public static void main(String[] args) {
        double value = 3;
        double value2 = 5;
        for (int i=1; i < 100;i++){
            double multiple = i / value;
            double multiple2 = i / value2;
            if (isInteger(multiple)){
                System.out.println("VIN");
            }else if (isInteger(multiple2)){
                System.out.println("CLE ");
            }else{
                System.out.println("VINCLE");
            }
        }
        SpringApplication.run(AlgorithmAppApplication.class, args);
    }

   public static boolean isInteger(double number) {
        return number % 1 == 0;
    }

}
