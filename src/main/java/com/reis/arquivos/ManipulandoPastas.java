package com.reis.arquivos;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory); //lista somente quem é pasta
        System.out.println("Folders: ");
        for(File folder: folders){
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile); // lista somente arquivos
        System.out.println("Files: ");
        for(File file: files){
            System.out.println(file);
        }
        //criar uma subpasta
        boolean sucess = new File(strPath + "\\subPasta").mkdir ();
        System.out.println("Diretorio criado " + sucess);
    }
}
