package com.reis.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        method();
        System.out.println("Programa continua");

    }
    public static void method1(){

    }
    public static void method(){
        System.out.println("--Method Start---");
        Scanner sc = new Scanner(System.in);
        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");

        }catch(InputMismatchException e){
            System.out.println("Input error");
        }
        System.out.println("--Method End---");
        sc.close();
    }
}
