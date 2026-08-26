package com.reis.arquivos;

import java.io.*;

public class Dois {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\file.txt";
        String text = "oioi, zap zap";
        try{
            new FileWriter(text, true);
        }catch(IOException e){
            e.getMessage();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Erro: " + e.getMessage());

        }
    }
}
